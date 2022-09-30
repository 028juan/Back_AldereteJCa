/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ajc.Repository;

import com.portfolio.ajc.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yiyoa
 */
public interface REducacion extends JpaRepository<Educacion,Integer>{
    public Optional<Educacion> findByTituloE(String tituloE);
    public boolean existsByTituloE(String tituloE);
    
    
    
    
}
