/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laboratorio.tienda.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author cdpos
 */
@Entity
@Table(name = "productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producto_id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "costo")
    private float costo;

    @Column(name = "utilidad")
    private float utilidad;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precioUni")
    private float precioUni;
    
    @OneToOne(mappedBy = "productos")
    private DetalleCompras detalleCompras;

    public void update(ProductosDto productDto) {
        this.nombre = productDto.getNombre();
        this.descripcion = productDto.getDescripcion();
        this.costo = productDto.getCosto();
        this.utilidad = productDto.getUtilidad();
        this.cantidad = productDto.getCantidad();
        this.precioUni = productDto.getPrecioUni();
    }

}
