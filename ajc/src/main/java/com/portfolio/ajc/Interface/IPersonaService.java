/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ajc.Interface;

import com.portfolio.ajc.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer persona trae una lista de personas
    public List<Persona> getPersona();
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    //eliminar un objeto por el id
    public void deletePersona(Long id);
    //buscar una persona
    public Persona findPersona(Long id);
    
}
