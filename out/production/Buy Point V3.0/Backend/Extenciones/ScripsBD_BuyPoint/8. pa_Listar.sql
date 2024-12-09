USE BD_BuyPoint
GO
CREATE OR ALTER PROCEDURE pa_listarCategoriaProducto
AS
BEGIN
	SELECT 
		C.NombreCategoria
	FROM CategoriaProducto AS C
END
GO
CREATE OR ALTER PROCEDURE pa_listarCliente
AS
BEGIN
	SELECT 
		C.Cliente,
		C.Identificacion,
		D.Torre,
		D.Departamento,
		CU.Nombre,
		CU.Apellido,
		CU.Telefono
	FROM Cliente AS C
	LEFT JOIN Departamento AS D ON C.ID_Departamento = D.ID_Departamento
	LEFT JOIN Cuenta AS CU ON CU.ID_Cuenta = C.ID_Cuenta
END
GO
CREATE OR ALTER PROCEDURE pa_listarCodigo
AS
BEGIN
	SELECT 
		Codigo,
		P.NombreProducto
	FROM Codigo AS C
	INNER JOIN Producto AS P ON C.ID_Producto = P.ID_Producto
END
GO
CREATE OR ALTER PROCEDURE pa_listarComprobante
AS
BEGIN
	SELECT 
		C.Comprobante,
		T.TipoPago
	FROM Comprobante AS C
	INNER JOIN TipoPago AS T ON T.ID_TipoPago = C.ID_TipoPago
END
GO
CREATE OR ALTER PROCEDURE pa_listarCredencialesTienda
AS
BEGIN
	SELECT 
		ID_CredencialesTienda,
		Usuario,
		Constrasenna,
		Nombre,
		Direccion,
		CorreoElectronico
	FROM CredencialesTienda
END
GO
CREATE OR ALTER PROCEDURE pa_listarCuenta
AS
BEGIN
	SELECT 
		Nombre,
		Apellido,
		Telefono
	FROM Cuenta
END
GO
CREATE OR ALTER PROCEDURE pa_listarDepartamento
AS
BEGIN
	SELECT 
		D.Torre,
		D.Departamento
	FROM Departamento AS D
END
GO
CREATE OR ALTER PROCEDURE pa_listarDetalleVenta
AS
BEGIN
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
END
GO
CREATE OR ALTER PROCEDURE pa_listarEmpaque
AS
BEGIN
	SELECT
		E.TipoEmpaque
	FROM Empaque AS E
END
GO
CREATE OR ALTER PROCEDURE pa_listarInventario
AS
BEGIN
	SELECT
		I.Precio,
		I.PrecioCosto,
		I.Salida,
		I.Stock,
		I.Utilidad,
		I.ValorStock
	FROM Inventario AS I
END
GO
CREATE OR ALTER PROCEDURE pa_listarPaqueteProducto--(
--@nombreproducto VARCHAR(30)
--)
AS
BEGIN
	SELECT
		P.NombreProducto,
		PA.Cantidad,
		PA.FechaCaducidad,
		PA.Caducado,
		PA.ID_PaqueteProducto
	FROM PaqueteProducto AS PA
	INNER JOIN Producto AS P ON PA.ID_Producto = P.ID_Producto
	--WHERE P.NombreProducto = @nombreproducto
END
GO



CREATE OR ALTER PROCEDURE pa_listarPaqueteProductoCodigo(
@codigobarras VARCHAR(30)
)
AS
BEGIN
	SELECT
		P.NombreProducto,
		PA.Cantidad,
		PA.FechaCaducidad,
		PA.Caducado,
		PA.ID_PaqueteProducto
	FROM PaqueteProducto AS PA
	RIGHT JOIN Producto AS P ON PA.ID_Producto = P.ID_Producto
	--INNER JOIN Codigo AS C ON PA.ID_Producto = P.ID_Producto
	WHERE P.ID_Producto = dbo.fn_extraerID_Producto_CodigoBarras (@codigobarras)
		AND PA.Caducado = 0
END
GO



CREATE OR ALTER PROCEDURE pa_listarProducto
AS
BEGIN
	SELECT
		P.NombreProducto,
		P.Descripcion,
		P.Precio,
		I.PrecioCosto,
		I.Stock,
		CA.NombreCategoria,
		I.Salida
	FROM Producto AS P
	INNER JOIN Empaque AS E ON P.ID_Empaque = E.ID_Empaque
	INNER JOIN Inventario AS I ON P.ID_Inventario = I.ID_Inventario
	INNER JOIN CategoriaProducto AS CA ON P.ID_CategoriaProducto = CA.ID_CategoriaProducto
END
GO
CREATE OR ALTER PROCEDURE pa_listarTipoPago
AS
BEGIN
	SELECT
		T.TipoPago
	FROM TipoPago AS T
END
GO
CREATE OR ALTER PROCEDURE pa_listarVenta
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
		CU.Telefono,
		V.ID_Venta
	FROM Venta AS V
	INNER JOIN Cliente AS C ON V.ID_Cliente = C.ID_Cliente
	LEFT JOIN Comprobante AS CO ON CO.ID_Comprobante = V.ID_Comprobante
	LEFT JOIN Cuenta AS CU ON C.ID_Cuenta= CU.ID_Cuenta
	LEFT JOIN Departamento AS D ON C.ID_Departamento = D.ID_Departamento
END
GO