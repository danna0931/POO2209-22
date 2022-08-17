/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class Bocinas {
    
    private String color;
    private int numerodeBotones;
    private String Marca;

    public Bocinas() {
    }

    public Bocinas(String color, int numerodeBotones, String Marca) {
        this.color = color;
        this.numerodeBotones = numerodeBotones;
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumerodeBotones() {
        return numerodeBotones;
    }

    public void setNumerodeBotones(int numerodeBotones) {
        this.numerodeBotones = numerodeBotones;
    }

    @Override
    public String toString() {
        return "Bocinas{" + "color=" + color + ", numerodeBotones=" + numerodeBotones + ", Marca=" + Marca + '}';
    }
    
    
    
}
