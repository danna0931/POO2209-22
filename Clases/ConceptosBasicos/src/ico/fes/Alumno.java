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
// Extends para herencia; persona extiende (hereda) atritubtos a Alumno
public class Alumno extends Persona{
    private String numeroCuenta;
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera, int grupo) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        // pALABRA SUPER ayuda a heredar
        return super.toString()+"Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
    
    
}
