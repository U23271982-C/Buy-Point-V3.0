package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Codigo {
    private int idCodigo;
    private String codigo;
    
    Producto producto;

    public Codigo() {}

}
