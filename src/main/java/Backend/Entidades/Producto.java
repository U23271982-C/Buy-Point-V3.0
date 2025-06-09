/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 *
 * @author ISRAEL
 */
@Builder
@Getter
@Setter
@ToString
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private BigDecimal precio;
    private BigDecimal precioCosto;
    private BigDecimal utilidad;


    Empaque empaque;
    CategoriaProducto categoriaProducto;
    Inventario inventario;
    Codigo codigo;
    Lote lote;

    public Producto() {
        this.empaque = new Empaque();
        this.categoriaProducto = new CategoriaProducto();
        this.inventario = new Inventario();
        this.codigo = new Codigo();
        this.lote = new Lote();
    }
}
