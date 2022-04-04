/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ser;

import com.mycompany.proyecto_1.Mascotas.Mascota;

/**
 *
 * @author Gedlr
 */
public class Ser {
    
    private String nombre;
    private Mascota [] mascotas = new Mascota[5];
    private int vidaJugador;

    public Ser(String nombre, int vidaJugador) {
        this.nombre = nombre;
        this.vidaJugador = vidaJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public int getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(int vidaJugador) {
        this.vidaJugador = vidaJugador;
    }
    
    
    public boolean estaVivo(){
        return vidaJugador > 0;
    }
    
    
    
}
