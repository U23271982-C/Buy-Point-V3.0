package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Venta implements GestorSQLServer {
    private int idVenta;
    private LocalDate fecha;
    private LocalTime hora;
    private BigDecimal subTotal;
    private BigDecimal total;

    Cliente cliente;
    Comprobante comprobante;

    public Venta() {
    }

    //#region Getters and Setters

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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
        String consultaSQL = String.format
                ("INSERT INTO Venta" +
                "(ID_Inventario, CantidadVenta, MontoTotal, ID_Cliente, ID_Comprobante)\n" +
                "VALUES(%d, %d, %.2f, %d, %d)",
                 inventario.getIdInventario(),
                        getCantidadVenta(), getMontoTotal(),
                        cliente.getIdCliente(), comprobante.getIdComprobante());

        GestorSQLServer.modificar_Registro(consultaSQL
                , "Venta registrada",
                "No se registro la venta");
    */}

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
