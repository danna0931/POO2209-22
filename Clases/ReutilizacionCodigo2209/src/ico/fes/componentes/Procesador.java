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
public class Procesador {
    private String marca;
    private float frequenciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frequenciaEnGhz) {
        this.marca = marca;
        this.frequenciaEnGhz = frequenciaEnGhz;
    }

    public float getFrequenciaEnGhz() {
        return frequenciaEnGhz;
    }

    public void setFrequenciaEnGhz(float frequenciaEnGhz) {
        this.frequenciaEnGhz = frequenciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frequenciaEnGhz=" + frequenciaEnGhz + '}';
    }
    
    
}
