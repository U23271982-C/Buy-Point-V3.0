package Backend.Entidades;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DetalleVenta extends Entidad {
    private int idDetalleVenta;
    private int cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private BigDecimal total;
    final private double IGV = 0.18;

    Venta venta;
    Producto producto;

    public DetalleVenta() {
        this.venta = new Venta();
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
        return getProducto().getPrecio();
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubTotal() {
        return (getPrecioUnitario().multiply(new BigDecimal
                (getCantidad()))).setScale(1, RoundingMode.HALF_UP);
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {
        return (getSubTotal().add(getSubTotal().multiply
                (BigDecimal.valueOf(IGV)))).setScale
                (1, RoundingMode.HALF_UP);
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        try {
            if (producto.getCodigo().getCodigo()
                    .equals(getProducto().getCodigo().getCodigo())) {
                this.cantidad++;
                return null;
            }
            return producto;
        }catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "Error en ingresar un nuevo producto");
            return null;
        }
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //#endregion

}
