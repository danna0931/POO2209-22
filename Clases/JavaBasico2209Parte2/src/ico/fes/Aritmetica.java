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
public class Aritmetica {
    private int a;
    private int b;

    public Aritmetica() {
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + ", b=" + b + '}';
    }
    
    
    public int sumar(){
        return this.a+this.b;
    }
    
    public int dividir () throws ArithmeticException{
        return this.a/this.b;
    }
    
    
}
