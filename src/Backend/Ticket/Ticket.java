package Backend.Ticket;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket implements Printable {
    private String encabezadoTicketDirecto = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido %d
            --------------------------------
            Fecha: %s
            Tipo Pago: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String encabezadoTicketDelivery = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido %d
            --------------------------------
            Fecha: %s
            Torre: %d
            Departamento: %d
            Tipo Pago: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String encabezadoTicketCliente = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido %d
            --------------------------------
            Fecha: %s
            Tipo Pago: %s
            Cliente:
                Nombre:
                Apellidos:
                DNI:
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String encabezadoTicketClienteDepartamento = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido %d
            --------------------------------
            Fecha: %s
            Tipo Pago: %s
            Cliente:
                Nombre:
                Apellidos:
                DNI:
                Torre: %d
                Departamento: %d
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private List<String> tipoEncabezadosTickets = new ArrayList<>(Arrays.asList(
            encabezadoTicketDirecto,
            encabezadoTicketDelivery,
            encabezadoTicketCliente,
            encabezadoTicketClienteDepartamento
    ));
    private String lineaTicket = """
            %s
                          %d  s./%.2f s/.%.2f
            """;
    private String finalTicket = """
            SubTotal:                s/. %.2f
            I.G.V. (18%)             s/. %.2f
            Total:                   s/. %.2f
            """;
    private String cuerpoTicket;
    private Font fuente;
    private Color colorFuente;

    public Ticket() {
    }

    //#region Getters and Setters

    public List<String> getTipoEncabezadosTickets() {
        return tipoEncabezadosTickets;
    }

    public void setTipoEncabezadosTickets(List<String> tipoEncabezadosTickets) {
        this.tipoEncabezadosTickets = tipoEncabezadosTickets;
    }

    public String getLineaTicket() {
        return lineaTicket;
    }

    public void setLineaTicket(String lineaTicket) {
        this.lineaTicket = lineaTicket;
    }

    public String getFinalTicket() {
        return finalTicket;
    }

    public void setFinalTicket(String finalTicket) {
        this.finalTicket = finalTicket;
    }

    public String getCuerpoTicket() {
        return cuerpoTicket;
    }

    public void setCuerpoTicket(String cuerpoTicket) {
        this.cuerpoTicket = cuerpoTicket;
    }

    //#endregion

    public String formateadorCuerpoTicket(int idxEncabezado){
        return this.cuerpoTicket = String.format("%s\n%s\n%s",
                tipoEncabezadosTickets.get(idxEncabezado),
                lineaTicket,
                finalTicket);
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
