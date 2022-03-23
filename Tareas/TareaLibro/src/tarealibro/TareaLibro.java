/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealibro;

/**
 *
 * @author dannapaola
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1= new Libro();
        // Titulo
        libro1.setTitulo("La historia interminable");
        System.out.println("Titulo: "+ libro1.getTitulo());
         // Autor
        libro1.setAutor("Michael Ende");
        System.out.println("Autor: "+ libro1.getAutor());
         // Precio
        libro1.setPrecio(190);
        System.out.println("Precio: $ "+ libro1.getPrecio());
         // Paginas
        libro1.setPaginas(489);
        System.out.println("Páginas: "+ libro1.getPaginas());
        // Capitulos
        libro1.setCapitulos(26);
        System.out.println("Capitulos: "+ libro1.getCapitulos());
        
        libro1.leer("La historia interminable");
        libro1.abrir("La historia interminable");
    }
    
}
