/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ajc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author yiyoa
 */
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String imgS;
    private String nombreS;
    private int porcentajeS;

    public Skills() {
    }

    public Skills(String imgS, String nombreS, int porcentajeS) {
        this.imgS = imgS;
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgS() {
        return imgS;
    }

    public void setImgS(String imgS) {
        this.imgS = imgS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(int porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
    
    
    
    
    
    
    
}
