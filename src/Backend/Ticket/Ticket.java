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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket{
    DateTimeFormatter fttHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter fttFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String encabezadoTicketDirecto = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido 10232
            --------------------------------
            Fecha: %s
            Hora: %s
            Tipo Pago: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String encabezadoTicketDelivery = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido 1402
            --------------------------------
            Fecha: %s
            Hora: %s
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
                        Pedido 1234
            --------------------------------
            Fecha: %s
            Hora: %s
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
                        Pedido 123
            --------------------------------
            Fecha: %s
            Hora: %s
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

    public DateTimeFormatter getFttHora() {
        return fttHora;
    }

    public void setFttHora(DateTimeFormatter fttHora) {
        this.fttHora = fttHora;
    }

    public DateTimeFormatter getFttFecha() {
        return fttFecha;
    }

    public void setFttFecha(DateTimeFormatter fttFecha) {
        this.fttFecha = fttFecha;
    }

    public String getEncabezadoTicketDirecto() {
        return encabezadoTicketDirecto;
    }

    public void setEncabezadoTicketDirecto(String encabezadoTicketDirecto) {
        this.encabezadoTicketDirecto = encabezadoTicketDirecto;
    }

    public String getEncabezadoTicketDelivery() {
        return encabezadoTicketDelivery;
    }

    public void setEncabezadoTicketDelivery(String encabezadoTicketDelivery) {
        this.encabezadoTicketDelivery = encabezadoTicketDelivery;
    }

    public String getEncabezadoTicketCliente() {
        return encabezadoTicketCliente;
    }

    public void setEncabezadoTicketCliente(String encabezadoTicketCliente) {
        this.encabezadoTicketCliente = encabezadoTicketCliente;
    }

    public String getEncabezadoTicketClienteDepartamento() {
        return encabezadoTicketClienteDepartamento;
    }

    public void setEncabezadoTicketClienteDepartamento(String encabezadoTicketClienteDepartamento) {
        this.encabezadoTicketClienteDepartamento = encabezadoTicketClienteDepartamento;
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

    public List<String> getTipoEncabezadosTickets() {
        return tipoEncabezadosTickets;
    }

    public void setTipoEncabezadosTickets(List<String> tipoEncabezadosTickets) {
        this.tipoEncabezadosTickets = tipoEncabezadosTickets;
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

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        String.format(ticket.encabezadoTicketDirecto, "hola");
        /*System.out.println(ticket.formateadorCuerpoTicket(0));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = LocalTime.now().toString();
        System.out.println(hora);*/
    }
}
