package com.laboratorio.tienda.repositorys;

import com.laboratorio.tienda.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos,Long> {
}
