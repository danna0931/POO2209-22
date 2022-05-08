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

public class Cuadrado implements Figura {
    
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

 
    @Override
    public float calcularArea() {
        System.out.println("Multiplicando lado por lado");
        return this.lado*this.lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

      @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
  
    
    
}
