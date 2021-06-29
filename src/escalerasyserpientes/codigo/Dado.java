package escalerasyserpientes.codigo;



import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Dado {
    
    public Dado(){
        
    }
    
        public int Dadod(JLabel dadoun) {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        Icon uno = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado1.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado2.png"));
        Icon tres = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado3.png"));
        Icon cua = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado4.png"));
        Icon cin = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado5.png"));
        Icon seis = new javax.swing.ImageIcon(getClass().getResource("/escalerasyserpientes/DadosI/dado6.png"));

        switch (dado1) {
            case 1:
                dadoun.setIcon(uno);
                break;
            case 2:
                dadoun.setIcon(dos);
                break;
            case 3:
                dadoun.setIcon(tres);
                break;
            case 4:
                dadoun.setIcon(cua);
                break;
            case 5:
                dadoun.setIcon(cin);
                break;
            case 6:
                dadoun.setIcon(seis);
                break;
        }
        

        JOptionPane.showMessageDialog(null, " Resultado " + dado1);
        return dado1;
    }
}
