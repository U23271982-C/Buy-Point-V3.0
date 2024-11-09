package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DetalleVenta implements GestorSQLServer {
    private int idDetalleVenta;
    private LocalTime hora;
    private LocalDate fecha;
    private BigDecimal montoIGV;
    private BigDecimal montoPagar;
    Venta venta;

    public DetalleVenta() {
    }

    //#region Getters and Setters

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMontoIGV() {
        return montoIGV;
    }

    public void setMontoIGV(BigDecimal montoIGV) {
        this.montoIGV = montoIGV;
    }

    public BigDecimal getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(BigDecimal montoPagar) {
        this.montoPagar = montoPagar;
    }
    //#endregion


    @Override
    public void registrar() {

        DateTimeFormatter fmtFecha =  DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter fmtHora =  DateTimeFormatter.ISO_LOCAL_DATE;

        setHora(LocalTime.now());//Hora actual
        setFecha(LocalDate.now());//Fecha actual

        String consultaSQL = String.format("INSERT INTO DetalleVenta" +
                "(ID_Venta, Hora, Fecha, MontoIGV, MontoPagar)\n" +
                "VALUES(%d,'%s', '%s', %.2f, %.2f)\n",
                venta.getIdVenta(), getHora().format(fmtHora),
                getFecha().format(fmtFecha), getMontoIGV(),getMontoPagar());

        GestorSQLServer.modificar_Registro(consultaSQL
                        , "Detalle de venta registrada",
                        "No se registro el detalle de venta");

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
