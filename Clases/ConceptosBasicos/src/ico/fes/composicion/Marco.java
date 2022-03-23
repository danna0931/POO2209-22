/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.composicion;

/**
 *
 * @author dannapaola
 */
public class Marco {

    private String marca;
    private String material;

    public Marco() {
    }

    public Marco(String marca, String material) {
        this.marca = marca;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marco{" + "marca=" + marca + ", material=" + material + '}';
    }

}
