package com.laboratorio.tienda.repositorys;

import java.util.List;

import com.laboratorio.tienda.models.Productos;
import com.laboratorio.tienda.repositorys.utils.SearchCriteria;
import com.laboratorio.tienda.repositorys.utils.SearchOperation;
import com.laboratorio.tienda.repositorys.utils.SearchStatement;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class ProductosRepository {

    private final ProductosJpaRepository repository;

    public List<Productos> getProductos() {
        return repository.findAll();
    }

    public List<Productos> search(String nombre, String descripcion, Float costo, Float utilidad, Integer cantidad,
            Float precioUni) {
        SearchCriteria<Productos> spec = new SearchCriteria<>();
        if (StringUtils.isNotBlank(nombre)) {
            spec.add(new SearchStatement("nombre", nombre, SearchOperation.MATCH));
        }

        if (StringUtils.isNotBlank(descripcion)) {
            spec.add(new SearchStatement("descripcion", descripcion, SearchOperation.EQUAL));
        }
        /*
         * if (StringUtils.isNotBlank(costo)) {
         * spec.add(new SearchStatement("costo", descripcion, SearchOperation.MATCH));
         * }
         * if (StringUtils.isNotBlank(String.valueOf(utilidad))) {
         * spec.add(new SearchStatement("utilidad", descripcion,
         * SearchOperation.MATCH));
         * }
         * if (StringUtils.isNotBlank(String.valueOf(cantidad))) {
         * spec.add(new SearchStatement("descripcion", descripcion,
         * SearchOperation.EQUAL));
         * }
         * if (StringUtils.isNotBlank(String.valueOf(precioUni))) {
         * spec.add(new SearchStatement("descripcion", descripcion,
         * SearchOperation.MATCH));
         * }
         */
        return repository.findAll(spec);
    }

}
