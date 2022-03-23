/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author dannapaola
 */
public class Editorial {
    private String nombreEditorial;
    private int idEditorial;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, int idEditorial) {
        this.nombreEditorial = nombreEditorial;
        this.idEditorial = idEditorial;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", idEditorial=" + idEditorial + '}';
    }
    
        public void imprimir (){
        System.out.println(this.nombreEditorial+" está imprimiendo");
        }
}
