USE BD_BuyPoint
GO
--Credenciales Tienda---------------------------------------------------------------------
EXEC pa_registrarCredencialesTienda 
	'user1', '123', 'usuraio', 'mi casa', 'usuario@mail.com';
GO
EXEC pa_registrarCredencialesTienda 
	'akira', '456', 'Santhiago', 'Urb. Nogales', 'akira@mail.com';
GO
EXEC pa_registrarCredencialesTienda 
	'U23271982', '23271982', 'Cubas', 'Urb. Sauces', 'U23271982@gmail.com';
GO
EXEC pa_registrarCredencialesTienda 
	'U23214873', '23214873', 'Pita', 'Av. Bolognesi #152', 'U23214873@gmail.com';
GO
EXEC pa_registrarCredencialesTienda 
	'U4873', '4873', 'Saldaña', 'Av. Bolognesi #1555', 'U4873@gmail.com';
GO
--Empaque---------------------------------------------------------------------
EXEC pa_registrarEmpaque 
	'Lata'
GO
EXEC pa_registrarEmpaque 
	'Plastico'
GO
EXEC pa_registrarEmpaque 
	'Vidrio'
GO
EXEC pa_registrarEmpaque 
	'Carton'
GO
EXEC pa_registrarEmpaque 
	'Sin empaque'
GO
--CategoriaProducto---------------------------------------------------------------------
EXEC pa_registrarCategoriaProducto
	'Lacteos'
GO
EXEC pa_registrarCategoriaProducto
	'Enlatados'
GO
EXEC pa_registrarCategoriaProducto
	'Legumbres'
GO
EXEC pa_registrarCategoriaProducto
	'Snacks'
GO
EXEC pa_registrarCategoriaProducto
	'Bebidas gasificadas'
GO
EXEC pa_registrarCategoriaProducto
	'Beibidas en polvo'
GO
EXEC pa_registrarCategoriaProducto
	'Bizcochos'
GO
EXEC pa_registrarCategoriaProducto
	'Pastillas'
GO
EXEC pa_registrarCategoriaProducto
	'Condimentos'
GO
EXEC pa_registrarCategoriaProducto
	'Infusiones'
GO

--Producto---------------------------------------------------------------------
EXEC paT_registrarProductoCompuesto
	'016500579793​',
	3, '2025-10-19',
	'One A Day 1',
	'Multivitaminas para Mujeres',
	'Plastico',
	'Pastillas',
	199.90,
	180.00
GO
EXEC paT_registrarProductoCompuesto
	'6921180820056',
	5, '2025-08-28',
	'Salsa de Soya',
	'Condimento de origen chino, producido al fermentar semillas de soya con los hongos',
	'Vidrio',
	'Condimentos',
	6.00,
	4.50
GO
EXEC paT_registrarProductoCompuesto
	'7702024224525',
	3,
	'2025-11-01',
	'Milo 380gr',
	'Bebida en polvo con sabor a chocolate fabricada por la popular empresa suiza Nestlé',
	'Lata',
	'Beibidas en polvo',
	4,
	3.20
GO
EXEC paT_registrarProductoCompuesto
	'7891000110416',
	3,
	'2026-02-01',
	'Kirma Clasico 190gr',
	'Café tostado de alta calidad',
	'Lata',
	'Beibidas en polvo',
	7.00,
	5.50
GO
EXEC paT_registrarProductoCompuesto
	'8720608001569',
	8,
	'2026-01-04',
	'McColins Té Canela y Clavo 30gr',
	'Infusión que combina los sabores de la canela y el clavo, ofreciendo una bebida aromática y reconfortante',
	'Carton',
	'Infusiones',
	1.50,
	1.00
GO
--Departamento---------------------------------------------------------------------
EXEC pa_registrarDepartamento 1, 101
EXEC pa_registrarDepartamento 1, 103
GO
EXEC pa_registrarDepartamento 5, 702
GO
EXEC pa_registrarDepartamento 11, 204
GO
EXEC pa_registrarDepartamento 5, 703
GO
--Cuenta---------------------------------------------------------------------
EXEC pa_registrarCuenta 'Martin', 'Valdez', 987456123
GO
EXEC pa_registrarCuenta 'Jose', 'Pereira', 8546210
GO
EXEC pa_registrarCuenta 'Alfonso', 'Steven', 123582789
GO
EXEC pa_registrarCuenta 'Marisol', 'Cajusol', 753159852
GO
EXEC pa_registrarCuenta 'Luigui', 'Vazques', 75321458
GO
SELECT * FROM Cliente
--Cliente---------------------------------------------------------------------
EXEC paT_registrarClienteCompuesto 'Directo', NULL, NULL, NULL,NULL,NULL, NULL
GO
EXEC paT_registrarClienteCompuesto 'Juan Prieto', '123456', NULL, NULL,NULL,NULL, NULL
GO
EXEC paT_registrarClienteCompuesto 'Alejandra Cisneros', '456891', NULL, NULL,NULL,NULL,NULL
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, 10, 102,NULL,NULL,NULL
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, NULL, NULL,Martin, Valdez, 852741963
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, 10, 101, Crsthian,Reyes,753159456
GO
--Codigo---------------------------------------------------------------------
EXEC pa_registrarCodigo 'DDDDD582', 'McColins Té Canela y Clavo 30gr'
GO
EXEC pa_registrarCodigo 'GHKJ582', 'Salsa de Soya'
GO
EXEC pa_registrarCodigo 'GH5852D2', 'Kirma Clasico 190gr'
GO
--TipoPago---------------------------------------------------------------------
EXEC pa_registrarTipoPago 'Efectivo'
GO
EXEC pa_registrarTipoPago 'Yape'
GO
EXEC pa_registrarTipoPago 'Plin'
GO
EXEC pa_registrarTipoPago 'Tarjeta'
GO
--Comprobante---------------------------------------------------------------------
SELECT * FROM Comprobante
EXEC pa_registrarComprobante 'Boleta', 1
GO
EXEC pa_registrarComprobante 'Boleta', 2
GO
EXEC pa_registrarComprobante 'Factura', 2
GO
EXEC pa_registrarComprobante 'Factura', 1
GO
--Venta---------------------------------------------------------------------
EXEC paT_registrarVentaCompuesto 
								'2024-12-03',
								'02:12:13',
								124.4,
								150.00,
								'Directo',
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								1
/*
use BD_BuyPoint

DELETE CategoriaProducto
Codigo WHERE ID_Codigo = 6
WHERE ID_Inventario in (2,4,8)

SELECT *
FROM CategoriaProducto

SELECT *--C.Codigo, P.NombreProducto, P.Descripcion, CA.NombreCategoria, E.TipoEmpaque, I.Precio, I.Stock
FROM Producto P
INNER JOIN Inventario I ON I.ID_Inventario = P.ID_Inventario
INNER JOIN Codigo C ON C.ID_Producto = P.ID_Producto
INNER JOIN CategoriaProducto CA ON CA.ID_CategoriaProducto = P.ID_CategoriaProducto
INNER JOIN Empaque E ON E.ID_Empaque = P.ID_Empaque
INNER JOIN PaqueteProducto PA ON PA.ID_Producto = P.ID_Producto

DELETE Producto
WHERE ID_Producto in (4,8)

SELECT *
FROM Producto
*/
/*FALTA PROBAR COMO REGISTAR UN CLIENTE*/
