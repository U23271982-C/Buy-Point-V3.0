USE BD_BuyPoint
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
		CA.NombreCategoria
	FROM Producto AS P
	INNER JOIN Empaque AS E ON P.ID_Empaque = E.ID_Empaque
	INNER JOIN Inventario AS I ON P.ID_Inventario = I.ID_Inventario
	INNER JOIN CategoriaProducto AS CA ON P.ID_CategoriaProducto = CA.ID_CategoriaProducto
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
