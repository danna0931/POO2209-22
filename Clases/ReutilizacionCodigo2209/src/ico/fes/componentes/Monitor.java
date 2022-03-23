/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author dannapaola
 */
public class Monitor {
    private String marca;
    private float pulgada;

    public Monitor() {
    }

    public Monitor(String marca, float pulgada) {
        this.marca = marca;
        this.pulgada = pulgada;
    }

    public float getPulgada() {
        return pulgada;
    }

    public void setPulgada(float pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", pulgada=" + pulgada + '}';
    }
    
    
}
