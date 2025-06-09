/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import Backend.Entidades.Contructor.PatternBuilder;
import Backend.Entidades.Contructor.CategorioProductoBuilder;

/**
 *
 * @author ISRAEL
 */

public final class CategoriaProducto {
    private int idCategoriaProducto;
    private String nombre;

    public CategoriaProducto() {
    }

    public CategoriaProducto(int idCategoriaProducto, String nombre) {
        this.idCategoriaProducto = idCategoriaProducto;
        this.nombre = nombre;
    }

    //#region Getters and Setters

    public int getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //#endregion

    public static CategorioProductoBuilder builder() {
        return new CategorioProductoBuilder();
    }
    @Override
    public String toString() {
        return "CategoriaProducto{" +
                "idCategoriaProducto=" + idCategoriaProducto +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}