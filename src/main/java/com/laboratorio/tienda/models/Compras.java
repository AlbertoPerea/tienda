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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Date;
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
@Table(name = "compras")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long compra_id;

    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "total")
    private float total;
    
    @Column(name = "formaPago")
    private String formaPago;
    
    @Column(name = "pais")
    private String pais;
    
    @Column(name = "ciudad")
    private String ciudad;
    
    @Column(name = "codigoPostal")
    private String codigoPostal;
    
    @Column(name = "motivoCompra")
    private String motivoCompra;
    
    @OneToMany(mappedBy = "compras")
    private List <DetalleCompras> detalleList;
    
    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedores proveedores;
    
}
