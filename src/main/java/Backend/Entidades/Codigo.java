package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Codigo {
    private int idCodigo;
    private String codigo;
    
    Producto producto;
}
