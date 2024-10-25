package Backend;

import java.time.LocalDate;

public class PaqueteProducto {
    private int idPaqueteProducto;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private boolean caducado;
    private int idDepartamento;

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

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    //#endregion

}
