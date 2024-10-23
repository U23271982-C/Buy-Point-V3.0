/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author ISRAEL
 */
public class Producto implements GestionadorRegistro{
    private int id;
    private String nombre;
    private String descripcion;
    private int codigoBarras;
    private int idEmpaque;
    private int idCategoriaProducto;

    public Producto(int id, String nombre, String descripcion,
                    int codigoBarras, int idEmpaque,
                    int idCategoriaProducto) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarras = codigoBarras;
        this.idEmpaque = idEmpaque;
        this.idCategoriaProducto = idCategoriaProducto;
    }
//#region Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public void registrar(Object obj) {
        obj = new Producto(getId(),getNombre(),getDescripcion(),getCodigoBarras()
                ,getIdEmpaque(),getIdCategoriaProducto());

        Inventario inventario = new Inventario();
        inventario.registrar(inventario);
    }

    @Override
    public void eliminarRegistro(Object obj) {
        System.out.println();
    }
    public boolean productoRegistrado(String codigoBarras){
        return GestionadorRegistro.registroEncontrado
                (String.format("SELECT * FROM Producto WHERE CodigoBarras = %s",
                        codigoBarras));
    }
}
