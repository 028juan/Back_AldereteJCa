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
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String imgP;
    private String nombreP;
    private String descripcionP;
    private String paginaP;
    private String repositorioP;

    public Proyecto() {
    }

    public Proyecto(String imgP, String nombreP, String descripcionP, String paginaP, String repositorioP) {
        this.imgP = imgP;
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.paginaP = paginaP;
        this.repositorioP = repositorioP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
