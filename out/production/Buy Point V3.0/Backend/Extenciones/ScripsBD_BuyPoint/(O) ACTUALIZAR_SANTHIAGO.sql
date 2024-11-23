USE BD_BuyPoint
GO
CREATE OR ALTER PROCEDURE pa_leerProducto(
@codigo VARCHAR(30)
)
AS
BEGIN
	SELECT	P.NombreProducto, 
			P.Descripcion,
			CP.NombreCategoria,
			E.TipoEmpaque,
			P.Precio,
			I.PrecioCosto,
			I.Stock
	FROM Producto AS P
	INNER JOIN Empaque AS E ON E.ID_Empaque = P.ID_Empaque
	INNER JOIN Inventario AS I ON  I.ID_Inventario = P.ID_Inventario
	INNER JOIN CategoriaProducto AS CP ON CP.ID_CategoriaProducto = P.ID_CategoriaProducto
	WHERE ID_Producto = dbo.fn_extraerID_Producto_CodigoBarras (@codigo)
END
GO
CREATE OR ALTER PROCEDURE pa_registrarCodigo(
@codigo VARCHAR(30),
@nombreproducto VARCHAR(30)
--@id_producto INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Codigo(Codigo,
							ID_Producto
							)
			VALUES	(
					@codigo,
						(
							SELECT ID_Producto
							FROM Producto
							WHERE NombreProducto = @nombreproducto
						)
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarCodigo'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO
CREATE OR ALTER PROCEDURE paT_registrarPaqueteProducto(
@cantidad INT,
@fechacaducidad DATE,
@codigo VARCHAR(30)--@id_producto INT
)
AS
BEGIN
	BEGIN TRANSACTION
	BEGIN TRY
		DECLARE @id_prod INT = dbo.fn_extraerID_Producto_CodigoBarras (@codigo);

		INSERT INTO PaqueteProducto(
							Cantidad,
							FechaCaducidad,
							ID_Producto
							)
			VALUES	(
					@cantidad,
					@fechacaducidad,
					@id_prod
					)
		UPDATE Inventario
		SET	Stock = Stock+@cantidad
		WHERE ID_Inventario = @id_prod

		COMMIT TRANSACTION;
	END TRY
	BEGIN CATCH
		IF XACT_STATE() <> 0 BEGIN
			ROLLBACK TRANSACTION;
		END
		PRINT 'ERROR EN pa_registrarPaqueteProducto'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO
CREATE OR ALTER PROCEDURE paT_registrarClienteCompuesto(
@cliente VARCHAR(50),
@identificacion VARCHAR(30),
@torre SMALLINT,
@departamento SMALLINT,
@nombre VARCHAR(20),
@apellido VARCHAR(20)
)
AS
BEGIN
	BEGIN TRANSACTION
		BEGIN TRY
			DECLARE @id_depa INT;
			DECLARE @id_cuen INT;

			SELECT @id_depa = ID_Departamento
			FROM Departamento
			WHERE Torre = @torre AND Departamento = @departamento

			SELECT @id_cuen = ID_Cuenta
			FROM Cuenta
			WHERE Nombre = @nombre AND Apellido = @apellido

			IF (@cliente IS NULL AND
				@id_depa IS NULL AND
				@id_cuen IS NULL AND
				@identificacion IS NULL) BEGIN

					RAISERROR (' Al menos una columna debe tener un valor distinto de NULL.', 16, 1);
					RETURN;
			END
			EXEC pa_registrarCliente 
								@cliente,
								@id_depa,
								@id_cuen,
								@identificacion;
			
	COMMIT TRANSACTION;
		END TRY
		BEGIN CATCH
			IF XACT_STATE() <> 0 BEGIN
				ROLLBACK TRANSACTION;
			END

			PRINT 'Ocurrió un error. La transacción ha sido revertida.';
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
		END CATCH
END
GO

CREATE OR ALTER PROCEDURE paT_registrarComprobanteCompuesto(
@comprobante VARCHAR(20),
@tipopago VARCHAR(20)
)
AS
BEGIN
	BEGIN TRANSACTION
		BEGIN TRY
			DECLARE @id_tipopago INT;

			SELECT @id_tipopago = ID_TipoPago
			FROM TipoPago
			WHERE TipoPago = @tipopago

			EXEC pa_registrarComprobante
										@comprobante,
										@id_tipopago;
			
	COMMIT TRANSACTION;
		END TRY
		BEGIN CATCH
			IF XACT_STATE() <> 0 BEGIN
				ROLLBACK TRANSACTION;
			END

			PRINT 'Ocurrió un error. La transacción ha sido revertida.';
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
		END CATCH
END
GO