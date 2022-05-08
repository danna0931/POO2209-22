/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author dannapaola
 */
public class Ventana extends Frame implements MouseListener {

    private String titulo;
    private Button boton1;
    private FlowLayout layout;
    private Label etiqueta;
    private TextField cuadroTexto;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(350, 220);

        layout = new FlowLayout(FlowLayout.LEFT);
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Texto inicial");
        boton1 = new Button("Presioname");

        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        this.setLayout(layout);
        this.setVisible(true);
        
        this.boton1.addMouseListener(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ventana{" + "titulo=" + titulo + '}';
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click de raton");
        etiqueta.setText("Hola "+cuadroTexto.getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("El cursor entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("El cursor salió del componente");
    }

}
