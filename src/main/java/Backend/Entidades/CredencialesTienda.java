package Backend.Entidades;

public class CredencialesTienda {
    private int id;
    private String usuario;
    private String contrasenna;
    private String nombre;
    private String direccion;
    private String correoElectronico;
    //private boolean estado;

    public CredencialesTienda() {
    }

    public CredencialesTienda(int id, String usuario,
                              String contrasenna, String nombre,
                              String direccion, String correoElectronico) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
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
    public String toString() {
        return "CredencialesUsuario{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
