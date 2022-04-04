
package com.mycompany.proyecto_1.Mascotas;

import Principal.Tier;


public class Mascota extends Tier {
    final String nombre;
    private int vidaMascota;
    private int daño;
    private int experiencia;
    private int armadura;
    private String tipo1;
    // si estado == 1 esta dormida, si == 0 esta activa 
    private int estado;
    private int nivel;

    public Mascota(String nombre, int vidaMascota, int daño, int experiencia, int armadura, String tipo1, int tier, int estado, int nivel) {
        super(tier);
        this.nombre = nombre;
        this.vidaMascota = vidaMascota;
        this.daño = daño;
        this.experiencia = experiencia;
        this.armadura = armadura;
        this.tipo1 = tipo1;
        this.estado = estado;
        this.nivel = nivel;
        
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }
    

    public int getVidaMascota() {
        return vidaMascota;
    }

    public void setVidaMascota(int vidaMascota) {
        this.vidaMascota = vidaMascota;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
       
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    public boolean estaVivo(){
        return vidaMascota > 0;
 
    }
    
    public int obtenerVida(){
        return vidaMascota;
    }
    //se calcula el valor del daño al golpear tomando en cuenta lo que tioene por defecto y el efecto activo en ese momento
    public int calcularDaño(int bonusDaño){
        daño = daño + bonusDaño;
        return daño;
    }
    
    //a la mascota atacada se le quita EN VIDA el daño calculado
    public void hacerDaño(Mascota mascotaAtacada, int dañoCalculado){
        /*a la vida de la mascota se le restará la cantidad sobrante que no soporte la armadura 
        (vida(10)-(-armadura(4) + dañoCalculado(8)), en donde la vida sera de vida=10-4=6 )*/
        mascotaAtacada.setVidaMascota(mascotaAtacada.getVidaMascota() - (-mascotaAtacada.getArmadura() + dañoCalculado));
  
    }
    
    
}
