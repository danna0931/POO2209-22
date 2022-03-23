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
public class Foco {

    //Atributos:
    private String color;
    private String tipo;
    private int tamano;

    // Constructores:
    public Foco() {
    }

    public Foco(String color, String tipo, int tamano) {
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    // Metodos de acceso:
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }
    
    

}
