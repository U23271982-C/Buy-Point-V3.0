package Backend.Entidades;

public class Comprobante extends Entidad {
    private int idComprobante;
    private String comprobante;

    TipoPago tipoPago;

    public Comprobante() {
        this.tipoPago = new TipoPago();
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

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }


    //#endregion

}
