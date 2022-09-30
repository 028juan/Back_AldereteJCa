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

public class dtoEducacion {
     @NotBlank
    private String imgE;
      @NotBlank
    private String institucionE;
       @NotBlank
    private String tituloE;
      
    private int anioE;
         @NotBlank
    private String condicionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String imgE, String institucionE, String tituloE, int anioE, String condicionE) {
        this.imgE = imgE;
        this.institucionE = institucionE;
        this.tituloE = tituloE;
        this.anioE = anioE;
        this.condicionE = condicionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public int getAnioE() {
        return anioE;
    }

    public void setAnioE(int anioE) {
        this.anioE = anioE;
    }

    public String getCondicionE() {
        return condicionE;
    }

    public void setCondicionE(String condicionE) {
        this.condicionE = condicionE;
    }
    

    
}