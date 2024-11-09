package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;

public class Venta implements GestorSQLServer {
    private int idVenta;
    private int cantidadVenta;
    private BigDecimal montoTotal;

    Cliente cliente;
    Inventario inventario;
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

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    //#endregion


    @Override
    public void registrar() {
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
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
