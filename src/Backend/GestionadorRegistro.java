/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Backend;

import Backend.ConexionBD.GestorSQLServer;

/**
 *
 * @author ISRAEL
 */
public interface GestionadorRegistro {
    //registra Producto o Categoria
    void registrar();
    void eliminar();
    void actualizar();
    static boolean validar(String consulta, String mensajeError) {
        return GestorSQLServer.encontrar_Registro(consulta, mensajeError);
    }
}
