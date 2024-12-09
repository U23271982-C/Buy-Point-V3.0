package Backend.Gestores;

import Backend.Controladores.CtrlVenta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GestorReporte {
    String fomCabeceraReporte = """
            ------------------------------------
            Reporte
            Fecha emisión: %s
            ------------------------------------
            """;
    String fomCuerpoReporte = """
            Ingreso máximo:
                Fecha: %s
                Monto: %.2f
            Ingreso mínimo:
                Fecha: %s
                Monto: %.2f
            Ingreso promedio:
                Monto: %.2f
            Ingreso Medio:
                Monto: %.2f
            ------------------------------------
            """;
    public GestorReporte() {
    }

    public String cuerpoReporte(int num){
        List<Object[]> lista = CtrlVenta.utilidadFecha(num);
        List<Object> listFechas = new ArrayList<>();
        List<Object> utilidadesTotales = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.getFirst().length; j++) {

                Object n = lista.get(i)[j];
                Object k = lista.get(i)[j + 1];

                listFechas.add(n);
                utilidadesTotales.add(k);
            }
        }
        List<LocalDate> fechasF = listFechas.stream()
                .map(obj -> LocalDate.parse(obj.toString()))
                .toList();
        List<Double> utilidades = utilidadesTotales.stream()
                .map(obj -> Double.parseDouble(obj.toString()))
                .toList();

        // Monto máx
        double maxUtilidades = utilidades.stream().
                mapToDouble(Double::doubleValue).max().orElse(0.0);
        // Monto min
        double minUtilidades = utilidades.stream().
                mapToDouble(Double::doubleValue).min().orElse(0.0);
        // Monto promedio
        double promedioUtilidades = utilidades.stream().
                mapToDouble(Double::doubleValue).average().orElse(0.0);



        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format(fomCabeceraReporte,

                LocalDate.now().format(df)
        );
    }

    public static void main(String[] args) {
        GestorReporte gestorReporte = new GestorReporte();
        gestorReporte.cuerpoReporte(3);
    }

    public void generar(){

    }
}
