/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelicula;

/**
 *
 * @author dannapaola
 */
public class Director {
    
    private String nombreDirector;
    private String nacionalidad;

    public Director() {
    }

    public Director(String nombreDirector, String nacionalidad) {
        this.nombreDirector = nombreDirector;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Director{" + "nombreDirector=" + nombreDirector + ", nacionalidad=" + nacionalidad + '}';
    }
    
    public void dirigir(){
        System.out.println(this.nombreDirector+" está dirigiendo...");
    }
    
    
    
    
    
}
