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

// Java bean ; POJO

public class Circulo implements Figura {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return  Figura.PI * (this.radio*this .radio);
    }
    
    /*
    Principio de diseño L. P:0, 1 e infinito : Solo los valores 1, 0 e infinitos
    son validos para usarse en la codificacion de algoritmos. El lenguaje de programacion
    debe proporcionar  un mecanismo para evitar literales númericas en el programa
    */
    
   
}
    
    

