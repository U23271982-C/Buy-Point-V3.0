package Backend;

import Backend.ConexionBD.GestorSQLServer;

public class Departamento implements GestorSQLServer {
    private int idDepartamento;
    private short Torre;
    private short Departamento;

    public Departamento() {
    }

    //#region Getters and Setters

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public short getTorre() {
        return Torre;
    }

    public void setTorre(short torre) {
        Torre = torre;
    }

    public short getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(short departamento) {
        Departamento = departamento;
    }

    //#endregion


    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO Departamento(Torre, Departamento)\n" +
                "VALUES(%d,%d)", getTorre(), getDepartamento());
        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Departamento registrado",
                        "No se registro el departamento");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
