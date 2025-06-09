package Backend.Entidades;

import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private BigDecimal total;
    final private double IGV = 0.18;

    Producto producto;

    public DetalleVenta() {
        this.cantidad = 1; // Si no se especifica cantidad, por defecto es 1
    }

    public BigDecimal getSubTotal() {
        BigDecimal t = getPrecioUnitario().multiply(new BigDecimal(getCantidad()));
        return t.subtract(t.multiply(new BigDecimal(IGV))).setScale(1, RoundingMode.HALF_UP);
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {
        return getPrecioUnitario().multiply(new BigDecimal(getCantidad()));
    }
}
