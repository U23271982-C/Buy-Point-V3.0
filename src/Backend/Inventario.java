/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ISRAEL
 */
public class Inventario implements GestorSQLServer {

    //public ArrayList<CategoriaProducto> catogoriasProductos;
    private int idInventario;
    private BigDecimal precioCosto;
    private BigDecimal precioVenta;
    private BigDecimal utilidad;
    private int ingreso;
    private int salida;
    private int stock;
    private BigDecimal valorStock;

    public Inventario() {
    }

    //#region Getters and Setters

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public BigDecimal getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BigDecimal getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(BigDecimal utilidad) {
        this.utilidad = utilidad;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getValorStock() {
        return valorStock;
    }

    public void setValorStock(BigDecimal valorStock) {
        this.valorStock = valorStock;
    }


    //#endregion

    @Override
    public void registrar() {

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
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }

    static void ingresoProducto(int cantidad){
    }
    static void salidaProducto(int cantidad){
        //quita la cantidad de productos del stock y aumenta en I.salida
    }
    public int cantidadStock(){
        //retorna la cantidad de stock total
        return 0;
    }
}
