package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Cliente extends Entidad {

    private int idCliente;
    private String cliente;

    Departamento departamento;
    Cuenta cuenta;

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

    //#endregion
    
}
