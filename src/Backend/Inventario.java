/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author ISRAEL
 */
public class Inventario implements GestorSQLServer {

    //public ArrayList<CategoriaProducto> catogoriasProductos;
    private String id;
    private BigDecimal precioCosto;
    private BigDecimal precioVenta;
    private BigDecimal utilidad;
    private int ingreso;
    private int salida;
    private int BigDecimal;
    private BigDecimal valorStock;

    public Inventario() {
    }

    //#region Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public java.math.BigDecimal getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(java.math.BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }

    public java.math.BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(java.math.BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public java.math.BigDecimal getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(java.math.BigDecimal utilidad) {
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

    public int getBigDecimal() {
        return BigDecimal;
    }

    public void setBigDecimal(int bigDecimal) {
        BigDecimal = bigDecimal;
    }

    public java.math.BigDecimal getValorStock() {
        return valorStock;
    }

    public void setValorStock(java.math.BigDecimal valorStock) {
        this.valorStock = valorStock;
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
