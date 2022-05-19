/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author dannapaola
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona> {
    private ArrayList <Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected= (Persona)o;
    }

    @Override
    public Object getSelectedItem() {
       return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
         return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
      
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
 
    }
    
    
    public void consultarBaseDatos (){
        datos =new  ArrayList<Persona>();
        datos.add(new Persona("José", 19));
        datos.add(new Persona("Maria", 21));
        datos.add(new Persona("Jesús", 33));
        datos.add(new Persona("Diana", 22));
        
    }
    
}
