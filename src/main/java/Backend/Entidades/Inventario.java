/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Entidades;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    private int idInventario;
    private int salida;
    private int stock;
    private BigDecimal valorStock;

}
