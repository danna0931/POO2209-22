/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.cifrado;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dannapaola
 */
public class InterfazCesar extends JFrame {

    private JTextField entrada, desplazamiento, resultado;
    private JLabel desplazar, mensaje, mensajeCifrado;
    private JButton boton;

    public InterfazCesar() throws HeadlessException {
        setTitle(" CIFRADO CESAR ");
        setSize(700, 700);
        //setLayout(new FlowLayout(FlowLayout.CENTER));

        //
        desplazar = new JLabel("Lugares a desplazar: ");
        desplazar.setBounds(170, 20, 150, 20);
        desplazamiento = new JTextField(10);
        desplazamiento.setBounds(300, 20, 150, 20);

        //
        mensaje = new JLabel("Ingresa un mensaje: ");
        mensaje.setBounds(50, 50, 200, 50);
        mensajeCifrado = new JLabel("Mensaje cifrado: ");
        mensajeCifrado.setBounds(450, 70, 200, 50);
        entrada = new JTextField(15);
        entrada.setBounds(15, 100, 200, 200);
        entrada.setBackground(Color.GRAY);

        //
        boton = new JButton("Desplazar");
        boton.setBounds(300, 150, 80, 80);
        boton.setBackground(Color.black);
        boton.setOpaque(true);
        boton.setToolTipText("Click para cifrar el mensaje");

        //
       
        resultado = new JTextField(15);
        resultado.setBounds(450, 100, 200, 200);
        resultado.setBackground(Color.GRAY);

        this.getContentPane().add(desplazar);
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(entrada);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(mensajeCifrado);

        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String minusculas = "abcdefghijklmnñopqrstuvwxyz";
                String mayusculas = "ABCDEFGHIJKLMNNÑOPQRSTUVWXYZ";
                String espacio= " ";

                String texto = entrada.getText();
                int lugares = Integer.parseInt(desplazamiento.getText());
                String resultadoFinal = " ";

                for (int i = 0; i < texto.length(); i++) {
                 
                    for (int j = 0; j < minusculas.length(); j++) {
                        
                        if (texto.charAt(i) == minusculas.charAt(j)) {
                            if (j + lugares >= minusculas.length()) {
                                resultadoFinal += minusculas.charAt((j + lugares) % minusculas.length());
                                resultado.setText(resultadoFinal);
                    
                            } else {
                                resultadoFinal += minusculas.charAt(j + lugares);
                                resultado.setText(resultadoFinal);
                            }
                            
                        } else if (texto.charAt(i) == mayusculas.charAt(j)) {
                            if (j + lugares >= mayusculas.length()) {
                                resultadoFinal += mayusculas.charAt((j + lugares) % mayusculas.length());
                                resultado.setText(resultadoFinal);

                            } else {
                                resultadoFinal += mayusculas.charAt(j + lugares);
                                resultado.setText(resultadoFinal);
                            }
                        }

                    }

                }

            }

        }
        );

    }

}
