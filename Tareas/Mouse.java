/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dannapaola
 */
public class Mouse {
    private String marca;
    private String tipo;
    private String conexion;

    public Mouse() {
    }

    public Mouse(String marca, String tipo, String conexion) {
        this.marca = marca;
        this.tipo = tipo;
        this.conexion = conexion;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse{" + "marca=" + marca + ", tipo=" + tipo + ", conexion=" + conexion + '}';
    }
    
    
}
