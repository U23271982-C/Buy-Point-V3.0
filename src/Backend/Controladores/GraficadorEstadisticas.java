package Backend.Controladores;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.List;

public interface GraficadorEstadisticas {
    static JFreeChart graficar(String titulo, String ejeX, String ejeY,
                               List<String> etiquetas, List<Number> valores) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < valores.size(); i++) {
            dataset.addValue(valores.get(i), "Valores", etiquetas.get(i));
        }

        return ChartFactory.createBarChart3D(
                titulo,
                ejeX,
                ejeY,
                dataset
        );
    }
}
