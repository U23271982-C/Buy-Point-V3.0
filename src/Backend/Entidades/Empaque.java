package Backend.Entidades;

public class Empaque extends Entidad {
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
    public String toString() {
        return "Empaque{" +
                "idEmpaque=" + idEmpaque +
                ", TipoEmpaque='" + TipoEmpaque + '\'' +
                '}';
    }
}
