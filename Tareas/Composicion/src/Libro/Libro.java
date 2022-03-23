/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author dannapaola
 */
public class Libro {
    // Atributos 
    private String nombreLibro;
    private int numPag;
    // +
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombreLibro, int numPag, Autor autor, Editorial editorial) {
        this.nombreLibro = nombreLibro;
        this.numPag = numPag;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", numPag=" + numPag + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
     
      
}
