
package Principal;

import MenuEntreBatallas.ComprarMascota;
import MenuEntreBatallas.OrdenarMascotas;
import ObjetosPredefinidos.MascotasPredefinidas;
import Ser.Jugador;
import com.mycompany.proyecto_1.Mascotas.Mascota;
import java.util.Scanner;


public class MenuEntreBatallas {
    
    public Mascota [] MostrarMenuEntreBatallas(Mascota [] mascotas, int ronda, Jugador jugador){
        int opcion=0;
        Mascota [] MascotasTier1 = new Mascota[8];
        MascotasPredefinidas mascotasPredTier1 = new MascotasPredefinidas();
        MascotasTier1 = mascotasPredTier1.generarMascotasTier1();
        
        Mascota [] MascotasTier2 = new Mascota[8];
        MascotasPredefinidas mascotasPredTier2 = new MascotasPredefinidas();
        MascotasTier2 = mascotasPredTier2.generarMascotasTier2();

        Mascota [] MascotasTier3 = new Mascota[11];
        MascotasPredefinidas mascotasPredTier3 = new MascotasPredefinidas();
        MascotasTier3 = mascotasPredTier3.generarMascotasTier3();

        Mascota [] MascotasTier4 = new Mascota[8];
        MascotasPredefinidas mascotasPredTier4 = new MascotasPredefinidas();
        MascotasTier4 = mascotasPredTier4.generarMascotasTier4();

        Mascota [] MascotasTier5 = new Mascota[8];
        MascotasPredefinidas mascotasPredTier5 = new MascotasPredefinidas();
        MascotasTier5 = mascotasPredTier5.generarMascotasTier5();

        Mascota [] MascotasTier6 = new Mascota[9];
        MascotasPredefinidas mascotasPredTier6 = new MascotasPredefinidas();
        MascotasTier6 = mascotasPredTier6.generarMascotasTier6();

        Mascota [] MascotasTier7 = new Mascota[2];
        MascotasPredefinidas mascotasPredTier7 = new MascotasPredefinidas();
        MascotasTier7 = mascotasPredTier7.generarMascotasTier7();
        
        ComprarMascota tiendaMascotas = new ComprarMascota();
        OrdenarMascotas ordenarMascotas = new OrdenarMascotas();
        
        do{
            System.out.println("PREPARATE ANTES DE INICIAR UNA BATALLA:");
            System.out.println("selecciona una opcion");
            System.out.println("1. Comprar Mascota\n2. Comprar Comida\n3. Ordena Tus Mascotas\n4.Fusionar Mascotas\n5. Vender Mascota\n6. Iniciar Batalla");
            Scanner escaner = new Scanner(System.in);
            opcion = escaner.nextInt();
            //mandar numero de ronda para desbloquear tier´s
            switch (opcion){
                case 1: 
                    System.out.println("comprando mascota...");
                    mascotas = tiendaMascotas.comprarMascota(mascotas, MascotasTier1, MascotasTier2, MascotasTier3, MascotasTier4, MascotasTier5, MascotasTier6, MascotasTier7, ronda, jugador);
                case 2: 
                    System.out.println("comprando comida...");
                case 3: 
                    System.out.println("ordenando mascotas...");
                    mascotas = ordenarMascotas.odernarMascota(mascotas);
                case 4: 
                    System.out.println("fusionando mascotas...");
                case 5: 
                    System.out.println("vender una mascota...");
                case 6: 
                    System.out.println("INICIANDO PELEA");
                default:
                    System.out.println("Opcion Incorrecta, Intenta Nuevamente");
            }
        }while(opcion != 6);    
        return mascotas; 
    }
}
