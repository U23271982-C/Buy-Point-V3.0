/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author ISRAEL
 */
public class CategoriaProducto implements GestionadorRegistro{
    private String idCategoriaProducto;
    private String nombre;
    private String productos;

    public CategoriaProducto() {
    }

    //#region Getters and Setters

    public String getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(String idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public void registrar() {

    }
    //#endregion

    @Override
    public void eliminar() {

    }
}
