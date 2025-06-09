package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
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
}
