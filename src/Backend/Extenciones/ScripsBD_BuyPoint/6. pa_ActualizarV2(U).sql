USE BD_BuyPoint
GO--UPDATE
CREATE PROCEDURE pa_actualizarCredencialesTienda(
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