/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.principal;

import escalerasyserpientes.codigo.ManejadorJugadores;
import escalerasyserpientes.codigo.ManejadorPartida;
import javax.swing.JOptionPane;

/**
 *
 * @author blue
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JRadioButton();
        jugadores = new javax.swing.JRadioButton();
        reportes = new javax.swing.JRadioButton();
        salir = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/Imagenes/logo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 230, 190));

        iniciarPartida.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        iniciarPartida.setText("Iniciar Partida");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jugadores.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jugadores.setText("Jugadores");
        getContentPane().add(jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        reportes.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        reportes.setText("Reportes");
        getContentPane().add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        salir.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        salir.setText("Salir");
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        aceptar.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        jLabel2.setText("Bienvenidos a Escaleras y Serpientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 231, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/Imagenes/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
          seleccion();
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void seleccion(){
        if(iniciarPartida.isSelected()){
            //se selecciono una nueva partida entonces llamamos la clase para una nueva partida
            ManejadorPartida pt = new ManejadorPartida();
            this.dispose(); //para que se oculte la ventana anterior. 
        
        }else if(jugadores.isSelected()){
          
            ManejadorJugadores es = new ManejadorJugadores();
            this.setVisible(false);
        
        }else if(reportes.isSelected()){
         
            Reportes reportes = new Reportes ();
            reportes.setVisible(true);
            this.setVisible(false);
            
        
        }else if(salir.isSelected()){
              //Se selecionó acabar así que nos despedimos
	      JOptionPane.showMessageDialog(null, "Gracias por jugar. Hasta pronto");
	      System.exit(0); 
        
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton iniciarPartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jugadores;
    private javax.swing.JRadioButton reportes;
    private javax.swing.JRadioButton salir;
    // End of variables declaration//GEN-END:variables
}
