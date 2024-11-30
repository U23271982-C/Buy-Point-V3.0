package Backend.Controladores;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.List;
import org.jfree.chart.plot.PlotOrientation;

public interface GraficadorEstadisticas {
    static JFreeChart graficar(String titulo, String ejeX, String ejeY,
                               List<String> etiquetas, List<Integer> valores) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < valores.size(); i++) {
            dataset.addValue(valores.get(i), "Total", etiquetas.get(i));
        }

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
