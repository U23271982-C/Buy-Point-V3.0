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