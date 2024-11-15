--COPIA
USE BD_BuyPoint
GO
/*PK*/--------------------------------------------------------
ALTER TABLE CredencialesTienda
	ADD CONSTRAINT PK_CredencialesTienda
	PRIMARY KEY (ID_CredencialesTienda)
GO
ALTER TABLE Producto
	ADD CONSTRAINT PK_Producto 
	PRIMARY KEY (ID_Producto)
GO
ALTER TABLE Empaque
	ADD CONSTRAINT PK_Empaque
	PRIMARY KEY (ID_Empaque)
GO
ALTER TABLE Codigo
	ADD CONSTRAINT PK_Codigo
	PRIMARY KEY (ID_Codigo)
GO
ALTER TABLE CategoriaProducto
	ADD CONSTRAINT PK_CategoriaProducto
	PRIMARY KEY (ID_CategoriaProducto)
GO
ALTER TABLE PaqueteProducto
	ADD CONSTRAINT PK_PaqueteProducto
	PRIMARY KEY (ID_PaqueteProducto)
GO
ALTER TABLE Inventario
	ADD CONSTRAINT PK_Inventario
	PRIMARY KEY (ID_Inventario)
GO
ALTER TABLE Venta
	ADD CONSTRAINT PK_Venta
	PRIMARY KEY (ID_Venta)
GO
ALTER TABLE DetalleVenta
	ADD CONSTRAINT PK_DetalleVenta
	PRIMARY KEY (ID_DetalleVenta)
GO
ALTER TABLE Comprobante
	ADD CONSTRAINT PK_Comprobante
	PRIMARY KEY (ID_Comprobante)
GO
ALTER TABLE TipoPago
	ADD CONSTRAINT PK_TipoPago
	PRIMARY KEY (ID_TipoPago)
GO
ALTER TABLE Cliente
	ADD CONSTRAINT PK_Cliente
	PRIMARY KEY (ID_Cliente)
GO
ALTER TABLE Departamento
	ADD CONSTRAINT PK_Departamento
	PRIMARY KEY (ID_Departamento)
GO
ALTER TABLE Cuenta
	ADD CONSTRAINT PK_Cuenta
	PRIMARY KEY (ID_Cuenta)
GO
--INDEX-------------------------------------------------
CREATE UNIQUE INDEX idx_U_Cuenta
ON Cliente (ID_Cuenta)
WHERE ID_Cuenta IS NOT NULL;
GO
CREATE UNIQUE INDEX idx_U_Departamento
ON Cliente (ID_Departamento)
WHERE ID_Departamento IS NOT NULL;
GO
/*UK*/--------------------------------------------------
ALTER TABLE Venta
	ADD CONSTRAINT U_Comprobante
	UNIQUE (ID_Comprobante)
GO
/*
ALTER TABLE Cliente
	ADD CONSTRAINT U_Cuenta
	UNIQUE (ID_Cuenta)
GO
*/
ALTER TABLE Comprobante
	ADD CONSTRAINT U_TipoPago
	UNIQUE (ID_TipoPago)
GO
/*
ALTER TABLE Cliente
	ADD CONSTRAINT U_Departamento
	UNIQUE (ID_Departamento)
GO
*/
ALTER TABLE Producto
	ADD CONSTRAINT U_Invetario
	UNIQUE (ID_Inventario)
GO
/*FK*/--------------------------------------------------
ALTER TABLE Codigo
	ADD CONSTRAINT FK_Codigo_Producto
		FOREIGN KEY (ID_Producto)
		REFERENCES Producto(ID_Producto)
			ON UPDATE CASCADE ON DELETE CASCADE --ON UPDATE CASCADE
GO
ALTER TABLE Producto
	ADD CONSTRAINT FK_Producto_Empaque
		FOREIGN KEY (ID_Empaque)
		REFERENCES Empaque(ID_Empaque)
			ON UPDATE CASCADE ON DELETE CASCADE --ON UPDATE CASCADE
GO
ALTER TABLE Producto
	ADD CONSTRAINT FK_Producto_Inventario
		FOREIGN KEY (ID_Inventario)
		REFERENCES Inventario(ID_Inventario)
			ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE PaqueteProducto
	ADD CONSTRAINT FK_PaqueteProducto_Producto
		FOREIGN KEY (ID_Producto)
		REFERENCES Producto(ID_Producto)
			ON UPDATE CASCADE ON DELETE CASCADE --
GO
ALTER TABLE Producto
	ADD CONSTRAINT FK_Producto_CategoriaProducto
		FOREIGN KEY (ID_CategoriaProducto)
		REFERENCES CategoriaProducto(ID_CategoriaProducto)
			ON DELETE CASCADE ON UPDATE CASCADE --ON UPDATE CASCADE 
GO
ALTER TABLE DetalleVenta
	ADD CONSTRAINT FK_DetalleVenta_Producto
		FOREIGN KEY (ID_Producto)
		REFERENCES Producto(ID_Producto)
			ON UPDATE CASCADE ON DELETE CASCADE--
GO
ALTER TABLE DetalleVenta
	ADD CONSTRAINT FK_DetalleVenta_Venta
		FOREIGN KEY (ID_Venta)
		REFERENCES Venta(ID_Venta)
			ON DELETE CASCADE ON UPDATE CASCADE--
GO
ALTER TABLE Venta
	ADD CONSTRAINT FK_Venta_Cliente
		FOREIGN KEY (ID_Cliente)
		REFERENCES Cliente(ID_Cliente)
			ON DELETE CASCADE ON UPDATE CASCADE--
GO
ALTER TABLE Venta
	ADD CONSTRAINT FK_Venta_Comprobante
		FOREIGN KEY (ID_Comprobante)
		REFERENCES Comprobante(ID_Comprobante)
			ON DELETE CASCADE ON UPDATE CASCADE
GO
ALTER TABLE Comprobante
	ADD CONSTRAINT FK_TipoPago_Comprobante
		FOREIGN KEY (ID_TipoPago)
		REFERENCES TipoPago(ID_TipoPago)
			ON DELETE CASCADE ON UPDATE CASCADE--
GO
ALTER TABLE Cliente
	ADD CONSTRAINT FK_Departamento_Cliente
		FOREIGN KEY (ID_Departamento)
		REFERENCES Departamento(ID_Departamento)
			ON DELETE CASCADE ON UPDATE CASCADE--
GO
ALTER TABLE Cliente
	ADD CONSTRAINT FK_Cuenta_Cliente
		FOREIGN KEY (ID_Cuenta)
		REFERENCES Cuenta(ID_Cuenta)
			ON DELETE CASCADE ON UPDATE CASCADE--
GO
/*DF*/----------------------------------------------------
ALTER TABLE Inventario
	ADD CONSTRAINT DF_Inventario_Salida DEFAULT 0 FOR Salida
GO
ALTER TABLE PaqueteProducto
ADD CONSTRAINT DF_PaqueteProducto_Caducado DEFAULT 0 FOR Caducado
GO