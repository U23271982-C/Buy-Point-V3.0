USE BD_BuyPoint
GO
--Credenciales Tienda
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
--Empaque
EXEC pa_registrarEmpaque 
	'Lata'
GO
EXEC pa_registrarEmpaque 
	'Plástico'
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
--CategoriaProducto
EXEC pa_registrarCategoriaProducto
	'Lácteos'
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
	'Bizcochos'
GO
--Producto
EXEC paT_registrarProductoCompuesto
	'AD2122DS',
	5, '2024-10-20',
	'Gloria 355ml',
	'Tarro de leche evaporada',
	'Lata',
	'Lácteos',
	4.50,
	3.50
GO
EXEC paT_registrarProductoCompuesto
	'AD2122DS',
	5, '2024-10-20',
	'Coca Cola 600ml',
	'Gaseosa',
	'Plástico',
	'Bebidas Gasificadas',
	3,
	2
GO
EXEC paT_registrarProductoCompuesto
	'AAA123',
	3,
	'2025-01-22',
	'Chocman',
	'Bizcocho relleno de un delicioso manjar blanco y cubierto con una capa de chocolate',
	'Plástico',
	'Bizcochos',
	1,
	0.80
GO
EXEC paT_registrarProductoCompuesto
	'BBB456',
	10,
	'2025-02-18',
	'InkaChips',
	'Papas fritas',
	'Plástico',
	'Snacks',
	2.50,
	1.50
GO
EXEC paT_registrarProductoCompuesto
	'CCC456',
	8,
	'2025-03-04',
	'Bimboletes 3u',
	'Bizcocho de sabor a vainilla',
	'Plástico',
	'Bizcochos',
	2.50,
	1.50
GO
--Departamento
EXEC pa_registrarDepartamento 1, 101
EXEC pa_registrarDepartamento 1, 103
GO
EXEC pa_registrarDepartamento 5, 702
GO
EXEC pa_registrarDepartamento 11, 204
GO
EXEC pa_registrarDepartamento 5, 703
GO
--Cuenta
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
--Cliente
EXEC paT_registrarClienteCompuesto 'Juan Prieto', '123456', NULL, NULL,NULL,NULL
GO
EXEC paT_registrarClienteCompuesto 'Alejandra Cisneros', '456891', NULL, NULL,NULL,NULL
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, 10, 102,NULL,NULL
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, NULL, NULL,Martin, Valdez
GO
EXEC paT_registrarClienteCompuesto NULL , NULL, 10, 101, Crsthian,Reyes
GO
--Codigo
EXEC paT_registrarCodigoCompuesto 'DDDDD582', 'InkaChips'
GO
EXEC paT_registrarCodigoCompuesto 'GHKJ582', 'Chocman'
GO
EXEC paT_registrarCodigoCompuesto 'GH5852D2', 'Gloria 355ml'
GO
EXEC paT_registrarCodigoCompuesto 'QWEEE789', 'Coca Cola 600ml'
GO
EXEC paT_registrarCodigoCompuesto 'DAAD789', 'Bimboletes 3u'
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
