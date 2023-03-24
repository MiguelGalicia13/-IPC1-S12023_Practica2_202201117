/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import menu.Simulacion;


public class iu extends javax.swing.JFrame {
private static int TiempoINV;
private static int TiempoPRO;
private static int TiempoEMP;
private static int TiempoSAL;
private static int PrecioINV;
private static int PrecioPRO;
private static int PrecioEMP;
private static int PrecioSAL;

    public iu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        TimeInventario = new javax.swing.JTextField();
        TimeProduccion = new javax.swing.JTextField();
        TimeEmpaquetado = new javax.swing.JTextField();
        TimeExit = new javax.swing.JTextField();
        PriceInventario = new javax.swing.JTextField();
        PriceProdcuccion = new javax.swing.JTextField();
        PriceEmpaquetado = new javax.swing.JTextField();
        PriceExit = new javax.swing.JTextField();
        StartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monkey");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenidos a monkey");

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventario");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Producción");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Empaquetado");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salida");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("Costo (Q/s)");
        c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t.setText("Tiempo (s)");
        t.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TimeInventario.setBackground(new java.awt.Color(255, 255, 255));
        TimeInventario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TimeInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeInventarioActionPerformed(evt);
            }
        });

        TimeProduccion.setBackground(new java.awt.Color(255, 255, 255));
        TimeProduccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TimeProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeProduccionActionPerformed(evt);
            }
        });

        TimeEmpaquetado.setBackground(new java.awt.Color(255, 255, 255));
        TimeEmpaquetado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TimeEmpaquetado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeEmpaquetadoActionPerformed(evt);
            }
        });

        TimeExit.setBackground(new java.awt.Color(255, 255, 255));
        TimeExit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TimeExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeExitActionPerformed(evt);
            }
        });

        PriceInventario.setBackground(new java.awt.Color(255, 255, 255));
        PriceInventario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PriceProdcuccion.setBackground(new java.awt.Color(255, 255, 255));
        PriceProdcuccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PriceEmpaquetado.setBackground(new java.awt.Color(255, 255, 255));
        PriceEmpaquetado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PriceExit.setBackground(new java.awt.Color(255, 255, 255));
        PriceExit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        StartButton.setText("Iniciar simulacion");
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TimeInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(PriceInventario)
                            .addComponent(PriceProdcuccion)
                            .addComponent(PriceEmpaquetado)
                            .addComponent(PriceExit))
                        .addGap(168, 168, 168))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PriceInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeInventario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PriceProdcuccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeProduccion))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PriceEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeEmpaquetado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimeExit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceExit))
                .addGap(47, 47, 47)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TimeInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeInventarioActionPerformed

    private void TimeProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeProduccionActionPerformed

    private void TimeEmpaquetadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeEmpaquetadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeEmpaquetadoActionPerformed

    private void TimeExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeExitActionPerformed

    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
        // TODO add your handling code here:
            ingresoDatos();



        
    }//GEN-LAST:event_StartButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iu().setVisible(true);
            }
        });
    }
    public boolean verificarCampos(){
        if(PriceEmpaquetado.getText()== null||PriceInventario.getText()==null||PriceProdcuccion.getText()==null||PriceExit.getText()==null||TimeEmpaquetado==null||TimeExit==null||TimeInventario==null||TimeProduccion==null){
            return false;
        }
        return true;
    }
public void ingresoDatos(){
        if(verificarCampos()){
            try{
                setPrecioINV(getPriceInventario());
                setPrecioEMP(getPriceEmpaquetado());
                setPrecioPRO(getPriceProdcuccion());
                setPrecioSAL(getPriceExit());
                setTiempoINV(getTimeInventario());
                setTiempoEMP(getTimeEmpaquetado());
                setTiempoPRO(getTimeProduccion());
                setTiempoSAL(getTimeExit());
                JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
                dispose();
                Simulacion s = new Simulacion();
                s.setVisible(true);

            }catch(HeadlessException e){
                System.out.println("Error al ingresar datos");
                JOptionPane.showMessageDialog(null,"Todos los datos deben ser enteros","Error con los valores",JOptionPane.ERROR_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null,"Todos los campos deben ser llenados","Error con los valores",JOptionPane.ERROR_MESSAGE);

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PriceEmpaquetado;
    private javax.swing.JTextField PriceExit;
    private javax.swing.JTextField PriceInventario;
    private javax.swing.JTextField PriceProdcuccion;
    private javax.swing.JButton StartButton;
    private javax.swing.JTextField TimeEmpaquetado;
    private javax.swing.JTextField TimeExit;
    private javax.swing.JTextField TimeInventario;
    private javax.swing.JTextField TimeProduccion;
    private javax.swing.JLabel c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel t;
    // End of variables declaration//GEN-END:variables

    public int getPriceEmpaquetado() { 
        return Integer.parseInt(PriceEmpaquetado.getText());
    }

    public int getPriceExit() {
        return Integer.parseInt(PriceExit.getText());
    }

    public int getPriceInventario() {
        return Integer.parseInt(PriceInventario.getText());
    }

    public int getPriceProdcuccion() {
        return Integer.parseInt(PriceProdcuccion.getText());
    }

    public int getTimeEmpaquetado() {
        return Integer.parseInt(TimeEmpaquetado.getText());
    }

    public int getTimeExit() {
        return Integer.parseInt(TimeExit.getText());
    }

    public int getTimeInventario() {
        return Integer.parseInt(TimeInventario.getText());
    }

    public int getTimeProduccion() {
        return Integer.parseInt(TimeProduccion.getText());
    }

    public static int getTiempoINV() {
        return TiempoINV;
    }

    public static void setTiempoINV(int TiempoINV) {
        iu.TiempoINV = TiempoINV;
    }

    public static int getTiempoPRO() {
        return TiempoPRO;
    }

    public static void setTiempoPRO(int TiempoPRO) {
        iu.TiempoPRO = TiempoPRO;
    }

    public static int getTiempoEMP() {
        return TiempoEMP;
    }

    public static void setTiempoEMP(int TiempoEMP) {
        iu.TiempoEMP = TiempoEMP;
    }

    public static int getTiempoSAL() {
        return TiempoSAL;
    }

    public static void setTiempoSAL(int TiempoSAL) {
        iu.TiempoSAL = TiempoSAL;
    }

    public static int getPrecioINV() {
        return PrecioINV;
    }

    public static void setPrecioINV(int PrecioINV) {
        iu.PrecioINV = PrecioINV;
    }

    public static int getPrecioPRO() {
        return PrecioPRO;
    }

    public static void setPrecioPRO(int PrecioPRO) {
        iu.PrecioPRO = PrecioPRO;
    }

    public static int getPrecioSAL() {
        return PrecioSAL;
    }

    public static void setPrecioSAL(int PrecioSAL) {
        iu.PrecioSAL = PrecioSAL;
    }

    public static int getPrecioEMP() {
        return PrecioEMP;
    }

    public static void setPrecioEMP(int PrecioEMP) {
        iu.PrecioEMP = PrecioEMP;
    }

}

