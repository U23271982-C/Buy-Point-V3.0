package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PaqueteProducto extends Entidad {
    private int idPaqueteProducto;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private boolean caducado;

    Producto producto;

    public PaqueteProducto() {
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

    //#endregion

}
