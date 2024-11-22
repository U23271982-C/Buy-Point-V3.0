USE BD_BuyPoint
GO--DELETE
CREATE OR ALTER PROCEDURE pa_eliminarCredencialesTienda(
	@usuario VARCHAR(10),
	@contrasenna VARCHAR(10)
)
AS
BEGIN
	DELETE CredencialesTienda 
	WHERE Usuario = @usuario 
			AND Constrasenna = @contrasenna
END
GO
CREATE OR ALTER PROCEDURE pa_eliminarProducto(
	@Codigo VARCHAR(30)
)
AS
BEGIN
	BEGIN TRANSACTION
	BEGIN TRY
		
		DECLARE @idProductoEliminar INT;
		SET @idProductoEliminar = dbo.fn_extraerID_Producto_CodigoBarras(@Codigo);
		
		--Elimando producto
		DELETE Producto
		WHERE ID_Producto = @idProductoEliminar
		--Eliminando Codigo
		DELETE Codigo
		WHERE ID_Producto = @idProductoEliminar
		--Eliminando Invenrario
		--Eliminando Paquete de los Productos
		DELETE PaqueteProducto
		WHERE ID_Producto = @idProductoEliminar

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
