package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cronometro extends JFrame implements ActionListener {

    private Timer timer;
    private int segundos = 0;
    private JLabel labelSegundos;

    public Cronometro() {
        timer = new Timer(1000, this);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        segundos++;

    }



}
