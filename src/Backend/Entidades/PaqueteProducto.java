package Backend.Entidades;

import java.time.LocalDate;

public class    PaqueteProducto extends Entidad {
    private int idPaqueteProducto;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private boolean caducado;

    Producto producto;

    public PaqueteProducto() {
        //this.producto = new Producto();
        this.caducado = false;
    }

    //#region Getters and Setters

    public int getIdPaqueteProducto() {

        return idPaqueteProducto;
    }

    public void setIdPaqueteProducto(int idPaqueteProducto) {
        this.idPaqueteProducto = idPaqueteProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //#endregion

}
