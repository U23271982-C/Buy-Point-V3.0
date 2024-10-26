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
public class Producto implements GestorSQLServer {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int codigoBarras;
    private int idEmpaque;
    private int idCategoriaProducto;

    public Producto() {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarras = codigoBarras;
        this.idEmpaque = idEmpaque;
        this.idCategoriaProducto = idCategoriaProducto;
    }

    //#region Getters and Setters
        public int getIdProducto() {
        return idProducto;
    }

        public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

        public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public String getDescripcion() {
        return descripcion;
    }

        public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

        public int getCodigoBarras() {
        return codigoBarras;
    }

        public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

        public int getIdEmpaque() {
        return idEmpaque;
    }

        public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

        public int getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

        public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
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

    public boolean productoRegistrado(String codigoBarras){
        return false;
    }
}
