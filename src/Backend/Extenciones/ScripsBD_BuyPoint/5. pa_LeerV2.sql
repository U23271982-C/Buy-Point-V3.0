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