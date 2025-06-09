/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ISRAEL
 */
@Builder
@Getter
@Setter
@ToString
public class CategoriaProducto {
    private int idCategoriaProducto;
    private String nombre;

    public CategoriaProducto() {}

}