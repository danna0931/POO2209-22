/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author dannapaola
 */
public class Libro {

    // Atributos:
    private String titulo;
    private String autor;
    private float precio;
    private int paginas;
    private int capitulos;

    // Constructores

    public Libro() {
    }

    public Libro(String titulo, String autor, float precio, int paginas, int capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
        this.capitulos = capitulos;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    // Metodos
    
    public void leer(String titulo){
        System.out.println("Estas leyendo el libro: "+this.titulo);
    }
    
    public void abrir(String nombre){
        System.out.println("El libro: "+this.titulo+ " está abierto");
    }
    
    
}
