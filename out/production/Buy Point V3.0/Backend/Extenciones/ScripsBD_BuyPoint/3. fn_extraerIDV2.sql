USE BD_BuyPoint
GO
CREATE OR ALTER FUNCTION fn_extraerID_Producto_CodigoBarras(
	@Codigo VARCHAR(30)
)
--TODAVIA FALTA IMPLEMENTAR
RETURNS INT
AS
BEGIN
	DECLARE @id INT;
	
	SELECT @id = C.ID_Producto
	FROM Codigo AS C
	WHERE C.Codigo = @Codigo;
	
	RETURN @id;
END;

GO
CREATE OR ALTER FUNCTION fn_extraerID_Empaque_TipoEmpaque(
	@tipoempaque VARCHAR(30)
)
RETURNS INT
AS
BEGIN
	DECLARE @id INT;
	
	SELECT @id = ID_Empaque
	FROM Empaque AS E
	WHERE E.TipoEmpaque = @tipoempaque;
	
	RETURN @id;
END;
GO
CREATE OR ALTER FUNCTION fn_extraerID_CategoriaProducto_NombreCategoria(
	@nombrecategoria VARCHAR(20)
)
RETURNS INT
AS
BEGIN
	DECLARE @id INT;
	
	SELECT @id = ID_CategoriaProducto
	FROM CategoriaProducto AS C
	WHERE C.NombreCategoria = @nombrecategoria;
	
	RETURN @id;
END;
GO

CREATE OR ALTER FUNCTION fn_extraerID_UltimaVenta()
RETURNS INT
AS
BEGIN
	DECLARE @id INT;
	
	SELECT TOP 1 @id = ID_Venta
	FROM Venta V
	ORDER BY ID_Venta DESC
	
	RETURN @id;
END;
GO

CREATE OR ALTER PROCEDURE pa_FechaMasVenta
AS
BEGIN
	SELECT TOP 1
		Fecha,
		SUM(Total) AS TotalVenta
	FROM Venta
	GROUP BY Fecha
	ORDER BY SUM(Total) DESC
END
go
CREATE OR ALTER PROCEDURE pa_UtilidadFecha(
@dias INT
)
AS
BEGIN
	SELECT TOP (@dias) 
		Fecha, 
		SUM(Total) - SUM(SubTotal) AS Utilidad
	FROM Venta
	GROUP BY Fecha
	ORDER BY Fecha DESC
END