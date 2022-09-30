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
public class dtoProyecto {
    @NotBlank
     private String imgP;
     @NotBlank
     private String nombreP;
     @NotBlank
     private String descripcionP;
     @NotBlank
     private String paginaP;
     @NotBlank
     private String repositorioP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String paginaP, String repositorioP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.paginaP = paginaP;
        this.repositorioP = repositorioP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getPaginaP() {
        return paginaP;
    }

    public void setPaginaP(String paginaP) {
        this.paginaP = paginaP;
    }

    public String getRepositorioP() {
        return repositorioP;
    }

    public void setRepositorioP(String repositorioP) {
        this.repositorioP = repositorioP;
    }
    
     
     
    
    
}
