/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

/**
 *
 * @author ISRAEL
 */
public class CategoriaProducto extends Entidad {
    private int idCategoriaProducto;
    private String nombre;

    public CategoriaProducto() {
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


    @Override
    public String toString() {
        return "CategoriaProducto{" +
                "idCategoriaProducto=" + idCategoriaProducto +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}