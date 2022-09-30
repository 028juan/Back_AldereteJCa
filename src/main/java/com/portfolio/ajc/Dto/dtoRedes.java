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
public class dtoRedes {
    
    @NotBlank
    private String imgRed;
    @NotBlank
    private String linkRed;

    public dtoRedes() {
    }

    public dtoRedes(String imgRed, String linkRed) {
        this.imgRed = imgRed;
        this.linkRed = linkRed;
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
