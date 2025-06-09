package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Cuenta {
    private int idCuenta;
    private String nombre;
    private String apellido;
    private int telefono;

    public Cuenta() {}

}

