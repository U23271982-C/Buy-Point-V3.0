package Backend;

import Backend.ConexionBD.GestorSQLServer;

public class Comprobante implements GestorSQLServer {
    private int idComprobante;
    private String comprobante;
    private int idTipoPago;

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

    public int getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        this.idTipoPago = idTipoPago;
    }
    //#endregion

    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO Comprobante(Comprobante)\n" +
                "VALUES('%s')", getComprobante());
        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Comprobante registrado",
                        "Comprobante no registrado");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
