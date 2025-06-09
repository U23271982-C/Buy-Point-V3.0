package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Comprobante {
    private int idComprobante;
    private String comprobante;

    TipoPago tipoPago;

    public Comprobante() {
        this.tipoPago = new TipoPago();
    }

}
