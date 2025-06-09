package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@ToString
public class Lote {
    private int idPaqueteProducto;
    private int cantidad;
    private LocalDate fechaCaducidad;
    private boolean caducado;

    Producto producto;

    public Lote() {
        this.caducado = false; // Por defecto, un lote no está caducado
    }

}
