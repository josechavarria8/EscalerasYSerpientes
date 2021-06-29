/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.codigo;
import escalerasyserpientes.principal.Tabla;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author blue
 */
public class crearTabla extends Tabla {
    
    
    JPanel panel;
    JLabel [][] matriz;
    
    public crearTabla(JPanel panel){
    
        this.panel = panel ;
    
    }
    
    public void crearMatriz(int fila ,int columna)
    {
        panel.removeAll();
        matriz = new JLabel [fila][columna];
        fila = 300/ fila;
        columna = 300/columna;
        
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[0].length; j++){
                
                JLabel lbl = new JLabel("lbl"+String.valueOf(i+1)+" , "+String.valueOf(j+1));
                lbl.setBounds(fila*i,columna*j,fila,columna);
                matriz[i][j] = lbl ;
            
            }
            
            
        }
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[0].length; j++){
                
               panel.add(matriz[i][j]);
            
            }
            
            
        }
        panel.repaint();
    }
        
    
    
    
    
}
