USE BD_BuyPoint
GO
CREATE OR ALTER PROCEDURE pa_leerCategoriaProducto(
@nombrecategoria VARCHAR(20)
)
AS
BEGIN
	SELECT
		ID_CategoriaProducto,
		NombreCategoria
	FROM CategoriaProducto
	WHERE NombreCategoria LIKE @nombrecategoria + '%'
END
GO
CREATE OR ALTER PROCEDURE pa_leerCliente(
@cliente VARCHAR(50),
@identificacion VARCHAR(30),
@torre SMALLINT,
@departamento SMALLINT,
@nombre VARCHAR(20),
@apellido VARCHAR(20)
)
AS
BEGIN
	SELECT
		C.Cliente,
		C.Identificacion,
		D.Torre,
		D.Departamento,
		CU.Nombre,
		CU.Apellido
	FROM Cliente AS C
	INNER JOIN Departamento AS D ON C.ID_Departamento = D.ID_Departamento
	INNER JOIN Cuenta AS CU ON C.ID_Cuenta = CU.ID_Cuenta
	WHERE
		C.Cliente LIKE @cliente + '%' AND
		C.Identificacion = @identificacion AND
		D.Torre = @torre AND
		D.Departamento = @departamento AND
		CU.Nombre LIKE @nombre + '%' AND
		CU.Apellido LIKE @apellido + '%'
END
GO
CREATE OR ALTER PROCEDURE pa_leerCodigo(
@nombreproducto VARCHAR(20),
@codigo VARCHAR(30)
)
AS
BEGIN
	IF (@codigo IS NULL)BEGIN
		SELECT
			C.Codigo,
			P.NombreProducto
		FROM Codigo AS C
		INNER JOIN Producto AS P ON C.ID_Producto = P.ID_Producto
	
		WHERE
			P.NombreProducto LIKE @nombreproducto + '%'
	END
	ELSE BEGIN
		SELECT
			C.Codigo,
			P.NombreProducto
		FROM Codigo AS C
		INNER JOIN Producto AS P ON C.ID_Producto = P.ID_Producto
	
		WHERE
			P.NombreProducto LIKE @nombreproducto + '%' AND
			C.Codigo = @codigo
	END
END
GO
CREATE OR ALTER PROCEDURE pa_leerComprobante(
@comprobante VARCHAR(20),
@tipopago VARCHAR(20)
)
AS
BEGIN
	SELECT 
		C.Comprobante,
		T.TipoPago
	FROM Comprobante AS C
	INNER JOIN TipoPago AS T ON T.ID_TipoPago = C.ID_TipoPago
	WHERE 
		C.Comprobante LIKE @comprobante + '%' AND
		T.TipoPago LIKE @tipopago + '%'
END
GO
CREATE OR ALTER PROCEDURE pa_leerCredencialesTienda(
@usuario VARCHAR(10),
@contrasenna VARCHAR(10)
)
AS
BEGIN
	SELECT ID_CredencialesTienda, Usuario, Constrasenna,Nombre, Direccion, CorreoElectronico
	FROM CredencialesTienda
	WHERE Usuario = @usuario AND Constrasenna = @contrasenna
END
GO
CREATE OR ALTER PROCEDURE pa_leerCuenta(
@nombre VARCHAR(20),
@apellido VARCHAR(20)
)
AS
BEGIN
	SELECT 
		Nombre,
		Apellido,
		Telefono
	FROM Cuenta
	WHERE
		Nombre = @nombre AND
		Apellido = @apellido
END
GO
CREATE OR ALTER PROCEDURE pa_leerDepartamento(
@torre SMALLINT,
@departamento SMALLINT
)
AS
BEGIN
	SELECT 
		D.Torre,
		D.Departamento
	FROM Departamento AS D
	WHERE
		Torre = @torre AND
		Departamento = @departamento
END
GO

CREATE OR ALTER PROCEDURE pa_leerDetalleVenta(
@nombreproducto VARCHAR(30),
@fecha DATE,
@hora TIME
)
AS
BEGIN
	IF(@fecha IS NULL AND @hora IS NULL) BEGIN
		SELECT
			P.NombreProducto,
			V.ID_Venta,
			D.Cantidad,
			D.PrecioUnitario,
			D.SubTotal,
			D.Total
		FROM DetalleVenta AS D
		INNER JOIN Producto AS P ON D.ID_Producto = P.ID_Producto
		INNER JOIN Venta AS V ON V.ID_Venta = D.ID_Venta
		WHERE P.NombreProducto = @nombreproducto
	END
	ELSE IF(@fecha IS NULL) BEGIN
		SELECT
			P.NombreProducto,
			V.ID_Venta,
			D.Cantidad,
			D.PrecioUnitario,
			D.SubTotal,
			D.Total
		FROM DetalleVenta AS D
		INNER JOIN Producto AS P ON D.ID_Producto = P.ID_Producto
		INNER JOIN Venta AS V ON V.ID_Venta = D.ID_Venta
		WHERE V.Fecha = @fecha
	END
	ELSE IF(@hora IS NULL) BEGIN
		SELECT
			P.NombreProducto,
			V.ID_Venta,
			D.Cantidad,
			D.PrecioUnitario,
			D.SubTotal,
			D.Total
		FROM DetalleVenta AS D
		INNER JOIN Producto AS P ON D.ID_Producto = P.ID_Producto
		INNER JOIN Venta AS V ON V.ID_Venta = D.ID_Venta
		WHERE V.Hora = @hora
	END
	ELSE BEGIN
		SELECT
			P.NombreProducto,
			V.ID_Venta,
			D.Cantidad,
			D.PrecioUnitario,
			D.SubTotal,
			D.Total
		FROM DetalleVenta AS D
		INNER JOIN Producto AS P ON D.ID_Producto = P.ID_Producto
		INNER JOIN Venta AS V ON V.ID_Venta = D.ID_Venta
		WHERE 
			V.Hora = @hora AND
			V.Fecha = @fecha AND
			P.NombreProducto = @nombreproducto
	END
END
GO
CREATE OR ALTER PROCEDURE pa_leerEmpaque(
@tipoempaque VARCHAR(30)
)
AS
BEGIN
	SELECT
		E.TipoEmpaque
	FROM Empaque AS E
	WHERE TipoEmpaque = @tipoempaque
END
GO
--INVENTARIO NO VA
CREATE OR ALTER PROCEDURE pa_leerPaqueteProducto(
@codigo VARCHAR(30)--@id_producto INT
)
AS
BEGIN
	SELECT
		P.NombreProducto,
		PA.Cantidad,
		PA.FechaCaducidad,
		PA.Caducado
	FROM PaqueteProducto AS PA
	INNER JOIN Producto AS P ON PA.ID_Producto = P.ID_Producto
	INNER JOIN Codigo AS C ON PA.ID_Producto = P.ID_Producto
	WHERE C.Codigo = @codigo
END
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
CREATE OR ALTER PROCEDURE pa_leerTipoPago(
@tipopago VARCHAR(20)
)
AS
BEGIN
	SELECT
		T.TipoPago
	FROM TipoPago AS T
	WHERE T.TipoPago = @tipopago
END
GO
CREATE OR ALTER PROCEDURE pa_leerVenta(
@fecha DATE
)--FALTA
AS
BEGIN
	SELECT
		V.Fecha,
		V.Hora,
		V.SubTotal,
		V.Total,
		C.Cliente,
		C.Identificacion,
		D.Torre,
		D.Departamento,
		CU.Nombre,
		CU.Apellido,
		CU.Telefono
	FROM Venta AS V
	INNER JOIN Cliente AS C ON V.ID_Cliente = C.ID_Cliente
	INNER JOIN Comprobante AS CO ON CO.ID_Comprobante = V.ID_Comprobante
	INNER JOIN Cuenta AS CU ON C.ID_Cuenta= CU.ID_Cuenta
	INNER JOIN Departamento AS D ON C.ID_Departamento = D.ID_Departamento
	WHERE V.Fecha = @fecha
END
GO