package Backend.Gestores;

import Backend.Controladores.CtrlVenta;

import java.util.List;

public class GestorReporte {
    public String cuerpoReporte(int num){
        List<Object[]> lista = CtrlVenta.utilidadFecha(num);

        return null;
    }

    public void generar(){

    }
}
