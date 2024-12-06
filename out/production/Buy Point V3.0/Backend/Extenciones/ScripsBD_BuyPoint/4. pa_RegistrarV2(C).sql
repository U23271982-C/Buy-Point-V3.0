USE BD_BuyPoint
GO
CREATE OR ALTER PROCEDURE pa_registrarCategoriaProducto(
@nombreCategoriaProducto VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO CategoriaProducto(NombreCategoria)
			VALUES (@nombreCategoriaProducto)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarCategoriaProducto'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarCliente(
@cliente VARCHAR(50),
--@torre INT,
--@departamento INT,
@id_departamento INT,
--@nombrecuenta VARCHAR(20),
@id_cuenta INT,
@identificacion VARCHAR(30)
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Cliente(
							Cliente,
							ID_Departamento,
							ID_Cuenta,
							Identificacion
							)
			VALUES	(
					@cliente,
					@id_departamento,
					@id_cuenta,
					@identificacion
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarCliente'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarDepartamento(
@torre SMALLINT,
@departamento SMALLINT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Departamento(Torre,
							Departamento)
			VALUES	(@torre,
					@departamento
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarDepartamento'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarCuenta(
@nombre VARCHAR(20),
@apellido VARCHAR(20),
@telefono INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Cuenta(Nombre,
							Apellido,
							Telefono)
			VALUES	(@nombre,
					@apellido,
					@telefono
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarCuenta'
		PRINT ERROR_MESSAGE()
	END CATCH
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

CREATE OR ALTER PROCEDURE pa_registrarComprobante(
@comprobante VARCHAR(20),
@id_tipopago INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Comprobante(Comprobante,
								ID_TipoPago
								)
			VALUES	(@comprobante,
					@id_tipopago
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarComprobante'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO
--
CREATE OR ALTER PROCEDURE pa_registrarCredencialesTienda(
@usuario VARCHAR(10),
@constrasenna VARCHAR(10),
@nombre VARCHAR(10),
@direccion VARCHAR(50),
@correoeElectronico VARCHAR(30)
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO CredencialesTienda(
							Usuario,
							Constrasenna,
							Nombre,
							Direccion,
							CorreoElectronico
							)
			VALUES	(
					@usuario,
					@constrasenna,
					@nombre,
					@direccion,
					@correoeElectronico
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarCredencialesTienda'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarDetalleVenta(
@cantidad INT,
@precioUnitario SMALLMONEY,
@subtotal SMALLMONEY,
@total SMALLMONEY,
@id_producto INT,
@id_venta INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO DetalleVenta(
							Cantidad,
							PrecioUnitario,
							SubTotal,
							Total,
							ID_Producto,
							ID_Venta
							)
			VALUES	(
					@cantidad,
					@precioUnitario,
					@subtotal,
					@total,
					@id_producto,
					@id_venta
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarDetalleVenta'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarEmpaque(
@tipoempaque VARCHAR(30)
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Empaque(
							TipoEmpaque
							)
			VALUES	(
					@tipoempaque 
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarEmpaque'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarInventario(
@precio SMALLMONEY,
@preciocosto SMALLMONEY,
@utilidad SMALLMONEY,
@stock INT,
@valorStock SMALLMONEY

)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Inventario(
							Precio,
							PrecioCosto,
							Utilidad,
							Stock,
							ValorStock
							)
			VALUES	(
					@precio,
					@preciocosto,
					@utilidad,
					@stock,
					@valorStock
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarInventario'
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

CREATE OR ALTER PROCEDURE pa_registrarProducto(
@nombreproducto VARCHAR(30),
@descripcion VARCHAR(150),
@precio SMALLMONEY,
@id_empaque INT,
@id_inventario INT,
@id_categoriaProducto INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Producto(
							NombreProducto,
							Descripcion,
							Precio,
							ID_Empaque,
							ID_Inventario,
							ID_CategoriaProducto
							)
			VALUES	(
					@nombreproducto,
					@descripcion,
					@precio,
					@id_empaque,
					@id_inventario,
					@id_categoriaProducto
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarProducto'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarTipoPago(
@TipoPago VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO TipoPago(
							TipoPago
							)
			VALUES	(
					@TipoPago
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarTipoPago'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO

CREATE OR ALTER PROCEDURE pa_registrarVenta(
@fecha DATE,
@hora TIME,
@subtotal SMALLMONEY,
@total SMALLMONEY,
@id_cliente INT,
@id_comprobante INT
)
AS
BEGIN
	BEGIN TRY
		INSERT INTO Venta(
							Fecha,
							Hora,
							SubTotal,
							Total,
							ID_Cliente,
							ID_Comprobante
							)
			VALUES	(
					@fecha,
					@hora,
					@subtotal,
					@total,
					@id_cliente,
					@id_comprobante
					)
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarVenta'
		PRINT ERROR_MESSAGE()
	END CATCH
END
GO
--SE TERMINO CREATE DE TODAS LAS TABLAS

CREATE OR ALTER PROCEDURE paT_registrarProductoCompuesto(
/*
SE AGREGA UN PAQUETE DE PRODUCTO CON UN NUEVO PRODUCTO E INVENTARIO
*/
--CODIGO
	@Codigo VARCHAR(30),
--PAQUETE PRODUCTO 
	@Cantidad INT,
	@FechaCaducidad DATE,
--PRODUCTO
	@NombreProducto VARCHAR(30),
	@Descripcion VARCHAR(150),
	--@ID_Empaque INT,
	@tipoempaque VARCHAR(30),
	--@ID_CategoriaProducto INT,
	@nombrecategoria VARCHAR(20),
--INVENTARIO
	@Precio SMALLMONEY,
	@PrecioCosto SMALLMONEY
)
AS
BEGIN
	BEGIN TRANSACTION
	BEGIN TRY

		DECLARE @ValorStock SMALLMONEY = @Precio * @Cantidad;
		DECLARE @Utilidad SMALLMONEY = @Precio - @PrecioCosto;

		
		INSERT INTO Inventario
				(Precio,  PrecioCosto,  Utilidad,  Stock,	ValorStock)
		VALUES	(@Precio, @PrecioCosto, @Utilidad, @Cantidad, @ValorStock);
		
		DECLARE @IDX INT = SCOPE_IDENTITY();
		
		INSERT INTO Producto(
				NombreProducto,  
				Descripcion,  
				Precio,  
				ID_Empaque,  
				ID_Inventario, 
				ID_CategoriaProducto)
		VALUES	(
				@NombreProducto,
				@Descripcion, 
				@Precio,
				dbo.fn_extraerID_Empaque_TipoEmpaque(@tipoempaque), 
				@IDX,
				dbo.fn_extraerID_CategoriaProducto_NombreCategoria(@nombrecategoria)
				);
		
		DECLARE @nuevoIDProducto INT = SCOPE_IDENTITY();

		
		INSERT INTO PaqueteProducto
				(Cantidad,  FechaCaducidad,  ID_Producto)
		VALUES	(@Cantidad, @FechaCaducidad, @IDX);
		
		INSERT INTO Codigo
				(Codigo,  ID_Producto)
		VALUES	(@Codigo, @IDX);
		
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
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE paT_registrarClienteCompuesto(
@cliente VARCHAR(50),
@identificacion VARCHAR(30),
@torre SMALLINT,
@departamento SMALLINT,
@nombre VARCHAR(20),
@apellido VARCHAR(20),

@telefono INT
)
AS
BEGIN
	BEGIN TRANSACTION
		BEGIN TRY
			DECLARE @id_depa INT;
			DECLARE @id_cuen INT;

			--Departamento
			SELECT @id_depa = ID_Departamento
			FROM Departamento
			WHERE 
				Torre = @torre AND 
				Departamento = @departamento
			--Registrar el Departamento si no se encuentra
				IF(	@id_depa IS NULL AND 
					@torre IS NOT NULL AND 
					@departamento IS NOT NULL)BEGIN

					EXEC pa_registrarDepartamento @torre, @departamento
				
					SELECT @id_depa = ID_Departamento
					FROM Departamento
					WHERE 
						Torre = @torre AND 
						Departamento = @departamento
				END

			--Cuenta
			SELECT @id_cuen = ID_Cuenta
			FROM Cuenta
			WHERE 
				Nombre = @nombre AND 
				Apellido = @apellido

			--Registrar el Cuenta si no se encuentra
				IF(	@id_cuen IS NULL AND 
					@nombre IS NOT NULL AND 
					@apellido IS NOT NULL AND 
					@telefono IS NOT NULL)BEGIN
				
					EXEC pa_registrarCuenta 
										@nombre,
										@apellido,
										@telefono

					SELECT @id_cuen = ID_Cuenta
					FROM Cuenta
					WHERE 
						Nombre = @nombre AND
						Apellido = @apellido
				END


			/*IF (@cliente IS NULL AND
				@id_depa IS NULL AND
				@id_cuen IS NULL AND
				@identificacion IS NULL) BEGIN

					RAISERROR (' Al menos una columna debe tener un valor distinto de NULL.', 16, 1);
					RETURN;
			END*/
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





CREATE OR ALTER PROCEDURE paT_registrarVentaCompuesto(
@fecha DATE,
@hora TIME,
@subtotal SMALLMONEY,
@total SMALLMONEY,

@cliente VARCHAR(50),
@identificacion VARCHAR(30),

@torre SMALLINT,
@departamento SMALLINT,

@nombre VARCHAR(20),
@apellido VARCHAR(20),
@telefono INT,

@id_comprobante INT
)
AS
BEGIN
	BEGIN TRANSACTION
		BEGIN TRY
			DECLARE @id_cliente INT
			DECLARE @id_cuenta INT
			DECLARE @id_departamento INT
			
			SELECT *--@id_cliente = ID_Cliente
			FROM Cliente C
			LEFT JOIN Departamento D ON C.ID_Departamento = D.ID_Departamento
			LEFT JOIN Cuenta CU ON CU.ID_Cuenta = C.ID_Cuenta
			WHERE
				Cliente = 'Directo' AND 
				Identificacion IS NULL AND
				D.Torre IS NULL AND
				D.Departamento IS NULL AND
				CU.Nombre = NULL AND 
				CU.Apellido = NULL
			SELECT * FROM Cliente WHERE Cliente = 'Directo'
				/*Cliente = @cliente AND 
				Identificacion = @identificacion AND
				D.Torre = @torre AND
				D.Departamento = @departamento AND
				CU.Nombre = @nombre AND 
				CU.Apellido = @apellido
				*/

/*
			--id departamento
			IF(@torre IS NOT NULL 
				AND @departamento IS NOT NULL) BEGIN

				SELECT @id_departamento = ID_Departamento
				FROM Departamento
				WHERE 
					Torre = @torre
					AND Departamento = @departamento
			END

			--id cuenta
			ELSE IF(@nombre IS NOT NULL 
					AND @apellido IS NOT NULL
					AND @telefono IS NOT NULL) BEGIN

				SELECT @id_cuenta = ID_Cuenta
				FROM Cuenta
				WHERE 
					Nombre = @nombre
					AND Apellido = @apellido
					AND Telefono = @telefono
			END


			--id cliente
			SELECT @id_cliente = ID_Cliente
			FROM Cliente
			WHERE 
				Cliente = @cliente
				AND ID_Departamento = @id_departamento
				AND ID_Cuenta = @id_cuenta
				AND Identificacion = @identificacion
*/
			EXEC pa_registrarVenta 
								@fecha,
								@hora,
								@subtotal,
								@total,
								@id_cliente,
								@id_comprobante
			
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



CREATE OR ALTER PROCEDURE paT_registrarDetalleVenta(
@cantidad INT,
@precioUnitario SMALLMONEY,
@subtotal SMALLMONEY,
@total SMALLMONEY,
--@id_venta INT,--vamos a poner la última venta con SCOPE_IDENTITY
@nombreProducto VARCHAR(30)
)
AS
BEGIN
	BEGIN TRANSACTION
		BEGIN TRY
			DECLARE @id_producto INT
			DECLARE @id_venta INT

			--id producto
			SELECT @id_producto = ID_Producto
			FROM Producto
			WHERE 
				NombreProducto = @nombreProducto
			
			--id venta
			SELECT @id_venta = MAX(ID_Venta)
			FROM Venta

			EXEC pa_registrarDetalleVenta
										@cantidad,
										@precioUnitario,
										@subtotal,
										@total,
										@id_producto,
										@id_venta
			
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