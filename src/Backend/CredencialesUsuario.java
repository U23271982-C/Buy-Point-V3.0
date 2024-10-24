package Backend;

public class CredencialesUsuario implements GestionadorRegistro{
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
        CredencialesUsuario credencialesUsuario = new CredencialesUsuario();
        String consultaSQL =
                String.format("INSERT INTO CredencialesTienda" +
                                "(Usuario, Constrasenna, Nombre, Direccion, CorreoElectronico) " +
                                "VALUES ('%s','%s', '%s', '%s', '%s')",
                        credencialesUsuario.getUsuario(),credencialesUsuario.getContrasenna(),
                        credencialesUsuario.getNombre(),credencialesUsuario.getDireccion(),
                        credencialesUsuario.getCorreoElectronico());
    }

    @Override
    public void eliminarRegistro() {
        String consultaSQL = String.format("DELETE FROM CredencialesTienda" +
                "WHERE Usuario = '%s' AND Constrasenna = '%s'",
                getUsuario(),getContrasenna());
        //falta a la bd para la consulta
    }

}
