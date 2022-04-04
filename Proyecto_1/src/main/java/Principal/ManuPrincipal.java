
package Principal;

import Juego.Batallas;
import Juego.Batallas;
import Juego.ModoArena;
import ObjetosPredefinidos.MascotasPredefinidas;
import Ser.Bot;
import Ser.Jugador;
import com.mycompany.proyecto_1.Mascotas.Mascota;
import java.util.Scanner;


public class ManuPrincipal {
    
    public void MostrarMenuPrincipal(){ 

        
        //crear metodo menu entre batallas
        
        int opcion;
        
         do{ 
            System.out.println("\n\nBienvenido al Juego SUPER AUTO PETS\nSeleccione una opcion ingresando el numero:");
            System.out.println("1. Modo Arena\n2. Modo Versus\n3. Modo Creativo. \n4. Salir");
            Scanner escaner = new Scanner(System.in);
            opcion = escaner.nextInt(); 
            switch (opcion){
                case 1: 
                    //crear mascotas pred. cada que inicie un juego 
                    Mascota [] MascotasTier1 = new Mascota[9];
                    MascotasPredefinidas mascotasPredTier1 = new MascotasPredefinidas();
                    MascotasTier1 = mascotasPredTier1.generarMascotasTier1();

                    
                    //se crean los equipos de manera aleatoria
                    Batallas mascotasJugador = new Batallas(1);
                    Mascota[] mascotasDelJugador = new Mascota[5];
                    mascotasDelJugador = mascotasJugador.crearListaDeMascotasJugador(MascotasTier1);
                    Batallas mascotasBot = new Batallas(1);
                    Mascota [] mascotasDelBot = new Mascota[5];
                    mascotasDelBot = mascotasBot.crearListaDeMascotasJugador(MascotasTier1);
                    
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
                    
                    //crear un nuevo jugador
                    Jugador jugadorA = new Jugador(0, "Jugador1", 10);
                    //CREAR UN BOT Y mandar parametro ronda = 1
                    Bot bot = new Bot("Bot", 10);
                    
                    System.out.println("\nINICIO EL MODO ARENA");
                    //llamar al metodo de las batallas y mandarle los personajes y su respectivo equipo de c/u
                    Batallas iniciarModoArena = new Batallas(1);
                    iniciarModoArena.iniciarBatalla(jugadorA,mascotasDelJugador, bot, mascotasDelBot);
                    
                      
                    break;
                case 2:    
                    Jugador jugadorB = new Jugador(0, "Jugador2", 10);
                    System.out.println("modo versus");
                    break;
                case 3: 
                    System.out.println("modo creativo");
                    break;
                case 4:
                    System.out.println("SALISTE DEL JUEGO...");
                    break;
                default:
                        System.out.println("opcion Invalida");
             }
         }while(opcion != 4);      
        
        

    }
}
