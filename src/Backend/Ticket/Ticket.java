package Backend.Ticket;

import Backend.Controladores.CtrlVenta;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticket{
    private final String repositorioComprobantes = "D:\\TestComprobantes";
    DateTimeFormatter fttHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter fttFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String inicioTiteck = """
            COND. LOS PARQUES DE SAN GABRIEL
            Chiclayo - Chiclayo - Lambayeque
            --------------------------------
                    RECIBO DE VENTA
                      Pedido %d""";
    //1//
    private String encabezadoTicketDirecto = """
            --------------------------------
            Fecha: %s
            Hora: %s
            Tipo Pago: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    // 2//
    private String encabezadoTicketDelivery = """
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
            --------------------------------
            Fecha: %s
            Hora: %s
            Tipo Pago: %s
            Nombre: %s
            Apellidos: %s
            Telf.: %s
            --------------------------------
            Descrp.     Cant.   SubT.  Total
            """;
    // 5//
    private String encabezadoTicketCuentaDepartamento = """
            --------------------------------
            Fecha: %s
            Hora: %s
            Tipo Pago: %s
            Cliente:
                Nombre: %s
                Apellidos: %s
                Telf.: %d
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

    public String getInicioTiteck() {
        return inicioTiteck;
    }

    public void setInicioTiteck(String inicioTiteck) {
        this.inicioTiteck = inicioTiteck;
    }

    //#endregion

    private String formateadorCuerpoTicket(int idxEncabezado, int numVenta){
        return String.format("%s\n%s\n%s\n%s",
                String.format(inicioTiteck, numVenta),
                tipoEncabezadosTickets.get(idxEncabezado),
                cuerpoTicket,
                finalTicket);
    }
    public void exportarTiteck( int idxEncabezado, int numVenta){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("hh.mm.ss");
        String nombreArchivo = "\\Comprobante_"  +
                LocalTime.now().format(d) + "_" + LocalDate.now() + ".txt";
        // Generar el archivo txt
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter
                             (repositorioComprobantes + nombreArchivo))) {

            writer.write(formateadorCuerpoTicket(idxEncabezado, numVenta));
            JOptionPane.showMessageDialog
                    (null,
                            "Ticket generado exitosamente en: "
                                    + repositorioComprobantes);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Error", 0);
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        //ticket.exportarTiteck(1,1);
        System.out.println(CtrlVenta.ultimoID());
        /*System.out.println(ticket.getTipoEncabezadosTickets().get(3));
        BigDecimal num1 = new BigDecimal("12.20");
        String hola = String.format(ticket.finalTicket, num1, num1, num1);
        System.out.println(hola);*/
    }
}
