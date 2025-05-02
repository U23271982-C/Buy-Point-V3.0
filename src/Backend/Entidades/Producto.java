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
    private BigDecimal precioCosto;
    private BigDecimal utilidad;


    Empaque empaque;
    CategoriaProducto categoriaProducto;
    Inventario inventario;
    Codigo codigo;
    Lote lote;

    public Producto() {
        this.empaque = new Empaque();
        this.categoriaProducto = new CategoriaProducto();
        this.inventario = new Inventario();
        this.codigo = new Codigo();
        this.lote = new Lote();
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

    /*public boolean isTieneEmpaque() {
        return tieneEmpaque;
    }

    public void setTieneEmpaque(boolean tieneEmpaque) {
        this.tieneEmpaque = tieneEmpaque;
    }*/

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

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public BigDecimal getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }

    public BigDecimal getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(BigDecimal utilidad) {
        this.utilidad = utilidad;
    }
    //#endregion

    /*public boolean productoRegistrado(String codigoBarras){
        return false;
    }*/

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", empaque=" + empaque +
                ", categoriaProducto=" + categoriaProducto +
                ", inventario=" + inventario +
                ", codigo=" + codigo +
                ", paqueteProducto=" + lote +
                '}';
    }
}
