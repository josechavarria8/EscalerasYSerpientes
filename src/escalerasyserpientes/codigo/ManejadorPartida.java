package escalerasyserpientes.codigo;

import escalerasyserpientes.principal.Partida;
import escalerasyserpientes.principal.Tabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManejadorPartida {
    
    private Tabla tab;
    private Partida pt;
    private crearTabla tabla;
    private Dado dado;

    
    public ManejadorPartida(){
        this.pt = new Partida();
        this.tab = new Tabla();
        this.tabla = new crearTabla(pt.getTableroPrincipal());
        this.dado = new Dado();
        tab.setVisible(true);
        
        this.tab.getCrear().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Crear();
            }
        });
        
        this.pt.getjButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dado.Dadod(pt.getLabeldad());
             
            }
        });
        
        
    }
    
    public void Crear(){
        tabla.crearMatriz(Integer.parseInt(tab.getTablaFila().getText()), Integer.parseInt(tab.getTablaColumna().getText()));
        pt.setVisible(true);
    }
    
    
    
}
