/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class TarjetaG {
    private String tipo;
    private String fabricante;
    private String color;

    public TarjetaG() {
    }

    public TarjetaG(String tipo, String fabricante, String color) {
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.color = color;
    }

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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "TarjetaG{" + "tipo=" + tipo + ", fabricante=" + fabricante + ", color=" + color + '}';
    }
    
    
}
