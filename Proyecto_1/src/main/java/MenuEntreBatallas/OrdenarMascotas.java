
package MenuEntreBatallas;

import com.mycompany.proyecto_1.Mascotas.Mascota;
import java.util.Scanner;


public class OrdenarMascotas {
    
    public Mascota [] odernarMascota( Mascota mascotas []){
        Scanner escaner = new Scanner(System.in);
        Scanner escaner2 = new Scanner(System.in);
        int opcion1 = 0;
        int opcion2 = 0;
        int nuevoOrden=0;
        Mascota[] mascotasParaCambiar = new Mascota[5];
        Mascota[] mascotasCopia = new Mascota[5];
        for (int i = 0; i < mascotas.length; i++) {
            mascotasCopia[i] = mascotas[i];
        }
        do{
            System.out.println("MASCOTAS: ");
            //mostrar la lista de mascotas
            for (int i = 0; i < mascotas.length; i++) {
                System.out.println(i+ ". "+mascotas[i].getNombre());
            }

            System.out.println("Seleccione La Mascota que desea Mover de Lugar");
            do{
                opcion1 = escaner.nextInt();
            }while(opcion1 >= mascotas.length && opcion1 < 0);
            System.out.println("Selecicone el lugar en donde quiere ubicar a " +mascotas[opcion1].getNombre());
            do{
                opcion1 = escaner.nextInt();
            }while(opcion2 >= mascotas.length && opcion2 < 0);
            
            //la primera guarda la que queremos cambiar
            mascotasParaCambiar[0]=mascotas[opcion1];
            //la 2da guarda la cambiada
            mascotasParaCambiar[1]=mascotas[opcion2];
            //ubicamos cada mascota en su nueva posicion 
            mascotasParaCambiar[0]=mascotas[opcion2];
            mascotasParaCambiar[1]=mascotas[opcion1];

            System.out.println("NUEVO ORDEN: ");
            for (int i = 0; i < mascotas.length; i++) {
                System.out.println(i+ ". "+mascotas[i].getNombre());
            }
            
            while(nuevoOrden < 1 && nuevoOrden > 2){    
                System.out.println("\n¿Desea Ordenar Otra Mascota?");
                System.out.println("1. SI\n2. NO");
                nuevoOrden = escaner2.nextInt();
                if(nuevoOrden != 1 && nuevoOrden != 2){
                    System.out.println("Opcion Invalida");
                }
            }
            
        }while(nuevoOrden == 1);
        
        return mascotas;
    }
}
