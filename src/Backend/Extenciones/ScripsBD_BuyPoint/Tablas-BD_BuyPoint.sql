USE master
GO
CREATE DATABASE BD_BuyPoint
GO
USE BD_BuyPoint
GO
CREATE TABLE CredencialesTienda(--
	ID_CredencialesTienda INT IDENTITY(1,1),
	Usuario VARCHAR(10)NOT NULL,
	Constrasenna VARCHAR(10) NOT NULL,
	Nombre VARCHAR(10)NOT NULL,
	Direccion VARCHAR(10) NOT NULL,
	CorreoElectronico VARCHAR(20) NOT NULL
)
GO
CREATE TABLE Producto(
	ID_Producto INT IDENTITY(1,1),
	NombreProducto VARCHAR(30) NOT NULL,
	Descripcion VARCHAR(150),
	ID_Empaque INT NULL,
	ID_CategoriaProducto INT NOT NULL
)
GO
CREATE TABLE Codigo(
	ID_Codigo INT IDENTITY(1,1),
	Codigo VARCHAR(30) NOT NULL,
	ID_Producto INT NOT NULL
)
GO
CREATE TABLE Empaque(
	ID_Empaque INT IDENTITY(1,1),
	TipoEmpaque VARCHAR(30) NOT NULL
)
GO
CREATE TABLE CategoriaProducto(
	ID_CategoriaProducto INT IDENTITY(1,1),
	NombreCategoria VARCHAR(20) NOT NULL
)
GO
CREATE TABLE PaqueteProducto(
	ID_PaqueteProducto INT IDENTITY(1,1),
	Cantidad INT NOT NULL,
	FechaCaducidad DATE NOT NULL,
	Caducado BIT NOT NULL,
	ID_Producto INT NOT NULL,
	ID_Inventario INT NOT NULL
)
GO
CREATE TABLE Inventario(
	ID_Inventario INT IDENTITY(1,1),
	PrecioCosto SMALLMONEY NOT NULL,
	PrecioVenta SMALLMONEY NOT NULL,
	Utilidad SMALLMONEY NOT NULL,
	Salida INT NOT NULL,
	Stock INT NOT NULL,
	ValorStock SMALLMONEY NOT NULL,
)
GO
CREATE TABLE Venta (
	ID_Venta INT IDENTITY(1,1) NOT NULL,
	ID_Inventario INT NOT NULL,
	CantidadVenta INT NOT NULL,
	MontoTotal SMALLMONEY NOT NULL,
	ID_Cliente INT NOT NULL,
	ID_Comprobante INT NOT NULL
)
GO
CREATE TABLE DetalleVenta(
	ID_DetalleVenta INT IDENTITY(1,1) NOT NULL,
	ID_Venta INT NOT NULL,
	MontoIGV SMALLMONEY NOT NULL,
	MontoPagar SMALLMONEY NOT NULL,
	Fecha DATE NOT NULL,
	Hora TIME(0) NOT NULL
)
GO
CREATE TABLE Comprobante(
	ID_Comprobante INT IDENTITY(1,1) NOT NULL,
	Comprobante VARCHAR(20) NOT NULL,
	ID_TipoPago INT NOT NULL
)
GO
CREATE TABLE TipoPago(
	ID_TipoPago INT IDENTITY(1,1) NOT NULL,
	TipoPago VARCHAR(20) NOT NULL,
)
GO
CREATE TABLE Cliente(
	ID_Cliente INT IDENTITY(1,1) NOT NULL,
	Cliente INT NOT NULL,
	ID_Departamento INT NULL,
	ID_Cuenta INT NULL
)
GO
CREATE TABLE Departamento(
	ID_Departamento INT IDENTITY(1,1) NOT NULL,
	Torre SMALLINT NOT NULL,
	Departamento SMALLINT NULL
)
GO
CREATE TABLE Cuenta(
	ID_Cuenta INT IDENTITY(1,1) NOT NULL,
	Nombre VARCHAR(20) NOT NULL,
	Apellido VARCHAR(20) NOT NULL,
	Telefono INT NOT NULL,
)
GO