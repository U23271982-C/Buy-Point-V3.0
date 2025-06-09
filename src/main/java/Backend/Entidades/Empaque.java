package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Empaque {
    private int idEmpaque;
    private String TipoEmpaque;

    public Empaque() {}
}
