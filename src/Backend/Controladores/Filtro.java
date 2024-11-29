package Backend.Controladores;

import Backend.Entidades.Entidad;
import Backend.Entidades.Inventario;
import Backend.Entidades.PaqueteProducto;
import Backend.Entidades.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filtro <T extends Producto> {

    public Filtro() {
    }
    
    
    List<Comparator<T>> comparators = new ArrayList<>(Arrays.asList(
            // 1 Precio ascendentemente
            Comparator.comparing(T::getPrecio).reversed(),
            // 2 Precio descendentemente
            Comparator.comparing(T::getPrecio),
            // 3 Nombre ascendentemente
            Comparator.comparing(T::getNombreProducto).reversed(),
            // 4 Nombre desendente
            Comparator.comparing(T::getNombreProducto)

            /*// 5 Stock ascendetemente
            Comparator.comparing(Producto -> Producto).reversed(),
            // 6 Stock descendentemente
            Comparator.comparing(Inventario::getStock),
            // 7 FechaCaducidad
            Comparator.comparing(PaqueteProducto::getFechaCaducidad)
                            .reversed()*/
    ));

    public List<T> ordenarProductos (List<T> listaOrdenar, int posicionCondicion){
        return listaOrdenar.stream().sorted(comparators.get(posicionCondicion)).toList();
    }
}
