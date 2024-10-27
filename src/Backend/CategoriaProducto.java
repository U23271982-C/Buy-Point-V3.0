/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.ConexionBD.GestorSQLServer;

/**
 *
 * @author ISRAEL
 */
public class CategoriaProducto implements GestorSQLServer {
    private int idCategoriaProducto;
    private String nombre;
    private String productos;

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

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    //#endregion


    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO CategoriaProducto(NombreCategoria)\n" +
                "VALUES('%s')", getNombre());
        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Categoría registrada",
                        "No se registro la categoría");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
