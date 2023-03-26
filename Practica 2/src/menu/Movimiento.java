package menu;

import javax.swing.*;

public class Movimiento extends Thread{
    private boolean ejecutaHilo;
    JLabel ficha;
    int posInicialX;
    int posFinalX;
    int posInicialY;
    int posFinalY;
    int veocidadGenerar;
    int dimension;
    int cantidad;
    int contador;
    JFrame v;
    public Movimiento(int p0x,int poy,int pfx, int pfy, JFrame v) {
        this.ejecutaHilo = true;
        //this.ficha = ficha;
        this.posInicialX = p0x;
        this.posFinalX = pfx;
        this.posInicialY = poy;
        this.posFinalY = pfy;
        this.veocidadGenerar = 1000;
        this.dimension = 100;
        this.cantidad = 10;
        this.contador = 0;
        this.v = v;
    }

    @Override
    public void run(){
        while(ejecutaHilo){
            try {
                Thread.sleep(veocidadGenerar);
                if(contador<cantidad) CrearFichas();
            } catch (InterruptedException ex) {
            }
        }
    }
    private void CrearFichas(){
        JLabel ficha = new JLabel("Este es el \nlabel No. "+contador);
        ficha.setVisible(true);

        v.getContentPane().add(ficha);
        Animacion h = new Animacion(ficha, posInicialX, posFinalX, posInicialY, posFinalY);
        h.start();
        contador++;
    }

}
