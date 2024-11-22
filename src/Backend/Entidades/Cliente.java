package Backend.Entidades;

public class Cliente extends Entidad {

    private int idCliente;
    private String cliente;
    private String identificacion;

    Departamento departamento;
    Cuenta cuenta;

    //#region Getters and Setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    //#endregion
    
}
