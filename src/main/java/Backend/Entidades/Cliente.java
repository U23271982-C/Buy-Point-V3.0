package Backend.Entidades;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Cliente {

    private int idCliente;
    private String cliente;
    private String identificacion;

    Departamento departamento;
    Cuenta cuenta;

    public Cliente() {
        this.departamento = new Departamento();
        this.cuenta = new Cuenta();
    }

}
