/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico2209;

/**
 *
 * @author dannapaola
 */
public class Arbol {
    private float altura;
    private int edad;
    public static final int tronco=1;

    public Arbol() {
    }

    public Arbol(float altura, int edad) {
        this.altura = altura;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "altura=" + altura + ", edad=" + edad + '}';
    }
    
    public void crecer(float crecimiento){
        System.out.println("Altura actual: "+this.altura);
        this.altura += crecimiento;
        System.out.println("Altura posterior: "+this.altura);
    }
    
    public static void generarOxigeno (){
        System.out.println("Generando oxigeno...");
    } 
    
}
