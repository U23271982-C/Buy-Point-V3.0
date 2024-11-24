package Backend.Controladores;

import Backend.Entidades.Producto;

import java.util.List;

@FunctionalInterface
public interface OrdenadorApp {
    List<Producto> ordenar(List<Producto> listaOrdenar, int num);
}
