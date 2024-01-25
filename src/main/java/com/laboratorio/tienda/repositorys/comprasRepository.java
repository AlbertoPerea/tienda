/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.laboratorio.tienda.repositorys;

import com.laboratorio.tienda.models.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cdpos
 */
public interface comprasRepository extends JpaRepository<Compras,Long>{
    
}
