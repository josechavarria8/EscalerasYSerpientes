/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.principal;

import escalerasyserpientes.codigo.Jugador;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blue
 */
public class Jugadores extends javax.swing.JFrame {

    /**
     * Creates new form Jugadores
     */
    public Jugadores() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 300, 230));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel2.setText("Agregar Jugadores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 270, 50));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        agregar.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        agregar.setText("Agregar");
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        Salir.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/Imagenes/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
                 Inicio inicio = new Inicio();
              inicio.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    public JButton getSalir() {
        return Salir;
    }

    public JTextField getApellido() {
        return apellido;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public JButton getAgregar() {
        return agregar;
    }

    public JTable getjTable1() {
        return jTable1;
    }
    
    
        public void mostrarJugadoresEnTabla(Vector<Jugador> jugadores) {
        DefaultTableModel modelo = (DefaultTableModel) getjTable1().getModel();
        modelo.setRowCount(0);
        for (Jugador j : jugadores) {
            Object[] row = new Object[2];
            row[0] = j.getNombre();
            row[1] = j.getApellido();
            modelo.addRow(row);
        }
        getjTable1().setModel(modelo);

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
