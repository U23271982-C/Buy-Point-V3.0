package Backend;

import Backend.ConexionBD.GestorSQLServer;

public class Empaque implements GestorSQLServer {
    private int idEmpaque;
    private String nombreEmpaque;

    public Empaque() {
    }

    //#region Getters and Setters

    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public String getNombreEmpaque() {
        return nombreEmpaque;
    }

    public void setNombreEmpaque(String nombreEmpaque) {
        this.nombreEmpaque = nombreEmpaque;
    }

    //#endregion


    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO Empaque(TipoEmpaque)\n" +
                        "VALUES('%s')",getNombreEmpaque());

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
