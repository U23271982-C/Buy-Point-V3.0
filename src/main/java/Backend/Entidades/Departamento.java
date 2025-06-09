package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {
    private int idDepartamento;
    private short torre;
    private short departamento;

}
