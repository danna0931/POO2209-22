/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

/**
 *
 * @author dannapaola
 */
// Java Bean; Bean= semilla o frijol, tiene una capa que lo protege.
public class Persona { 
    //Atributos
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0 && edad<=120){
            this.edad = edad;
        }else{
            System.out.println("Valor fuera de rango");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
