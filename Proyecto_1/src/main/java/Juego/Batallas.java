/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Principal.MenuEntreBatallas;
import Principal.Tier;
import Ser.Jugador;
import Ser.Ser;
import com.mycompany.proyecto_1.Mascotas.Mascota;


public class Batallas extends Tier{
   
    
    public Batallas( int ronda) {
        super(ronda);
    }
   
    public Mascota[] crearListaDeMascotasJugador( Mascota[] mascotasTier1) {
        double aleatorio = 0.0;
        double aleatorio2 = 0.0;
        double aleatorio3 = 0.0;
        double aleatorio4 = 0.0;
        double aleatorio5 = 0.0;
        double aleatorio6 = 0.0;
        int indice = 0;
        Mascota[] mascotasDelJugador = new Mascota[5];
        while (indice < 5) {
            if (indice == 0) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelJugador[0] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelJugador[0] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelJugador[0] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelJugador[0] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelJugador[0] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelJugador[0] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelJugador[0] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelJugador[0] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelJugador[0] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 1) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelJugador[1] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelJugador[1] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelJugador[1] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelJugador[1] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelJugador[1] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelJugador[1] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelJugador[1] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelJugador[1] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelJugador[1] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 2) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelJugador[2] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelJugador[2] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelJugador[2] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelJugador[2] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelJugador[2] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelJugador[2] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelJugador[2] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelJugador[2] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelJugador[2] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 3) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelJugador[3] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelJugador[3] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelJugador[3] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelJugador[3] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelJugador[3] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelJugador[3] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelJugador[3] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelJugador[3] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelJugador[3] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 4) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelJugador[4] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelJugador[4] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelJugador[4] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelJugador[4] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelJugador[4] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelJugador[4] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelJugador[4] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelJugador[4] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelJugador[4] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            indice++;
        }
        return mascotasDelJugador;
    }
    
    /*public Mascota[] crearListaDeMascotasBot( Mascota[] mascotasTier1) {
        double aleatorio = 0.0;
        int indice = 0;
        final Mascota[] mascotasDelBot = new Mascota[5];
        while (indice < 5) {
            if (indice == 0) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelBot[0] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelBot[0] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelBot[0] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelBot[0] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelBot[0] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelBot[0] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelBot[0] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelBot[0] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelBot[0] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 1) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelBot[1] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelBot[1] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelBot[1] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelBot[1] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelBot[1] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelBot[1] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelBot[1] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelBot[1] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelBot[1] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 2) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelBot[2] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelBot[2] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelBot[2] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelBot[2] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelBot[2] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelBot[2] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelBot[2] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelBot[2] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelBot[2] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 3) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelBot[3] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelBot[3] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelBot[3] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelBot[3] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelBot[3] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelBot[3] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelBot[3] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelBot[3] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelBot[3] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            else if (indice == 4) {
                aleatorio = Math.random() * 100.0;
                if (aleatorio > 0.0 && aleatorio <= 10.0) {
                    mascotasDelBot[4] = mascotasTier1[0];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 10.0 && aleatorio <= 20.0) {
                    mascotasDelBot[4] = mascotasTier1[1];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 20.0 && aleatorio <= 30.0) {
                    mascotasDelBot[4] = mascotasTier1[2];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 30.0 && aleatorio <= 40.0) {
                    mascotasDelBot[4] = mascotasTier1[3];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 40.0 && aleatorio <= 50.0) {
                    mascotasDelBot[4] = mascotasTier1[4];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 50.0 && aleatorio <= 60.0) {
                    mascotasDelBot[4] = mascotasTier1[5];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 60.0 && aleatorio <= 70.0) {
                    mascotasDelBot[4] = mascotasTier1[6];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 70.0 && aleatorio <= 80.0) {
                    mascotasDelBot[4] = mascotasTier1[7];
                    aleatorio = Math.random() * 100.0;
                }
                else if (aleatorio > 80.0 && aleatorio <= 100.0) {
                    mascotasDelBot[4] = mascotasTier1[8];
                    aleatorio = Math.random() * 100.0;
                }
            }
            indice++;
        }
        return mascotasDelBot;
    }*/
    
    public void iniciarBatalla( Jugador jugadorA,  Mascota[] mascotasDelJugador, Ser bot,  Mascota[] mascotasDelBot) {
         int indiceJugadorB = 0;
         int indiceJugadorA = 0;
        int dañoJugadorA;
        int dañoJugadorB;
        int ronda = 1;
        int contadorDeIntentos = 0;
        int vidaTotalJugadorA;
        int vidaTotalJugadorB;
        MenuEntreBatallas menuEntreBatalla = new MenuEntreBatallas();
        System.out.println("\nLA BATALLA INICIO");
        vidaTotalJugadorA= mascotasDelJugador[0].getVidaMascota()+mascotasDelJugador[1].getVidaMascota()+mascotasDelJugador[2].getVidaMascota()+mascotasDelJugador[3].getVidaMascota()+mascotasDelJugador[4].getVidaMascota();
        vidaTotalJugadorB=mascotasDelBot[0].getVidaMascota()+mascotasDelBot[4].getVidaMascota()+mascotasDelBot[1].getVidaMascota()+mascotasDelBot[2].getVidaMascota()+mascotasDelBot[3].getVidaMascota();
        while(jugadorA.estaVivo()){ 
             System.out.println("\nMascotas del Jugador: ");
             System.out.println(mascotasDelJugador[0].getNombre()+", Vida: " + mascotasDelJugador[0].getVidaMascota()+", Daño: "+ mascotasDelJugador[0].getDaño()+ ", Nivel: " + mascotasDelJugador[0].getNivel());
             System.out.println(mascotasDelJugador[1].getNombre()+", Vida: " + mascotasDelJugador[1].getVidaMascota()+", Daño: "+ mascotasDelJugador[1].getDaño()+ ", Nivel: " + mascotasDelJugador[1].getNivel());
             System.out.println(mascotasDelJugador[2].getNombre()+", Vida: " + mascotasDelJugador[2].getVidaMascota()+", Daño: "+ mascotasDelJugador[2].getDaño()+ ", Nivel: " + mascotasDelJugador[2].getNivel());
             System.out.println(mascotasDelJugador[3].getNombre()+", Vida: " + mascotasDelJugador[3].getVidaMascota()+", Daño: "+ mascotasDelJugador[3].getDaño()+ ", Nivel: " + mascotasDelJugador[3].getNivel());
             System.out.println(mascotasDelJugador[4].getNombre()+", Vida: " + mascotasDelJugador[4].getVidaMascota()+", Daño: "+ mascotasDelJugador[4].getDaño()+ ", Nivel: " + mascotasDelJugador[4].getNivel());
             menuEntreBatalla.MostrarMenuEntreBatallas(mascotasDelJugador, ronda, jugadorA);
                
            while(vidaTotalJugadorA > 0 && vidaTotalJugadorB > 0 && indiceJugadorA < 5 && indiceJugadorB<5){
                System.out.println("el indice del J: " + indiceJugadorA);
                System.out.println("el indice del B: " + indiceJugadorB);
                System.out.println("\nMascotas del Jugador: ");
                System.out.println(mascotasDelJugador[0].getNombre()+", Vida: " + mascotasDelJugador[0].getVidaMascota()+", Daño: "+ mascotasDelJugador[0].getDaño()+ ", Nivel: " + mascotasDelJugador[0].getNivel());
                System.out.println(mascotasDelJugador[1].getNombre()+", Vida: " + mascotasDelJugador[1].getVidaMascota()+", Daño: "+ mascotasDelJugador[1].getDaño()+ ", Nivel: " + mascotasDelJugador[1].getNivel());
                System.out.println(mascotasDelJugador[2].getNombre()+", Vida: " + mascotasDelJugador[2].getVidaMascota()+", Daño: "+ mascotasDelJugador[2].getDaño()+ ", Nivel: " + mascotasDelJugador[2].getNivel());
                System.out.println(mascotasDelJugador[3].getNombre()+", Vida: " + mascotasDelJugador[3].getVidaMascota()+", Daño: "+ mascotasDelJugador[3].getDaño()+ ", Nivel: " + mascotasDelJugador[3].getNivel());
                System.out.println(mascotasDelJugador[4].getNombre()+", Vida: " + mascotasDelJugador[4].getVidaMascota()+", Daño: "+ mascotasDelJugador[4].getDaño()+ ", Nivel: " + mascotasDelJugador[4].getNivel());
                

                System.out.println("\nMascotas del BOT: ");
                System.out.println(mascotasDelBot[0].getNombre()+", Vida: " + mascotasDelJugador[0].getVidaMascota()+", Daño: "+mascotasDelJugador[0].getDaño()+ ", Nivel: "+ mascotasDelJugador[0].getNivel());
                System.out.println(mascotasDelBot[1].getNombre()+", Vida: " + mascotasDelJugador[1].getVidaMascota()+", Daño: "+mascotasDelJugador[1].getDaño()+ ", Nivel: "+ mascotasDelJugador[1].getNivel());
                System.out.println(mascotasDelBot[2].getNombre()+", Vida: " + mascotasDelJugador[2].getVidaMascota()+", Daño: "+mascotasDelJugador[2].getDaño()+ ", Nivel: "+ mascotasDelJugador[2].getNivel());
                System.out.println(mascotasDelBot[3].getNombre()+", Vida: " + mascotasDelJugador[3].getVidaMascota()+", Daño: "+mascotasDelJugador[3].getDaño()+ ", Nivel: "+ mascotasDelJugador[3].getNivel());
                System.out.println(mascotasDelBot[4].getNombre()+", Vida: " + mascotasDelJugador[4].getVidaMascota()+", Daño: "+mascotasDelJugador[4].getDaño()+ ", Nivel: "+ mascotasDelJugador[4].getNivel());
                System.out.println("");
                System.out.println("Ronda " +  ronda+"!");
                System.out.println(mascotasDelJugador[indiceJugadorA].getNombre()+ "                        VS                       "+ mascotasDelBot[indiceJugadorB].getNombre());
                System.out.println(mascotasDelJugador[indiceJugadorA].getNombre()+" , Vida: " + mascotasDelJugador[indiceJugadorA].getVidaMascota()+" ,Daño: " + mascotasDelJugador[indiceJugadorA].getDaño()+ "<------------------->" +  mascotasDelBot[indiceJugadorB].getNombre()+ " ,Vida: "+ mascotasDelJugador[1].getVidaMascota()+ " ,Daño: "+ mascotasDelJugador[1].getDaño());
                dañoJugadorA = mascotasDelJugador[indiceJugadorA].calcularDaño(0);
                dañoJugadorB = mascotasDelBot[indiceJugadorB].calcularDaño(0);
                System.out.println(mascotasDelJugador[indiceJugadorA].getNombre() + " le hizo un daño de " + dañoJugadorA + " a " + mascotasDelBot[indiceJugadorB].getNombre());
                System.out.println(mascotasDelBot[indiceJugadorB].getNombre() + " le hizo un daño de " + dañoJugadorB + " a " + mascotasDelJugador[indiceJugadorA].getNombre());
                mascotasDelJugador[indiceJugadorA].hacerDaño(mascotasDelBot[indiceJugadorB], dañoJugadorA);
                mascotasDelBot[indiceJugadorB].hacerDaño(mascotasDelJugador[indiceJugadorA], dañoJugadorB); 
                
                if(mascotasDelBot[indiceJugadorB].getVidaMascota() <= 0 && mascotasDelJugador[indiceJugadorA].getVidaMascota() <= 0){
                    System.out.println("Ambas mascotas murieron...");
                    mascotasDelBot[indiceJugadorB].setVidaMascota(0);
                    mascotasDelJugador[indiceJugadorA].setVidaMascota(0);
                    indiceJugadorA= indiceJugadorA+1;
                    indiceJugadorB=indiceJugadorB+1;
                } else if(mascotasDelBot[indiceJugadorB].getVidaMascota() <= 0 && mascotasDelJugador[indiceJugadorA].getVidaMascota() > 0){
                    //debido a que la mascota del bot murio, aumenta el indice y selecciona a la mascota siguiente en su lista
                    //y como la mascota del jugador aun tiene vida, sigue peleando 
                    System.out.println(mascotasDelJugador[indiceJugadorA].getNombre() + " le gano a " + mascotasDelBot[indiceJugadorB].getNombre());
                    mascotasDelBot[indiceJugadorB].setVidaMascota(0);
                    indiceJugadorB=indiceJugadorB+1;
                } else if(mascotasDelBot[indiceJugadorB].getVidaMascota() > 0 && mascotasDelJugador[indiceJugadorA].getVidaMascota() <= 0){
                    System.out.println(mascotasDelBot[indiceJugadorB].getNombre() + " le gano a " + mascotasDelJugador[indiceJugadorA].getNombre());
                    indiceJugadorA=indiceJugadorA+1;
                    mascotasDelJugador[indiceJugadorA].setVidaMascota(0);
                } else if (mascotasDelBot[indiceJugadorB].getVidaMascota() > 0 && mascotasDelJugador[indiceJugadorA].getVidaMascota() > 0){
                    System.out.println("Las Mascotas Siguen Vivas despues del primer ataque!");
                }
                vidaTotalJugadorA= mascotasDelJugador[0].getVidaMascota()+mascotasDelJugador[1].getVidaMascota()+mascotasDelJugador[2].getVidaMascota()+mascotasDelJugador[3].getVidaMascota()+mascotasDelJugador[4].getVidaMascota();
                vidaTotalJugadorB=mascotasDelBot[0].getVidaMascota()+mascotasDelBot[4].getVidaMascota()+mascotasDelBot[1].getVidaMascota()+mascotasDelBot[2].getVidaMascota()+mascotasDelBot[3].getVidaMascota();
                ronda++;
            }
            
            if(indiceJugadorA < indiceJugadorB){
                System.out.println("El Bot Ganó la Batalla...");
                System.out.println("Perdiste una vida");
                jugadorA.setVidaJugador(jugadorA.getVidaJugador()-3);
            } else if (indiceJugadorA>indiceJugadorB){
                System.out.println("Ganaste la batalla!");
                jugadorA.setVidaJugador(jugadorA.getVidaJugador()-3);
            } else {
                System.out.println("Es Un Empate");
                jugadorA.setVidaJugador(jugadorA.getVidaJugador()-1);
            }
     
        }
        System.out.println("EL JUGADOR SE QUEDO SIN VIDA");
    } 
}
//corregir el metodo de llenado aleatorio de equipos usando condiciones y comparando si lo que esta en mascota[n-1] != mascota[n] entonces se guarda 
//a veces una mascota se repite y toca al inicio y en la posocion 4, cuando le bajan vida a la primera, tambien lo sufre la ultima y por eso termina el proceso aun quedando mascotas vivas 

//corregir cilo porque a veces cumple la condicion y a veces se pasa del indice del arreglo
//corregir las condiciones en el if para sumentar el indice y cambiar de mascotas, porque sigue comparando con numeros menores a 0