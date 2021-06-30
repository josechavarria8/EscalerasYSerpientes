/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalerasyserpientes.ArchivosBina;


import escalerasyserpientes.codigo.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author alanm
 */
public class EscritorBinario {

    public static final File FILE_JUGADORES = new File("C:\\Home\\Desktop\\EscalerasYSerpientes\\src\\escalerasyserpientes\\binario");

    public void guardarJugadores(Vector<Jugador> jug) throws FileNotFoundException, IOException{
        FileOutputStream fileOutput;
        ObjectOutputStream salida;
        for (Jugador play : jug) {
            fileOutput = new FileOutputStream(FILE_JUGADORES + "/" +play.getNombre()+" "+play.getApellido());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(play);
            salida.close();
        }
    }


}