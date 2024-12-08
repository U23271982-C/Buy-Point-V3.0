USE BD_BuyPoint
GO--UPDATE


CREATE OR ALTER PROCEDURE pa_actualizarCategoriaProducto(
@nombreCategoriaProductoN VARCHAR(20),
@nombreCategoriaProducto VARCHAR(20)
)
AS
BEGIN
	UPDATE CategoriaProducto SET
		NombreCategoria = @nombreCategoriaProductoN
	WHERE NombreCategoria = @nombreCategoriaProducto
END

GO
CREATE OR ALTER PROCEDURE pa_actualizarCliente(
@cliente VARCHAR(50),
@identificacion VARCHAR(30),
@clienteN VARCHAR(50),
@identificacionN VARCHAR(30)
)
AS
BEGIN
	UPDATE Cliente
	SET
		Cliente = @clienteN,
		Identificacion = @identificacionN
	WHERE
		Identificacion = @identificacion OR
		Cliente = @cliente
END
GO
--Codigo de Barras no se actualizan
CREATE OR ALTER PROCEDURE pa_actualizarComprobante(
@comprobante VARCHAR(20),
@comprobanteN VARCHAR(20)
)
AS
BEGIN
	UPDATE Comprobante
	SET
		Comprobante = @comprobanteN
	WHERE
		Comprobante = @comprobante
END
GO
CREATE OR ALTER PROCEDURE pa_actualizarCredencialesTienda(
	@usuario VARCHAR(10),
	@contrasenna VARCHAR(10),
	@contrasennaNueva VARCHAR(10),
	@nombre VARCHAR(10),
	@direccion VARCHAR(50),
	@correoElectronico VARCHAR(30)
)
AS
BEGIN
	UPDATE CredencialesTienda SET
		Usuario = @usuario,
		Constrasenna = @contrasennaNueva,
		Nombre = @nombre,
		Direccion = @direccion,
		CorreoElectronico = @correoElectronico
	WHERE Constrasenna = @contrasenna
END
GO
CREATE OR ALTER PROCEDURE pa_actualizarCuenta(
@nombre VARCHAR(20),
@apellido VARCHAR(20),
@nombreN VARCHAR(20),
@apellidoN VARCHAR(20),
@telefonoN INT
)
AS
BEGIN
	UPDATE Cuenta
	SET
		Nombre = @nombreN,
		Apellido = @apellidoN,
		Telefono = @telefonoN
	WHERE
		Nombre = @nombre AND
		Apellido = @apellido
END
GO
CREATE OR ALTER PROCEDURE pa_actualizarDepartamento(
@torre SMALLINT,
@departamento SMALLINT,
@torreN SMALLINT,
@departamentoN SMALLINT
)
AS
BEGIN
	UPDATE Departamento
	SET
		Torre = @torreN,
		Departamento = @departamentoN
	WHERE
		Torre = @torre AND
		Departamento = @departamento
END
GO
CREATE OR ALTER PROCEDURE pa_actualizarDetalleVenta(
@cantidad INT,
@precioUnitario SMALLMONEY,
@subtotal SMALLMONEY,
@total SMALLMONEY,
@id_producto INT,
@id_venta INT

)
AS
BEGIN
	UPDATE DetalleVenta
	SET
		Cantidad = @cantidad,
		PrecioUnitario = @precioUnitario,
		SubTotal = @subtotal,
		Total = @total
	WHERE
		ID_Producto = @id_producto AND
		ID_Venta = @id_venta
END
GO
CREATE OR ALTER PROCEDURE pa_actualizarEmpaque(
@tipoempaque VARCHAR(30),
@tipoempaqueN VARCHAR(30)
)
AS
BEGIN
	UPDATE Empaque
	SET
		TipoEmpaque = @tipoempaqueN
	WHERE
		TipoEmpaque = @tipoempaque
END
GO
--Inventario se actualiza en conjunto con producto
CREATE OR ALTER PROCEDURE pa_actualizarPaqueteProducto(
@cantidad INT,
@fechacaducidad DATE,
@id_producto INT
)
AS
BEGIN
	UPDATE PaqueteProducto
	SET
		Cantidad = @cantidad,
		FechaCaducidad = @fechacaducidad
	WHERE
		ID_Producto = @id_producto
END
GO

CREATE OR ALTER PROCEDURE pa_actualizarPaqueteProducto(
@cantidad INT,
@fechacaducidad DATE,
@id_producto INT
)
AS
BEGIN
	UPDATE PaqueteProducto
	SET
		Cantidad = @cantidad,
		FechaCaducidad = @fechacaducidad
	WHERE
		ID_Producto = @id_producto
END
GO
--FALTA ENTIDADES

CREATE OR ALTER PROCEDURE pa_actualizarProducto(
@codigoBarras VARCHAR(30),

@nombreProducto VARCHAR(30),
@descripcion VARCHAR(150),
@precio SMALLMONEY
)
AS
BEGIN
begin try
	DECLARE @idProducto INT
	SET @idProducto = 
		dbo.fn_extraerID_Producto_CodigoBarras (@codigoBarras)
	IF(@nombreProducto IS NOT NULL)BEGIN
		UPDATE Producto
		SET
		NombreProducto = @nombreProducto
		FROM Producto
		WHERE ID_Producto = @idProducto
	END
	IF(@descripcion IS NOT NULL)BEGIN
		UPDATE Producto
		SET
		Descripcion = @descripcion
		FROM Producto
		WHERE ID_Producto = @idProducto
	END
	IF(@descripcion IS NOT NULL)BEGIN
		UPDATE Producto
		SET
		Descripcion = @descripcion
		FROM Producto
		WHERE ID_Producto = @idProducto
	END
	IF(@precio IS NOT NULL)BEGIN
		UPDATE Producto
		SET
		Precio = @precio
		FROM Producto
		WHERE ID_Producto = @idProducto
	END
	COMMIT TRANSACTION;	
		
	END TRY
	BEGIN CATCH
		PRINT 'ERROR EN pa_registrarDetalleVenta'
		PRINT --ERROR_MESSAGE()
		/*@ErrorMessage NVARCHAR(4000) = */'El producto ' +
			@nombreProducto +' no cuenta con cantidad suficiente de Stock';
	END CATCH
END
GO