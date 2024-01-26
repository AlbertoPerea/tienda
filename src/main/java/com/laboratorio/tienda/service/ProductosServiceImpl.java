package com.laboratorio.tienda.service;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laboratorio.tienda.models.Productos;
import com.laboratorio.tienda.repositorys.ProductosRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
@Service
@Slf4j
public class ProductosServiceImpl implements ProductosService{
    @Autowired
    private ProductosRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<Productos> getProducts(String nombre, String descripcion,Float costo, Float utilidad, Integer cantidad, Float precioUni) {

        if (StringUtils.hasLength(nombre) || StringUtils.hasLength(descripcion)||StringUtils.hasLength(String.valueOf(costo))||StringUtils.hasLength(String.valueOf(utilidad))||StringUtils.hasLength(String.valueOf(cantidad))||StringUtils.hasLength(String.valueOf(precioUni))) {
            return repository.search(nombre, descripcion, costo, utilidad, cantidad, precioUni);
        }

        List<Productos> products = repository.getProductos();
        return products.isEmpty() ? null : products;
    }




}
