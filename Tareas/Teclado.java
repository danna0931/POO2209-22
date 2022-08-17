/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class Teclado {
    
    //Atributos
    private int numerodeTeclas;
    private String conexion;
    private String marca;

    public Teclado() {
    }

    public Teclado(int numerodeTeclas, String conexion, String marca) {
        this.numerodeTeclas = numerodeTeclas;
        this.conexion = conexion;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumerodeTeclas() {
        return numerodeTeclas;
    }

    public void setNumerodeTeclas(int numerodeTeclas) {
        this.numerodeTeclas = numerodeTeclas;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Teclado{" + "numerodeTeclas=" + numerodeTeclas + ", conexion=" + conexion + ", marca=" + marca + '}';
    }

    
    
    
}
