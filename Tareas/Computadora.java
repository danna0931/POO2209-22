/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class Computadora {
    
    // Atributos
    private String color;
    private String marca;
    private String modelo;
    
    //+ 
    private Teclado teclado;
    private Mouse raton;
    private TarjetaG tarjetaGrafica;
    private Monitor monitor;
    private Bocinas bocinas;

    public Computadora() {
    }

    public Computadora(String color, String marca, String modelo, Teclado teclado, Mouse raton, TarjetaG tarjetaGrafica, Monitor monitor, Bocinas bocinas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.raton = raton;
        this.tarjetaGrafica = tarjetaGrafica;
        this.monitor = monitor;
        this.bocinas = bocinas;
    }

    public Bocinas getBocinas() {
        return bocinas;
    }

    public void setBocinas(Bocinas bocinas) {
        this.bocinas = bocinas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public TarjetaG getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(TarjetaG tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", teclado=" + teclado + ", raton=" + raton + ", tarjetaGrafica=" + tarjetaGrafica + ", monitor=" + monitor + ", bocinas=" + bocinas + '}';
    }
    
    
    
    
}
