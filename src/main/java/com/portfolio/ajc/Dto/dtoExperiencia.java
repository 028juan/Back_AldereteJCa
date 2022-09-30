/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ajc.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author yiyoa
 */
public class dtoExperiencia {
    @NotBlank
    private String img;
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String img, String nombreE, String descripcionE) {
        this.img = img;
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
