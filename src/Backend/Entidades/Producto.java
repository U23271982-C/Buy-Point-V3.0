/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

import java.math.BigDecimal;

/**
 *
 * @author ISRAEL
 */
public class Producto extends Entidad {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private BigDecimal precio;
    private boolean tieneEmpaque;

    Empaque empaque;
    CategoriaProducto categoriaProducto;
    Inventario inventario;

    public Producto() {
    }

    //#region Getters and Setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public boolean isTieneEmpaque() {
        return tieneEmpaque;
    }

    public void setTieneEmpaque(boolean tieneEmpaque) {
        this.tieneEmpaque = tieneEmpaque;
    }

    //#endregion

    /*public boolean productoRegistrado(String codigoBarras){
        return false;
    }*/
}
