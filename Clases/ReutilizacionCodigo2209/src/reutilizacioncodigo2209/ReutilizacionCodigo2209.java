package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author dannapaola
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
// API: Conjunto de clases o blibliotecas con documentacion para saber como ocuparlas
    public static void main(String[] args) {

        // Metodos String
        String nombre = new String("José José");
        System.out.println(nombre);
        // Imprimir un caracter del nombre
        System.out.println(nombre.charAt(5));
        // Poner en mayusculas 
        System.out.println(nombre.toUpperCase());

        // Reutilizacion de codigo
        // Crear una ventana apartir de un codigo ya existente.
        /*JFrame ventana= new JFrame("Mi primer ventana");
        ventana.setSize(600,400);
        ventana.setVisible(true);*/
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);

        // Encapsulamiento Objeto 1 
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);

        // Ejercicio 1, objeto 1: Mouse marca Logitech, tipo optico.
        miCompu.setRaton(new Mouse("Logitech", "Optico"));
        System.out.println(miCompu);

        //Composicion completa de un nuevo objeto:
        Computadora compu2 = new Computadora("Apple", "MacBook pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        System.out.println(compu2);

        //Ejercicio 2, objeto 2: Cambiar el estado de raton:
        compu2.setRaton(new Mouse("Apple", "Touch"));
        System.out.println(compu2);
        /* Opcion 2
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
         */

        //Herencia. Persona: 
        System.out.println("-----------------------------------------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Danna");
        System.out.println(alu1);
        alu1.setNumCuenta("319031030");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("3345780", "ICO", "Danna", 18);
        System.out.println(alu2);
        
        System.out.println("----- Composicion y herencia en la misma clase ---------");
        Servidor server= new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("----- Ejemplo polimorfismo ------");
        Perro dog=new Perro("Bulldog", "5 estrellas",4);
        Animal animal1= new Animal(4);
        dog.emitirSonido();
        animal1.emitirSonido();
        
        
        
        
        
    }

}
