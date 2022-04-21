/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author dannapaola
 */
public class PruebasPolimorfismo {
    public static void main (String args []){
        System.out.println("Hola polimorfismo");
        Persona per1= new Persona();
        per1.setNombre("Danna");
        per1.dormir();
        
        Alumno al1=new Alumno ();
        al1.setNombre("José");
        al1.dormir();
        al1.dormir(4);
        
        
    }
    
}
