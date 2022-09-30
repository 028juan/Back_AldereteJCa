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
public class Redes {
     @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String imgRed;
    private String linkRed;

    public Redes() {
    }

    public Redes(String imgRed, String linkRed) {
        this.imgRed = imgRed;
        this.linkRed = linkRed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgRed() {
        return imgRed;
    }

    public void setImgRed(String imgRed) {
        this.imgRed = imgRed;
    }

    public String getLinkRed() {
        return linkRed;
    }

    public void setLinkRed(String linkRed) {
        this.linkRed = linkRed;
    }
    
}
