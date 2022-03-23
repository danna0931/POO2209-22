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
public class Productora {
    private String nombreProductora;
    private int edad;

    public Productora() {
    }

    public Productora(String nombreProductora, int edad) {
        this.nombreProductora = nombreProductora;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombreProductora=" + nombreProductora + ", edad=" + edad + '}';
    }
    
    public void producir(){
        System.out.println(this.nombreProductora+" está produciendo...");
    }
}
