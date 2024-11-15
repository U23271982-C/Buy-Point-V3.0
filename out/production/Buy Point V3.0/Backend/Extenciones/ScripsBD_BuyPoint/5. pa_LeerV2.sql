USE BD_BuyPoint
GO
CREATE OR ALTER PROCEDURE pa_leerCredencialesUsuario(
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
