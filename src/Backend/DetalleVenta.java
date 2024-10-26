package Backend;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class DetalleVenta implements GestorSQLServer {
    private int idDetalleVenta;
    private int idVenta;
    private LocalTime hora;
    private LocalDate fecha;
    private BigDecimal montoIGV;
    private BigDecimal montoPagar;

    public DetalleVenta() {
    }

    //#region Getters and Setters

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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
        String consultaSQL = String.format("INSERT INTO DetalleVenta(ID_Venta, Hora, Fecha, MontoIGV, MontoPagar)\n" +
                "VALUES(10,101)\n" /*getNombre()*/);//Falta completar, porque fuiamos a crear en producto
        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Categoría registrada",
                        "No se registro la categoría");

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
