/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author dannapaola
 */
public class Servidor extends Computadora {
    private int numeroFuentesPoder;
    private int numeroTarjetasRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid) {
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuentesPoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuentesPoder = numeroFuentesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuentesPoder() {
        return numeroFuentesPoder;
    }

    public void setNumeroFuentesPoder(int numeroFuentesPoder) {
        this.numeroFuentesPoder = numeroFuentesPoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuentesPoder=" + numeroFuentesPoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
    
}
