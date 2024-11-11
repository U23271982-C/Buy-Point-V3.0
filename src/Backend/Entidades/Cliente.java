package Backend.Entidades;

import Backend.ConexionBD.GestorSQLServer;

public class Cliente implements GestorSQLServer {

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

    @Override
    public void registrar() {
        String consultaSQL = String.format
                ("INSERT INTO Cliente" +
                                "(Cliente, ID_Departamento, ID_Cuenta)\n" +
                                "VALUES(%s, %d, %d)",
                        getCliente(), departamento.getIdDepartamento(), getIdCliente());

        GestorSQLServer.modificar_Registro(consultaSQL
                , "Cliente registrado",
                "No se registro el Cliente");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
