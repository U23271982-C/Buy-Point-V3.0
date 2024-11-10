package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Comprobante extends Entidad {
    private int idComprobante;
    private String comprobante;

    TipoPago tipoPago;

    public Comprobante() {
    }

    //#region Getters and Setters

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    //#endregion

}
