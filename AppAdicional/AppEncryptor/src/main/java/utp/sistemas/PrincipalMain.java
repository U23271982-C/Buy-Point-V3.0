package utp.sistemas;

import java.io.*;
import java.util.Properties;

public class PrincipalMain {


    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java -jar Encriptador.jar <entrada.properties> <salida.properties>");
            return;
        }

        String archivoEntrada = args[0];
        String archivoSalida = args[1];

        try {
            // Leer el archivo de entrada
            Properties propsEntrada = new Properties();
            propsEntrada.load(new FileInputStream(archivoEntrada));

            // Encriptar los valores
            Properties propsSalida = new Properties();
            for (String clave : propsEntrada.stringPropertyNames()) {
                String valorOriginal = propsEntrada.getProperty(clave);
                String valorEncriptado = Encryptador.encryptar(valorOriginal);
                propsSalida.setProperty(clave, valorEncriptado);
            }

            // Guardar el archivo de salida
            propsSalida.store(new FileOutputStream(archivoSalida), "Archivo con datos encriptados");

            System.out.println("Archivo generado exitosamente: " + archivoSalida);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}