/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

/**
 *
 * @author ISRAEL
 */
public class Producto implements GestorSQLServer {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private boolean tieneEmpaque;
    Empaque empaque;
    CategoriaProducto categoriaProducto;
    //Registra junto con Producto
    Codigo codigo;
    PaqueteProducto paqueteProducto;
    Inventario inventario;

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

    public boolean isTieneEmpaque() {
        return tieneEmpaque;
    }

    public void setTieneEmpaque(boolean tieneEmpaque) {
        this.tieneEmpaque = tieneEmpaque;
    }

    //#endregion

    public Producto() {
    }


    @Override
    public void registrar() {
        String consultaSQL = String.format
                ("INSERT INTO Producto(NombreProducto, Descripcion, " +
                        "ID_Empaque, ID_CategoriaProducto)\n" +
                        "VALUES('%s', '%s', %d, %d)",
                        getNombreProducto(), getDescripcion(),
                        empaque.getIdEmpaque(), categoriaProducto.getIdCategoriaProducto());

        if (!isTieneEmpaque()){
            consultaSQL = String.format
                    ("INSERT INTO Producto(NombreProducto, Descripcion, ID_CategoriaProducto)\n" +
                                    "VALUES('%s', '%s', %d)",
                            getNombreProducto(), getDescripcion(),
                            categoriaProducto.getIdCategoriaProducto());
        };//Registra producto sin empaque

        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Producto registrada",
                        "No se registro el producto");

        //Registra producto, registra junto con el el codigo, paquete e inventario
        codigo.registrar();//Registra codigo nuevo producto
        paqueteProducto.registrar();//Registra paquete del nuevo producto
        inventario.registrar();//Registra invetario del nuevo producto
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }

    /*public boolean productoRegistrado(String codigoBarras){
        return false;
    }*/
}
