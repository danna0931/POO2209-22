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
public class Autor {
    
    private String nombreAutor;
    private String sexo;

    public Autor() {
    }

    public Autor(String nombreAutor, String sexo) {
        this.nombreAutor = nombreAutor;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombreAutor=" + nombreAutor + ", sexo=" + sexo + '}';
       
    }
    
    public void escribir(){
        System.out.println(this.nombreAutor+" está escribiendo ");
    }
    
    
    
}
