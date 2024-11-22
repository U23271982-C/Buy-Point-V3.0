USE BD_BuyPoint
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