package Backend.Ticket;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Ticket implements Printable {
    private String encabezadoTicket = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido %d
            --------------------------------
            Fecha: %s
            Cliente: %
            Tipo Pago: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String lineaTicket = """
            %s
                          %d  s./%.2f s/.%.2f
            """;
    private String finalTicket = """
            SubTotal:                s/. %.2f
            I.G.V. (18%)             s/. %.2f
            Total:                   s/. %.2f
            """;

    private final String cuerpoTicket =
            String.format("%s\n%s\n%s", encabezadoTicket, lineaTicket, finalTicket);
    private Font fuente;
    private Color colorFuente;

    public Ticket() {
    }

    public void imprimir() {
        PrinterJob job = PrinterJob.getPrinterJob(); // Configurar el trabajo de impresión
        job.setPrintable(this); // Asignar la clase actual como la imprimible

        // Mostrar el diálogo de impresión
        if (job.printDialog()) {
            try {
                job.print(); // Enviar el trabajo a la impresora
            } catch (PrinterException e) {
                System.err.println("Error al imprimir: " + e.getMessage());
            }
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE; // Solo imprimimos una página
        }

        // Configurar el inicio de impresión
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Dibujar el contenido del ticket
        int y = 10; // Coordenada Y inicial
        for (String linea : cuerpoTicket.split("\n")) {
            graphics.drawString(linea, 10, y);
            y += 15; // Incrementar la posición vertical para la siguiente línea
        }

        return PAGE_EXISTS; // Página lista para imprimir
    }
}
