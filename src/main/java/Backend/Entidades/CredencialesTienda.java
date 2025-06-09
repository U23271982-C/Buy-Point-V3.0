package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CredencialesTienda {
    private int id;
    private String usuario;
    private String contrasenna;
    private String nombre;
    private String direccion;
    private String correoElectronico;

}
