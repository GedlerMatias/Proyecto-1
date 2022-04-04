/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosPredefinidos;

import com.mycompany.proyecto_1.Mascotas.Mascota;

/**
 *
 * @author Gedlr
 */
public class EfectosActivos {
    //si es 0 esta activo, si es 1 ya no tiene efecto
    private int estadoDeEfecto;

    public EfectosActivos(int estadoDeEfecto) {
        this.estadoDeEfecto = estadoDeEfecto;
    }

    public int getEstadoDeEfecto() {
        return estadoDeEfecto;
    }

    public void setEstadoDeEfecto(int estadoDeEfecto) {
        this.estadoDeEfecto = estadoDeEfecto;
    }
    
    
    
    
    public void debil(Mascota mascotaDesmayada){
        //si mascota tiene en estado == 1 esta inactiva, si es 0 esta activa
        mascotaDesmayada.setDaño(0);
        // estado == 1 esta desmayada
        mascotaDesmayada.setEstado(1);
        /*se planea hacer cada efecto activo, en este caso se añadira un 
        parametro nuevo a mascota, que sera "estado" que puede ser activa o inactiva (no comer, no mejorar, no atacar, etc)
        que podrea ser int o un tipo boolean */
        
    }
    
    public void armaduraDeMelon(Mascota mascotaSeleccionada){
        mascotaSeleccionada.setArmadura(20);
        //al ser 1, el efecto queda inactivo
        estadoDeEfecto = 1;
    }
    
    public void armaduraDeAjo(Mascota mascotaSeleccionada){
        mascotaSeleccionada.setArmadura(2);
    }
    
    public void ataqueDeHueso(Mascota mascotaSeleccionada){
        //al daño por defecto se le agregan +5
        mascotaSeleccionada.setDaño(mascotaSeleccionada.getDaño()+5);
        mascotaSeleccionada.setArmadura(1);
        estadoDeEfecto=0;
    }
    
    public void ataqueDemoledor(Mascota mascotas[], int indice){
        //una posicion abajo del enemigo actual, se le quita 5 de vida a la mascota
        System.out.println("A la mascota enemiga " + mascotas[indice-1].getNombre() +" se perdió 5 de vida");
        mascotas[indice-1].setVidaMascota(mascotas[indice-1].getVidaMascota()-5);
    }
    
    public void ataqueDeCarne(Mascota mascotaSeleccionada){
        //aumenta el daño en +20
        mascotaSeleccionada.setDaño(mascotaSeleccionada.getDaño()+20);
        estadoDeEfecto=1;
    }   //configurar para que al terminar el efecto, regrese a su cantidad normal
    
    public void mielDeAbeja(Mascota mascotas[], int indice){
        //el espacio de la mascota que murio sera llenado por la abeja 
        mascotas[indice] = new Mascota("Abeja", 1, 1, 0, 0, "insecto", 7, 0,1);
    }
    public void vidaExtra(Mascota mascotas[], int indice){
        mascotas[indice].setVidaMascota(mascotas[indice].getVidaMascota()+1);
    }
    
    public void escuedoDeCoco(Mascota mascotas[], int indice){
        mascotas[indice].hacerDaño(mascotas[indice], 0);
    }
    
}
