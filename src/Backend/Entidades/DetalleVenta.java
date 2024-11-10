package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DetalleVenta implements GestorSQLServer {
    private int idDetalleVenta;
    private int cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private BigDecimal total;

    Venta venta;
    Producto producto;

    public DetalleVenta() {
    }

    //#region Getters and Setters

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    //#endregion


    @Override
    public void registrar() {/*

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

    */}

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
