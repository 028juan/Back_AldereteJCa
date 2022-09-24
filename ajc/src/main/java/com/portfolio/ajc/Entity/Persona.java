
package com.portfolio.ajc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=1, max= 50, message="no cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min=1, max= 50, message="no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min=1, max= 50, message="no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min=1, max= 50, message="no cumple con la longitud")
    private String Localidad;
    
    
    @NotNull
    @Size(min=1, max=1550, message="no cumple con la longitud")
    private String sobremi;
    @NotNull
    @Size(min=1, max= 50, message="no cumple con la longitud")
    private String img;
    
    private String banner;

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
    

    
}
