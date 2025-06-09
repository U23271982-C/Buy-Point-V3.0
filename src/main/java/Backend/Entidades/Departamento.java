package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Departamento {
    private int idDepartamento;
    private short Torre;
    private short Departamento;

    public Departamento() {}

}
