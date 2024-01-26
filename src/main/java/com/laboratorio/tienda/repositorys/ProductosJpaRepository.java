/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.laboratorio.tienda.repositorys;

import com.laboratorio.tienda.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 *
 * @author cdpos
 */
public interface ProductosJpaRepository extends JpaRepository<Productos,Long>, JpaSpecificationExecutor<Productos> {

    List<Productos> findByNombre(String nombre);
    List<Productos> findByDescripcion(String descripcion);
    List<Productos> findByCosto(Float costo);
    List<Productos> findByUtilidad(Float utilidad);
    List<Productos> findByCantidad(Integer cantidad);
    List<Productos> findByPrecioUni(Float precioUni);


}
