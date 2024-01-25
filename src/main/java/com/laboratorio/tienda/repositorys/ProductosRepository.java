/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laboratorio.tienda.repositorys;

import com.laboratorio.tienda.models.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cdpos
 */
public class ProductosRepository extends JpaRepository<Productos, Long>, JpaSpecificationExecutor<Productos>{
    
}
