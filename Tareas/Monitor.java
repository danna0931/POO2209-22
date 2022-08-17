/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class Monitor {
    
    private float resolucion;
    private float dimension;
    private String marca;

    public Monitor() {
    }

    public Monitor(float resolucion, float dimension, String marca) {
        this.resolucion = resolucion;
        this.dimension = dimension;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Monitor{" + "resolucion=" + resolucion + ", dimension=" + dimension + ", marca=" + marca + '}';
    }
    
    
    
}
