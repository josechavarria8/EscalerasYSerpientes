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
public class Jugador {
    
    private String nombre, apellido;
    private int id,partidasGanadas, partidasPerdidas,partidasJugadas;



    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = 1;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
        this.partidasJugadas = 0;
    }

    public String mostrarDatosJugador() {
        return " Id: " + id +", Nombre: " + nombre + ", Partidas ganadas: " + partidasGanadas + ", Partidas perdidas: " + partidasPerdidas + ", Puntuacion: " + partidasJugadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    

    

}