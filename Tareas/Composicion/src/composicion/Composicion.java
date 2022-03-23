/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import Libro.Autor;
import Libro.Editorial;
import Libro.Libro;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Pelicula;
import Pelicula.Productora;

/**
 *
 * @author dannapaola
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Libro
         System.out.println("Atributos Libro: ");
        Libro libro1 = new Libro("La historia interminable", 455,
                new Autor("Michael Ende", "Hombre"),
                new Editorial("Penguin Random House", 15687));
                System.out.println(libro1);
                // Metodos:
                System.out.println("Metodos Libro: ");
                libro1.getAutor().escribir();
                libro1.getEditorial().imprimir();
                System.out.println("--------------------------------------------");

        //Pelicula    
        System.out.println("Atributos Pelicula: ");
        Pelicula peli1 = new Pelicula("A dos metros de ti", 117,
                new Actor("Cole Sprouse", 29),
                new Director("Justin Baldoni", "Estadounidense"),
                new Productora("Cathy Schulman", 57));
                System.out.println(peli1);
                System.out.println("Metodos Pelicula: ");
                peli1.getActor().actuar();
                peli1.getDirector().dirigir();
                peli1.getProductora().producir();
                System.out.println("--------------------------------------------");

    }

}
