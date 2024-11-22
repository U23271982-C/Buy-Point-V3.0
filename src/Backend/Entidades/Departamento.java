package Backend.Entidades;

public class Departamento extends Entidad {
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

}
