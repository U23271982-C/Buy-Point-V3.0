package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Codigo implements GestorSQLServer {
    private int idCodigo;
    private String codigo;
    Producto producto;

    public Codigo() {
    }

    //#region Getters and Setters

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //#endregion

    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO Codigo(Codigo, ID_Producto)\n" +
                "VALUES('%s', %d)",getCodigo(), producto.getIdProducto());
        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Codigo barras registrado en el producto",
                        "No se registro el código de barras");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
