package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dannapaola
 */
public class JavaBasico2209Parte2 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("");
        
        System.out.println(" -----------E X C E P C I O N E S------------- ");
        System.out.println("");
        
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;

        String elNombre = "";

        // Codigo donde puede ocurrir el error
        try {
            elNombre = nombres.get(seleccion);
            seleccion = teclado.nextInt();
        } catch (InputMismatchException ie) {
            System.out.println("Debes teclear valores numericos. ;)");
            elNombre = nombres.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        } catch (Exception e) {
            System.out.println("Excepcion generica");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);

        }

        //System.out.println(nombres.get(seleccion));
        System.out.println("Continua el programa");
        
        Aritmetica cal=new Aritmetica(2,0);
        System.out.println(cal.getA()+ "+" + cal.getB() + "=" + cal.sumar());
        
        
        try {
            System.out.println(cal.getA()+ "/" + cal.getB() + "=" + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error aritmetico");
        }
       
        System.out.println("Fin del programa");
        
        
        Cuadrado cuad= new Cuadrado(5.0f);
        Circulo circ =new Circulo(4.5f);
        
        System.out.println("");
        System.out.println("--------- F I G U R A -----------");
        System.out.println("");
        System.out.println("El area del cuadrado es: "+cuad.calcularArea());
        System.out.println("El area del circulo es: "+circ.calcularArea());
        
        EstudianteDeportistaArtista eda= new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("futbol");
        eda.setGeneroArtistico("fotografia");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);

    }

}
