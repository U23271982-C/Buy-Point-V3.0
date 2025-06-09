package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
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
