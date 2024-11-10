package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PaqueteProducto implements GestorSQLServer {
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


    @Override
    public void registrar() {
        /*
        //Formateo al estandar ISO 8601(AAAA-MM-DD)
        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;

        String consultaSQL = String.format("INSERT INTO PaqueteProducto" +
                        "(Cantidad, FechaCaducidad, Caducado, ID_Producto, " +
                        "ID_Inventario)\n" +
                        "VALUES(%d, '%s', 0, %d, %d)"

                ,getCantidad(), getFechaCaducidad().format(fmt),
                producto.getIdProducto(), inventario.getIdInventario());

        //Falta el método de Inventario para actulizar el stock

        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Paquete de producto agregado",
                        "No se agrego el paquete de producto");
    */}

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
