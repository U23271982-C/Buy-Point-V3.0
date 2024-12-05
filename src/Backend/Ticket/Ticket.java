package Backend.Ticket;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket{
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
    private String lineaTicket = """
            %s
                          %d  s./%.2f s/.%.2f
            """;
    private String finalTicket = """
            SubTotal:                s/. %.2f
            I.G.V. (18%)             s/. %.2f
            Total:                   s/. %.2f
            """;
    private List<String> tipoEncabezadosTickets = new ArrayList<>(Arrays.asList(
            encabezadoTicketDirecto,
            encabezadoTicketDelivery,
            encabezadoTicketCliente,
            encabezadoTicketClienteDepartamento
    ));
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

    private String formateadorCuerpoTicket(int idxEncabezado){
        return this.cuerpoTicket = String.format("%s\n%s\n%s",
                tipoEncabezadosTickets.get(idxEncabezado),
                lineaTicket,
                finalTicket);
    }
    public void exportarTiteck(String direcArchivo, int idxEncabezado){

        // Generar el archivo txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(direcArchivo))) {

            writer.write(formateadorCuerpoTicket(idxEncabezado));

            JOptionPane.showMessageDialog
                    (null,
                            "Ticket generado exitosamente en: " + direcArchivo);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Error", 1);
        }
    }

}
