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

// Capitulo 11; 412-425
public interface Figura {
    
    public static final float PI=3.1416f;
    public static final int CUADRADO=1;
    public static final int CIRCULO =2;
    public static final int TRIANGULO =3;
    public static final int RECTANGULO =4;
    
    public abstract float calcularArea();
    
}
