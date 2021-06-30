/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.codigo;

/**
 *
 * @author blue
 */
import escalerasyserpientes.ArchivosBina.EscritorBinario;
import escalerasyserpientes.principal.Jugadores;
import escalerasyserpientes.principal.Partida;
import escalerasyserpientes.principal.Reportes;
import escalerasyserpientes.principal.Tabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ManejadorJugadores {
     private Jugadores jugador;
    private Reportes reporte;
    private final Vector<Jugador> jugadores;

  /*  private Jugadores jugador;
    private Reportes reporte;
    final int cantidadJugadores = 0;
    String[] nombreJugador = new String[cantidadJugadores];
    String[] apellidoJugador = new String[cantidadJugadores];
    int[] id = new int[cantidadJugadores];
    int[] partidasGanadas = new int[cantidadJugadores];
    int[] partidasPerdidas = new int[cantidadJugadores];
    int[] partidasJugadas = new int[cantidadJugadores];
   
   
  
    public ManejadorJugadores(){
        
        this.jugador = new Jugadores();
        this.reporte = new Reportes();
       
        
        this.jugador.getAgregar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               registrarJugador();
                     JOptionPane.showMessageDialog(null, "Jugador Agregado");
            }
        });
        
        
        
        
    }
    
    
    
    
     public void mostrarJugador() {

        for (int i = 0; i < cantidadJugadores; i++) {
            if (nombreJugador[i] != null) {
                System.out.println((i+1)+".  ID: "+id[i]+",   Nombre: "+nombreJugador[i]+"   Apellido: "+apellidoJugador[i]+ ", Partidas ganadas: " + partidasGanadas[i] + ", Partidas perdidas: " + partidasPerdidas[i] + ", Partidas Jugadas: " + partidasJugadas[i]);
            }
        }
    }
     
     
 public void registrarJugador(){
        Object[] arr = new Object[6];
        String nombre = jugador.getNombre().getText();
        for(int i = 0; i<cantidadJugadores;i++ ){
            if(nombre != nombreJugador[i] && nombreJugador[i] == null){
                nombreJugador[i] = nombre;
                System.out.println("Escriba su apellido");
                String apellido = jugador.getApellido().getText();
                apellidoJugador[i] = apellido;               
                int ids = generarID();
                this.id[i] = ids;  
                
                
                
             DefaultTableModel modelo = (DefaultTableModel) reporte.getjTable1().getModel();
              modelo.addRow(new Object[]{id[i],nombreJugador[i],apellidoJugador[i],partidasJugadas[i],partidasGanadas[i],partidasPerdidas[i]});
         
              break;
               

            }
          JOptionPane.showMessageDialog(null, "Jugador Agregado");

        }

    }    
 public int generarID(){
        int ID = 0;
       for (int i = 0; i < cantidadJugadores; i++) {
        ID = (int)(Math.random()*(999-100)+100);
           if (id[i]!=ID &&  id[i] == 0) {   
               break;
           }
       }  
        return ID;
    } 
 //*/ 
     public ManejadorJugadores(){
        
        this.jugador = new Jugadores();
        this.reporte = new Reportes();
        this.jugadores = new Vector<>();
        this.jugador.setVisible(true);
       
        
        this.jugador.getAgregar().addActionListener(new ActionListener() {

             @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = jugador.getNombre().getText();
                    String Apellido = jugador.getApellido().getText();
                    if (nombre.length() > 1) {
                        registrarJugador(nombre, Apellido);
                        jugador.mostrarJugadoresEnTabla(jugadores);
               
                        
                       
                    } else {
                        JOptionPane.showMessageDialog(jugador, "Por favor ingresa un nombre Valido ");
                    }
                    jugador.getApellido().setText("");
                    jugador.getNombre().setText("");
                    
                    jugador.getNombre().requestFocus();
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(jugador, "Ingrese un nombre válido.");
                }
                 
            }
        });
        
        
        
        
    }
    
   public void registrarJugador(String nombre, String apellido) {
       
        Jugador jugador = new Jugador( nombre, apellido);
        getJugadores().add(jugador);
    }
    public Vector<Jugador> getJugadores() {
        return jugadores;
    }
    
    
}
