/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;

/**
 *
 * @author ISRAEL
 */
public class Inventario implements GestionadorRegistro {

    public ArrayList<CategoriaProducto> catogoriasProductos;
    private String id;
    private double precioCosto;
    private double precioVenta;
    private double utilidad;
    private double ingreso;
    private double salida;
    private int stock;
    private double valorStock;

    public Inventario() {
    }

    @Override
    public void eliminarRegistro() {

    }

    @Override
    public void registrar() {

    }
    static void ingresoProducto(int cantidad){
    }
    static void salidaProducto(int cantidad){
        //quita la cantidad de productos del stock y aumenta en I.salida
    }
    public int cantidadStock(){
        //retorna la cantidad de stock total
        return 0;
    }
}
