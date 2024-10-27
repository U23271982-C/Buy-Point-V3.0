package Backend;

import Backend.ConexionBD.GestorSQLServer;

import java.time.LocalDate;

public class PaqueteProducto implements GestorSQLServer {
    private int idPaqueteProducto;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private boolean caducado;
    private int idProducto;
    private int idInventario;

    public PaqueteProducto() {
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    //#endregion


    @Override
    public void registrar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
