package Backend.Gestores;

import Backend.Controladores.CtrlProducto;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.jfree.chart.plot.PlotOrientation;

public class GestorGraficadorEstadisticas {
    CtrlProducto ctrlProducto = new CtrlProducto();

    private HashMap<Integer, List<Integer>> condicionGraficos =
            new HashMap<>(){{
                put(0, ctrlProducto.listar()
                        .stream().map(p -> p.getInventario().getStock()).toList());
                put(1, ctrlProducto.listar()
                        .stream().map(p -> p.getInventario().getSalida()).toList());
            }};
    public List<String> listaTiposCondiciones = new ArrayList<>(Arrays.asList(
        "Cantidad de Stock por Producto",
        "Cantidad de Productos vendidos"
    ));
    public GestorGraficadorEstadisticas() {
    }

    public  JFreeChart graficar(String titulo, String ejeX, String ejeY,
                               List<String> etiquetas, int indxCondicion) {

        List<Integer> lista = condicionGraficos.get(indxCondicion);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < lista.size(); i++) {
            dataset.addValue(lista.get(i), "Total", etiquetas.get(i));
        }
        //createBarChart3D
        return ChartFactory.createBarChart3D(
                titulo,
                ejeX,
                ejeY,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    }
}
