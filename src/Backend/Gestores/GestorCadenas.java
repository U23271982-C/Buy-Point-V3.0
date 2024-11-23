package Backend.Gestores;

import javax.swing.*;

public interface GestorCadenas {
    static boolean cadenaCorrecta(String cadena, int longitudCadena){
        //boolean rs = true;
<<<<<<< HEAD
        if (cadena.matches("^[a-zA-Z]+[0-9]*$") & cadena.length() <= longitudCadena ) {
=======
        if (cadena.matches("^[a-zA-Z]+[0-9]*$") & cadena.length() <= longitudCadena) {
>>>>>>> master
            return true;
        }else {
            JOptionPane.showMessageDialog(null, """
                - La cadena ingresada supera la longitud máxima permitida.
                - La cadena no puede empezar con números. Ejmplo correcto:
                        "Producto123"
                ""","Advertencia", 2);
            return false;
        }
    }

}
