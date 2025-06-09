package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Empaque {
    private int idEmpaque;
    private String TipoEmpaque;

}
