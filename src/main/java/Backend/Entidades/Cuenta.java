package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
    private int idCuenta;
    private String nombre;
    private String apellido;
    private int telefono;
}
