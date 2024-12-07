package Backend.Ticket;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket{
    public int numComprobante = 0;
    DateTimeFormatter fttHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter fttFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //1//
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
    // 2//
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
    // 3
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
            Nombre y Apellidos: %s
            Ident.: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    // 4
    private String encabezadoTicketCuenta = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                        Pedido 1234
            --------------------------------
            Fecha: %s
            Hora: %s
            Tipo Pago: %s
            Nombre
            Apellidos: %s
            Telf.: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    // 5//
    private String encabezadoTicketCuentaDepartamento = """
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
                Nombre: %s
                Apellidos: %s
                Iden.: %d
                Torre: %d
                Departamento: %d
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    private String lineaTicket = """
            %s
                          %d  s./%.2f s/.%.2f\n
            """;
    private String finalTicket = """
            --------------------------------
            SubTotal:                s/. %.2f
            I.G.V. (18%%)             s/. %.2f
            Total:                   s/. %.2f
            """;
    private List<String> tipoEncabezadosTickets = new ArrayList<>(Arrays.asList(
            this.encabezadoTicketDirecto/*getEncabezadoTicketDirecto()*/,//1*
            getEncabezadoTicketDelivery(),//2*
            getEncabezadoTicketCliente(),//3
            getEncabezadoTicketCuenta(),//4
            getEncabezadoTicketCuentaDepartamento()//5*
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

    public String getEncabezadoTicketCuenta() {
        return encabezadoTicketCuenta;
    }

    public void setEncabezadoTicketCuenta(String encabezadoTicketCuenta) {
        this.encabezadoTicketCuenta = encabezadoTicketCuenta;
    }

    public String getEncabezadoTicketCuentaDepartamento() {
        return encabezadoTicketCuentaDepartamento;
    }

    public void setEncabezadoTicketCuentaDepartamento(String encabezadoTicketCuentaDepartamento) {
        this.encabezadoTicketCuentaDepartamento = encabezadoTicketCuentaDepartamento;
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
        return String.format("%s\n%s\n%s",
                tipoEncabezadosTickets.get(idxEncabezado),
                cuerpoTicket,
                finalTicket);
    }
    public void exportarTiteck(String direcArchivo, int idxEncabezado){
        this.numComprobante += 1;
        String nombreArchivo = "\\Compfdsfrobante_" + numComprobante + ".txt";
        // Generar el archivo txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(direcArchivo + nombreArchivo))) {

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
        System.out.println(ticket.getTipoEncabezadosTickets().get(3));
        /*BigDecimal num1 = new BigDecimal("12.20");
        String hola = String.format(ticket.finalTicket, num1, num1, num1);
        System.out.println(hola);*/
    }
}
