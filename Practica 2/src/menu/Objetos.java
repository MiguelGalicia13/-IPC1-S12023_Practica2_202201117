/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.awt.Color;
import javax.swing.*;


/**
 *
 * @author ricar
 */
public class Objetos extends JPanel{
private boolean ejecutarhilo;
private Color color;
private int posicionX;
private int posicionY;
private int tiempo;


    public Objetos(Color color, int posicionX, int posicionY, int tiempo) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tiempo = tiempo;
        this.setSize(150, 100);
        this.setLocation(posicionX, posicionY);
        this.setForeground(color);
        this.setBackground(color);
    }


  public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    
}
