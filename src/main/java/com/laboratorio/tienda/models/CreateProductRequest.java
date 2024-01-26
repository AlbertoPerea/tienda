package com.laboratorio.tienda.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
    private String nombre;
    private String descripcion;
    private Float costo;
    private Float utilidad;
    private Integer cantidad;
    private Float precioUni;
}
