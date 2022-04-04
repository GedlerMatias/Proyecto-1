/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuEntreBatallas;

import Ser.Jugador;
import com.mycompany.proyecto_1.Mascotas.Mascota;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gedlr
 */
public class ComprarMascota {
    
    public Mascota []comprarMascota(Mascota [] mascotasDelJugador,Mascota [] mascotasTier1, Mascota [] mascotasTier2,Mascota [] mascotasTier3, Mascota [] mascotasTier4, Mascota [] mascotasTier5,Mascota [] mascotasTier6, Mascota [] mascotasTier7, int ronda, Jugador jugador){
        int opcion = 0;
        int posicion=0;
        Random random = new Random();
        int valorRandom = random.nextInt(8);
        Scanner escaner = new Scanner(System.in);
        Scanner escaner2 = new Scanner(System.in);
        if (ronda == 1){
             do{   
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier1.length; i++) {
                    System.out.println((i+1)+". "+mascotasTier1[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier1.length && opcion <  0);
             
             do{
                System.out.println("Elegiste: "+mascotasTier1[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier1[opcion-1];
        }else if (ronda >= 2 && ronda < 4){
             
            do{
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier2.length; i++) {
                     System.out.println((i+1)+". "+mascotasTier2[i].getNombre());
                }
                opcion = escaner.nextInt();
                
             }while(opcion >= mascotasTier2.length && opcion <0);
            do{
                System.out.println("Elegiste: "+mascotasTier2[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier2[opcion-1];
             
        } else if (ronda >= 4 && ronda < 6){
             do{
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier3.length; i++) {
                     System.out.println((i+1)+". "+mascotasTier3[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier3.length && opcion < 0);
             do{
                System.out.println("Elegiste: "+mascotasTier3[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier3[opcion-1];
             
        } else if (ronda >= 6 && ronda < 8){
             do{   
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier4.length; i++) {
                    System.out.println((i+1)+". "+mascotasTier4[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier4.length && opcion < 0);
             do{
                System.out.println("Elegiste: "+mascotasTier4[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier4[opcion-1];
        } else if (ronda >= 8 && ronda < 10){
             do{   
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier5.length; i++) {
                    System.out.println((i+1)+". "+mascotasTier5[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier5.length && opcion < 0);
             do{
                System.out.println("Elegiste: "+mascotasTier5[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier5[opcion-1];
        } else if (ronda >= 10 && ronda < 12){
             do{   
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier6.length; i++) {
                    System.out.println((i+1)+". "+mascotasTier6[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier6.length && opcion < 0);
             do{
                System.out.println("Elegiste: "+mascotasTier1[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion-1] = mascotasTier6[opcion-1];
        } else if (ronda >= 12){
             do{
                System.out.println("ORO:"+ jugador.getOro() + "\nSeleccione una Mascota:");
                for (int i =0; i< mascotasTier7.length; i++) {
                    System.out.println((i+1)+". "+mascotasTier1[i].getNombre());
                }
                opcion = escaner.nextInt();
             }while(opcion >= mascotasTier7.length && opcion < 0);
             do{
                System.out.println("Elegiste: "+mascotasTier7[opcion-1].getNombre());
                System.out.println("ESCOGE LA POSICION EN QUE ESTARA LA NUEVA MASCOTA:");
                posicion = escaner2.nextInt();
             }while(posicion >= mascotasDelJugador.length && posicion <= 0);
             mascotasDelJugador[posicion - 1] = mascotasTier7[opcion-1];
        }
        
         
        return mascotasDelJugador;
    }
    
}
