package Backend.Gestores;

import Backend.Entidades.Lote;
import Backend.Entidades.Producto;
import Backend.Entidades.Venta;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
    public static List<Lote> filtrarPorCaducar
            (List<Lote> listaFiltrar, int diasFalta){
        return
                listaFiltrar.stream().filter
                        (p -> ChronoUnit.DAYS.between(LocalDate.now(),
                                p.getFechaCaducidad()) == diasFalta).toList();
    }

/*    public static void main(String[] args) {
        CtrlPaqueteProducto ctrlProducto = new CtrlPaqueteProducto();
        List<PaqueteProducto> k = ctrlProducto.listar();
        //k.forEach(System.out::println);
        GestorDeFiltro.filtrarPorCaducar(k, 1).forEach(System.out::println);

    }*/
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
