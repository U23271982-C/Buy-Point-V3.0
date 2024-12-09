package Backend.Gestores;

import Backend.Entidades.Producto;
import Backend.Entidades.Venta;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class GestorDeFiltro {
    public GestorDeFiltro() {
    }

    private final List<Comparator<Producto>> compaProducto =
            new ArrayList<>(Arrays.asList(
            // 1 Precio ascendentemente
            Comparator.comparing(Producto::getPrecio).reversed(),
            // 2 Precio descendentemente
            Comparator.comparing(Producto::getPrecio),
            // 3 Nombre ascendentemente
            Comparator.comparing(Producto::getNombreProducto).reversed(),
            // 4 Nombre desendente
            Comparator.comparing(Producto::getNombreProducto)

            /*// 5 Stock ascendetemente
            Comparator.comparing(Producto -> Producto).reversed(),
            // 6 Stock descendentemente
            Comparator.comparing(Inventario::getStock),
            // 7 FechaCaducidad
            Comparator.comparing(PaqueteProducto::getFechaCaducidad)
                            .reversed()*/
    ));

    public List<Producto> ordenarProductos
            (List<Producto> listaOrdenar, int posicionCondicion){
        return listaOrdenar.stream().sorted
                (compaProducto.get(posicionCondicion)).toList();
    }
    public List<Producto> filtrarPorCaducar
            (List<Producto> listaFiltrar, int diasFalta){
        return
                listaFiltrar.stream().filter
                        (p -> ChronoUnit.DAYS.between(LocalDate.now(),
                                p.getPaqueteProducto().getFechaCaducidad())
                                == diasFalta).toList();
    }
    public List<Venta> filtrarRangoFecha
            (List<Venta> listaFiltrar,
             ChronoLocalDate inicioRango, ChronoLocalDate finRango){
        return
                listaFiltrar.stream().filter
                        (p -> !p.getFecha().isBefore(inicioRango)
                                &&
                                !p.getFecha().isAfter(finRango)).toList();
    }
}
