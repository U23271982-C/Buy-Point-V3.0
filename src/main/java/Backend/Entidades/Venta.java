package Backend.Entidades;

import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private LocalTime hora;
    private BigDecimal subTotal;
    private BigDecimal total;

    Cliente cliente;
    Comprobante comprobante;
    List<DetalleVenta> detallesVenta;

    public Venta() {
        this.cliente = new Cliente();
        this.comprobante = new Comprobante();
        this.detallesVenta = new ArrayList<>();
    }

    public BigDecimal calcularTotal() {

        return /*total = /*detallesVenta.stream().map(DetalleVenta::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);*/
                detallesVenta.stream().map(DetalleVenta::getTotal)
                        .reduce(BigDecimal.ZERO, BigDecimal::add)
                        .setScale(1, RoundingMode.HALF_UP);
    }
    public BigDecimal calcularSubTotal() {
        return /*subTotal = */detallesVenta.stream().map(DetalleVenta::getSubTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add).setScale(1, RoundingMode.HALF_UP);
    }

    public void agregarDetalleVenta(DetalleVenta nuevoDetalleVenta){
        detallesVenta.add(nuevoDetalleVenta);
    }
    public int eliminarDetalleVenta(int indece){
        detallesVenta.remove(indece);
        return indece;
    }
}
