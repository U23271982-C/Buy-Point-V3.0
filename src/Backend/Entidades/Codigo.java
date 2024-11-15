package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Codigo extends Entidad {
    private int idCodigo;
    private String codigo;
    Producto producto;

    public Codigo() {
    }

    public Codigo(String codigo) {
        this.codigo = codigo;
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

}
