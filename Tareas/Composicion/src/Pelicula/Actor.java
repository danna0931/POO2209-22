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
public class Actor {
    private String nombreActor;
    private int edad;

    public Actor() {
    }

    public Actor(String nombreActor, int edad) {
        this.nombreActor = nombreActor;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombreActor=" + nombreActor + ", edad=" + edad + '}';
    }
    
    public void actuar(){
        System.out.println(this.nombreActor+" está actuando...");
    }

}
