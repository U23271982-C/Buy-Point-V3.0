package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class TipoPago implements GestorSQLServer {
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


    @Override
    public void registrar() {
        String consultaSQL = String.format
                ("INSERT INTO TipoPago" +
                                "(TipoPago)\n" +
                                "VALUES('%s')", getTipoPago());

        GestorSQLServer.modificar_Registro(consultaSQL
                , "Tipo de pago registrado",
                "No se registro el tipo de pago");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
