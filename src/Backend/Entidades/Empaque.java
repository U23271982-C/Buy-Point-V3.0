package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Empaque implements GestorSQLServer {
    private int idEmpaque;
    private String TipoEmpaque;

    public Empaque() {
    }

    //#region Getters and Setters

    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public String getTipoEmpaque() {
        return TipoEmpaque;
    }

    public void setTipoEmpaque(String tipoEmpaque) {
        this.TipoEmpaque = tipoEmpaque;
    }

    //#endregion


    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO Empaque(TipoEmpaque)\n" +
                        "VALUES('%s')", getTipoEmpaque());

        GestorSQLServer.modificar_Registro(consultaSQL
                , "Empaque registrado",
                "No se registro el Empaque");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
