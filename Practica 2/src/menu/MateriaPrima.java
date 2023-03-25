/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author ricar
 */
public class MateriaPrima extends Thread{
     private Color color;
    private int posicionX;
    private int posicionY;
    private int tiempo;
    private int posFinalx;
    private int posFinaly;
    private JPanel bolita;
    Color proc = new Color(0, 0, 255);
     public MateriaPrima(Color color, int posicionX, int posicionY, int tiempo, int posFx,int posFy) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tiempo = tiempo;
        this.bolita = new JPanel();
        this.bolita.setSize(25, 25);
        this.bolita.setLocation(posicionX, posicionY);
        this.bolita.setForeground(color);
        this.bolita.setBackground(color);
        this.posFinalx=posFx;
        this.posFinaly=posFy;
    }
     @Override
    public void run() {
        try {
            for (int z=0;z<=29;z++) {
                if (this.bolita.getX() > this.posFinalx) {
                    for (int i = this.bolita.getX(); i > this.posFinalx; i--) {
                        this.bolita.setLocation(i, this.bolita.getY());
                        Thread.sleep(5);

                    }
                } else if (this.bolita.getX() <= this.posFinalx) {
                    for (int i = this.bolita.getX(); i <= this.posFinalx; i++) {
                        this.bolita.setLocation(i, this.bolita.getY());
                        Thread.sleep(5);
                    }
                }
                if (this.bolita.getY() > this.posFinaly) {
                    for (int i = this.bolita.getY(); i > this.posFinaly; i--) {
                        this.bolita.setLocation(this.bolita.getX(), i);
                        Thread.sleep(5);
                    }
                } else if (this.bolita.getY() <= this.posFinaly) {
                    for (int i = this.bolita.getY(); i <= this.posFinaly; i++) {
                        this.bolita.setLocation(this.bolita.getX(), i);
                        Thread.sleep(5);
                    }
                }

            }

            // Sleep for 5 seconds
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColores(Color color) {
        this.color = color;
        this.bolita.setForeground(color);
        this.bolita.setBackground(color);
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public JPanel getBolita() {
        return bolita;
    }

    public void setBolita(JPanel bolita) {
        this.bolita = bolita;
    }

        public int getPosFinalx() {
        return posFinalx;
    }

    public int getPosFinaly() {
        return posFinaly;
    }

    public void setPosFinalx(int posFinalx) {
        this.posFinalx = posFinalx;
    }

    public void setPosFinaly(int posFinaly) {
        this.posFinaly = posFinaly;
    }
   public void mover(int posFinalx, int posFinaly,Color color) {
         this.posicionX=posFinalx;
         this.posicionY=posFinaly;
         this.bolita.setLocation(this.posicionX, this.posicionY);
         this.bolita.setForeground(color);
         this.bolita.setBackground(color);
   }
}
