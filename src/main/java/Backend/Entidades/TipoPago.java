package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class TipoPago {
    private int idTipoPago;
    private String TipoPago;

    public TipoPago() {
    }
}
