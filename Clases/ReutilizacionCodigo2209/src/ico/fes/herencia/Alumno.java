/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author dannapaola
 */
// extends: heredar
// Persona hereda a alumno
public class Alumno extends Persona {

    private String numCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String numCuenta, String carrera) {
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numCuenta, String carrera, String nombre, int edad) {
        // Super: Invoca constructor de la super clase o clase base (Persona)
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + '}';
    }
    
    public void estudiar(int cantidad){
        System.out.println(this.getNombre()+" esta estudiando "+ cantidad + "horas");
    }
    
    //Polimorfismo por sobre escritura
    @Override
    public void dormir (){
        System.out.println("El estudiante "+ this.getNombre()+ " esta durmiendo ...");
    }
    
    //Polimorfismo por sobrecarga
    public void dormir (int horasEstudio){
        int horasDormir=8;
        System.out.println(this.getNombre()+" esta durmiendo "+(horasDormir - horasEstudio)+ " horas");
    }
    
}
