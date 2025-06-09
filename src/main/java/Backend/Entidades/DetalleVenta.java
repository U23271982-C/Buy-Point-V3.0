package Backend.Entidades;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private BigDecimal total;
    final private double IGV = 0.18;

    //Venta venta;
    Producto producto;

    public DetalleVenta() {
        this.cantidad = 1;
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
        return getProducto().getPrecio().setScale(1, RoundingMode.HALF_UP);
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubTotal() {
        BigDecimal t = getPrecioUnitario().multiply(new BigDecimal(getCantidad()));
        return t.subtract(t.multiply(new BigDecimal(IGV))).setScale(1, RoundingMode.HALF_UP);
                /*(getPrecioUnitario().multiply(new BigDecimal
                (getCantidad()))).setScale(1, RoundingMode.HALF_UP);*/
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {
        return
                getPrecioUnitario().multiply(new BigDecimal(getCantidad()));
                /*(getSubTotal().add(getSubTotal().multiply
                (BigDecimal.valueOf(IGV)))).setScale
                (1, RoundingMode.HALF_UP);*/
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }
    
    

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //#endregion
/*    public static void main(String[] args) {
        Producto p = new Producto();
        p.setPrecio(new BigDecimal(12));
        DetalleVenta d = new DetalleVenta();
        d.setProducto(p);
        
        System.out.println(d.getCantidad());
    }*/

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "idDetalleVenta=" + idDetalleVenta +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subTotal=" + subTotal +
                ", total=" + total +
                ", IGV=" + IGV +
                ", producto=" + producto +
                '}';
    }
}
