/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author dannapaola
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 20;
        System.out.println("Edad:" + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());

        System.out.println("---------------------------------------------------");

        // Convertir string a entero:
        String cadena = "99";
        //Metodo miembro o metodo de clase:
        int altura = Integer.parseInt(cadena);
        //Atributo miembro o atributo de clase:
        Color c1 = Color.BLUE;
        altura += 1;
        System.out.println("Altura: " + altura);
        float y = Float.parseFloat(cadena);
        y += 0.5f;
        System.out.println("Altura: " + y);

        System.out.println("---------------------------------------------------");

        /* UN ATRIBUTO DE CLASE O METODO DE CLASE (elementos miemmbro), son identificadores 
que almacenan un valor o comportamiento constante igual para todos los objetos de la misma.
Al ser constantes no es necesario crear uns instancia (objeto para acceder a ellos. */
        Arbol tree1 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        System.out.println("Troncos de un arbol= " + Arbol.tronco);
        Arbol.generarOxigeno();
        // BUSCAR: Metodo y atributo de clase ó atributo miembro o clases miembro. 
        /*
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Título", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);*/

        // codigo sin operador ternario
        int edad3 = 20;
        String resultado = "";

        if (edad3 < 18) {
            System.out.println("Menor de edad");
        } else {
            System.out.println("Mayor de edad, ten un tequila para la garganta");
        }
        System.out.println(resultado);

        //codigo con operador ternario 
        int edad4 = 24;
        String res = "";

        res = edad4 < 18 ? "Menor de edad 4" : "Mayor de edad, tequila";
        System.out.println(res);

        // Version minima
        int edad5 = 19;
        System.out.println(edad5 < 18 ? "Menor de edad 5" : "Ya, tequila");

        // Comparacion OR a nivel bits, es decir val1=0000..0001; val2=0000..0010
        int val1 = 1;
        int val2 = 5;
        System.out.println(val1 |val2);
        /* ¿que esta pasando?
        val1=0000..0001 OR val2=0000..0010
        0000...0011 => 3 */
        
        int val3 = 1; //0000..0001
        int val4=0;
        val4=val3<<1;
        System.out.println(val4);
        
        System.out.println("             ARREGLOS            ");
        
        int[] edades;
        edades=new int[5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("La primer edad es:"+edades[0]);
        
        int [] estaturas= new int [5];
        int [] pesos={86,99,56,76,77};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println("             con for           ");
        for(int i =0; i<pesos.length; i++){
            System.out.println(pesos[i]);
            
        }
        
        System.out.println("             inverso          ");
        for(int i=pesos.length-1; i>=0; i--){
        System.out.println(pesos[i]);
            
        }
        
        System.out.println("  ARREGLO DE ALUMNOS  ");
        Alumno[] lista=new Alumno[5];
        lista[0]=new Alumno("99999", 2, 9.0f);
        lista[1]=new Alumno("88888", 2, 7.0f);
        lista[2]=new Alumno("77777", 2, 7.0f);
        lista[3]=new Alumno("66666", 2, 8.0f);
        lista[4]=new Alumno("55555", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        /* for each es un for especial introducido en la version 2 de java
        esa version fue en la que sufrio cambios muy grandes Java. El for each 
        fue introducido para simplificar los for con arreglos. fore+tab
        */
        System.out.println("CON FOR EACH");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }
    }
   
                   }
