package com.laboratorio.tienda.service;
import com.laboratorio.tienda.models.Productos;

import java.util.List;


public interface ProductosService {
    List<Productos> getProducts(String nombre, String descripcion,Float costo, Float utilidad, Integer cantidad, Float precioUni);

}
