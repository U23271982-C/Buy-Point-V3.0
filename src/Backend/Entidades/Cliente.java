package Backend.Entidades;

public class Cliente extends Entidad {

    private int idCliente;
    private String cliente;
    private String identificacion;

    Departamento departamento;
    Cuenta cuenta;

    public Cliente() {
        this.departamento = new Departamento();
        this.cuenta = new Cuenta();
    }
    
    //#region Getters and Setters

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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    //#endregion


    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cliente='" + cliente + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", departamento=" + departamento +
                ", cuenta=" + cuenta +
                '}';
    }
}
