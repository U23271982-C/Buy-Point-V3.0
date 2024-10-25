package Backend;

import Backend.ConexionBD.GestorSQLServer;

import java.sql.Statement;

public class Codigo implements GestionadorRegistro {
    private int idCodigo;
    private String codigo;

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

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
