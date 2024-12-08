package Backend.Entidades;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Venta extends Entidad {
    private int idVenta;
    private LocalDate fecha;
    private LocalTime hora;
    private BigDecimal subTotal;
    private BigDecimal total;

    Cliente cliente;
    Comprobante comprobante;
    ArrayList<DetalleVenta> detallesVenta;

    public Venta() {
        this.cliente = new Cliente();
        this.comprobante = new Comprobante();
        this.detallesVenta = new ArrayList<>();
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
        return subTotal = detallesVenta.stream().map(DetalleVenta::getSubTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add).setScale(1, RoundingMode.HALF_UP);
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {

        return total = /*detallesVenta.stream().map(DetalleVenta::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);*/
                detallesVenta.stream().map(DetalleVenta::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                        .setScale(1, RoundingMode.HALF_UP);
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public ArrayList<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }


    //#endregion

    public void agregarDetalleVenta(DetalleVenta nuevoDetalleVenta){
        detallesVenta.add(nuevoDetalleVenta);
    }
    public int eliminarDetalleVenta(int indece){
        detallesVenta.remove(indece);
        return indece;
    }

}
