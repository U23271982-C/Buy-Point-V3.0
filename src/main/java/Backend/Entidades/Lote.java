package Backend.Entidades;

import lombok.*;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor

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
