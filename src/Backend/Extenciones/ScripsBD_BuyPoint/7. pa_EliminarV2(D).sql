USE BD_BuyPoint
GO--DELETE
CREATE OR ALTER PROCEDURE pa_eliminarCategoriaProducto(
	@nombreCategoriaProducto VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY
		
		DELETE CategoriaProducto
		WHERE
			NombreCategoria = @nombreCategoriaProducto

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarCliente(
	@idCliente INT
)
AS
BEGIN
	BEGIN TRY
		DELETE Cliente
		WHERE
			ID_Cliente = @idCliente

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;--FALTA
GO
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
CREATE OR ALTER PROCEDURE pa_eliminarCodigo(
	@codigo VARCHAR(30)
)
AS
BEGIN
	BEGIN TRY

		DELETE Codigo
		WHERE
			Codigo = @codigo

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
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
CREATE OR ALTER PROCEDURE pa_eliminarComprobante(
	@comprobante VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY

		DELETE Comprobante
		WHERE
			Comprobante = @comprobante

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
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
CREATE OR ALTER PROCEDURE pa_eliminarCuenta(
@nombre VARCHAR(20),
@apellido VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY

		DELETE Cuenta
		WHERE
			Nombre = @nombre AND
			Apellido = @apellido

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarDepartamento(
@torre SMALLINT,
@departamento SMALLINT
)
AS
BEGIN
	BEGIN TRY

		DELETE Departamento
		WHERE
			Torre = @torre AND
			Departamento = @departamento

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarDetalleVenta(
@idventa INT
)
AS
BEGIN
	BEGIN TRY

		DELETE DetalleVenta
		WHERE
			ID_Venta = @idventa

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarEmpaque(
@tipoempaque VARCHAR(30)
)
AS
BEGIN
	BEGIN TRY

		DELETE Empaque
		WHERE
			TipoEmpaque = @tipoempaque

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarInventario(
@idinvetario INT
)
AS
BEGIN
	BEGIN TRY

		DELETE Inventario
		WHERE
			ID_Inventario = @idinvetario

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarPaqueteProducto(
@idpaqueteproducto INT
)
AS
BEGIN
	BEGIN TRY

		DELETE PaqueteProducto
		WHERE
			ID_PaqueteProducto = @idpaqueteproducto

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
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
        DELETE Inventario
		WHERE ID_Inventario = @idProductoEliminar
		--Eliminando Paquete de los Productos
		DELETE PaqueteProducto
		WHERE ID_Producto = @idProductoEliminar

		COMMIT TRANSACTION;
	END TRY
	BEGIN CATCH
		IF XACT_STATE() <> 0 BEGIN
				ROLLBACK TRANSACTION;
			END

			PRINT 'Ocurri� un error. La transacci�n ha sido revertida.';
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarTipoProducto(
@TipoPago VARCHAR(20)
)
AS
BEGIN
	BEGIN TRY

		DELETE TipoPago
		WHERE
			TipoPago = @TipoPago

	END TRY
	BEGIN CATCH
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO
CREATE OR ALTER PROCEDURE pa_eliminarVenta(
	@id INT
)
AS
BEGIN
	BEGIN TRANSACTION
	BEGIN TRY
			
		--Elimando producto
		DELETE Venta
		WHERE ID_Venta = @id

		DELETE DetalleVenta
		WHERE ID_Venta = @id

		COMMIT TRANSACTION;
	END TRY
	BEGIN CATCH
		IF XACT_STATE() <> 0 BEGIN
				ROLLBACK TRANSACTION;
			END

			PRINT 'Ocurri� un error. La transacci�n ha sido revertida.';
			PRINT 'Mensaje de error' + ERROR_MESSAGE();
			PRINT 'Gravedad del error' + CAST(ERROR_SEVERITY() AS NVARCHAR(10));
			PRINT 'Estado del error' + CAST(ERROR_STATE() AS NVARCHAR(10));
	END CATCH;
END;
GO