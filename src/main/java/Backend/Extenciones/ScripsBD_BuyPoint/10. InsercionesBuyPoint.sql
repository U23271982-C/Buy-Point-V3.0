USE BD_BuyPoint
GO
EXEC pa_registrarComprobante 'Boleta', 3
GO
EXEC pa_registrarComprobante 'Boleta', 4
GO
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
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
								'Boleta',
								'Yape'
EXEC paT_registrarDetalleVenta 
								1,
								1.50,
								1.50,
								2,
								'McColins T� Canela y Clavo 30gr'
GO
EXEC paT_registrarDetalleVenta 
								1,
								7.00,
								7.00,
								2,
								'Kirma Clasico 190gr'
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
								'02:12:13',
								124.4,
								150.00,
								'Juan Prieto',
								'123456',
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								'Boleta',
								'Yape'
EXEC paT_registrarDetalleVenta 
								1,
								3.30,
								3.30,
								3.30,
								'Milo 380gr'
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
								'02:12:13',
								124.4,
								150.00,
								'Alejandra Cisneros',
								'456891',
								NULL,
								NULL,
								NULL,
								NULL,
								NULL,
								'Boleta',
								'Yape'
EXEC paT_registrarDetalleVenta 
								1,
								6.00,
								6.00,
								6.00,
								'Salsa de Soya'
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
								'02:12:13',
								124.4,
								150.00,
								NULL,
								NULL,
								10,
								102,
								NULL,
								NULL,
								NULL,
								'Boleta',
								'Plin'
EXEC paT_registrarDetalleVenta 
								1,
								6.00,
								6.00,
								6.00,
								'Salsa de Soya'
EXEC paT_registrarDetalleVenta 
								1,
								7.00,
								7.00,
								2,
								'Kirma Clasico 190gr'
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
								'02:12:13',
								124.4,
								150.00,
								NULL,
								NULL,
								NULL,
								NULL,
								Martin,
								Valdez,
								852741963,
								'Boleta',
								'Efectivo'
EXEC paT_registrarDetalleVenta 
								1,
								6.00,
								6.00,
								6.00,
								'Salsa de Soya'
EXEC paT_registrarVentaCompuesto 
								'2025-12-03',
								'02:12:13',
								124.4,
								150.00,
								NULL,
								NULL,
								10,
								101,
								Crsthian,
								Reyes,
								753159456,
								'Boleta',
								'Tarjeta'
EXEC paT_registrarDetalleVenta 
								1,
								7.00,
								7.00,
								2,
								'Kirma Clasico 190gr'

SELECT * from CredencialesTienda