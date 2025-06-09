package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Comprobante {
    private int idComprobante;
    private String comprobante;

    TipoPago tipoPago;

    public Comprobante() {
        this.tipoPago = new TipoPago();
    }

}
