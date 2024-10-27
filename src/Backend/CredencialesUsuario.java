package Backend;

import Backend.ConexionBD.GestorSQLServer;

public class CredencialesUsuario implements GestorSQLServer {
    private int     id;
    private String usuario;
    private String contrasenna;
    private String nombre;
    private String direccion;
    private String correoElectronico;
    //private boolean estado;

    public CredencialesUsuario() {
        this.id = 0;
        this.usuario = "";
        this.contrasenna = "";
        this.nombre = "";
        this.direccion = "";
        this.correoElectronico = "";
    }

    //#region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //#endregion


    @Override
    public void registrar() {
        String consultaSQL = String.format("INSERT INTO CredencialesTienda\n" +
                        "(Usuario, Constrasenna, Nombre, Direccion, CorreoElectronico)\n" +
                        "VALUES('%s', '%s', '%s', '%s', '%s')",
                getUsuario(), getContrasenna(), getNombre(), getDireccion(),
                getCorreoElectronico());

        GestorSQLServer.modificar_Registro
                (consultaSQL
                        , "Credenciales de usuario registrado",
                        "No se registro las credenciales de usuario");
    }

    @Override
    public void eliminar() {

    }

    @Override
    public void actualizar() {

    }
}
