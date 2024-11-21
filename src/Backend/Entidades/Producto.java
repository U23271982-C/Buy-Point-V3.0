/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

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
    Codigo codigo;
    PaqueteProducto paqueteProducto;

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

    public Empaque getEmpaque() {
        return empaque;
    }

    public void setEmpaque(Empaque empaque) {
        this.empaque = empaque;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public PaqueteProducto getPaqueteProducto() {
        return paqueteProducto;
    }

    public void setPaqueteProducto(PaqueteProducto paqueteProducto) {
        this.paqueteProducto = paqueteProducto;
    }

    //#endregion

    /*public boolean productoRegistrado(String codigoBarras){
        return false;
    }*/
}
