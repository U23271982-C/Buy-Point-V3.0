package Backend.Entidades;

public class TipoPago extends Entidad {
    private int idTipoPago;
    private String TipoPago;

    public TipoPago() {
    }

    //#region Getters and Setters

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String tipoPago) {
        TipoPago = tipoPago;
    }

    //#endregion

}
