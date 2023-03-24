/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ricar
 */
public class Animacion extends Thread{
    private boolean ejecutarhilo;
    JLabel Ficha;
    int posIx;
    int posIy;
    int posFx;
    int posFy;
    int velocidadGenerar;
    int dimension;
    int cantidad;
    int contador;
    JLabel v; 
    
    public Animacion(JLabel v) {
        this.ejecutarhilo = true;
        //this.Ficha = Ficha;
        this.posIx = 10;
        this.posIy = 10;
        this.posFx =400;
        this.posFy =200;
        this.velocidadGenerar = 1000;
        this.dimension = 100;
        this.cantidad = 100;
        this.contador = 0;
        this.v=v;
    }
    
     @Override
    public void run(){
        while(ejecutarhilo){
            try {
                Thread.sleep(velocidadGenerar);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
