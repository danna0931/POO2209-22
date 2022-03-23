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
public class Pelicula {
    // Atributos:
    private String nombrePeli;
    private float duracion;
    // +
    private Actor actor;
    private Director director;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String nombrePeli, float duracion, Actor actor, Director director, Productora productora) {
        this.nombrePeli = nombrePeli;
        this.duracion = duracion;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePeli=" + nombrePeli + ", duracion=" + duracion + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
    
    
     
}
