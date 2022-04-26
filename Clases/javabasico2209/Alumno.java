/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico2209;

/**
 *
 * @author dannapaola
 */
public class Alumno {
    private String numeroCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int semestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar(int minutos){
        System.out.println("Estudiando "+minutos+" minutos");
        
    }
    
    public String evaluarDesempenio(){
        return this.promedio>8.0f? "Sobresaliente": "Regular";
        
    }
}
