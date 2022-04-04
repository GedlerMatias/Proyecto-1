
package ObjetosPredefinidos;

import Comida.Comida;
import Comida.ConEfecto;
import Comida.SinEfecto;
import com.mycompany.proyecto_1.Mascotas.Mascota;


public class ComidasPredefinidas {
    final Comida [] comidasTier1 = new Comida[3];
    final Comida [] comidasTier2 = new Comida[3];
    final Comida [] comidasTier3 = new Comida[3];
    
    //constructor 
    public ComidasPredefinidas() {
    }
    
    
    
    
    
    public Comida [] rellenarArregloComidaTier1(){
         SinEfecto manzana = new SinEfecto(1, 1, 0, 0);
         ConEfecto naranja = new ConEfecto(0,0,0, 0);
         ConEfecto miel = new ConEfecto(0,0,0, 0);
         comidasTier1[0] = manzana;
         comidasTier1[1] = naranja;
         comidasTier1[2] = miel;
         return comidasTier1;
    }
    
    public void rellenarregloComidaTier2(){
        SinEfecto pastelito = new SinEfecto(3,3,0, 0);
        ConEfecto HuesoDeCarne = new ConEfecto(0,0,0,0);
        //este bloquea a la mascota para siempre 
        ConEfecto pastillaParaDormir = new ConEfecto(0,0,0,0);
        
    }
    
    public void rellenarAregloComidaTier3(){
        ConEfecto ajo = new ConEfecto(0,0,0,0);
        // da esas cantidades a 2 animales aleatorios del equipo
        SinEfecto ensalada = new SinEfecto(1,1,0,0);
        //aumenta las cantidades a los animales de la tienda y futuros por aparecer
        SinEfecto comidaEnlatada = new SinEfecto(3,3,0,0);
        //se elije una mascota para aumentarle:
        SinEfecto pera = new SinEfecto(2,2,0,0);
    }
    
    public void rellenarAregloComidaTier4(){
        //le quita 5 de daño al animal que esta detras del que atacó
        ConEfecto chile = new ConEfecto(0,0,0,0);
        SinEfecto chocolate = new SinEfecto(0,0,1,0);
        //les da las cantidades a 3 mascotas de forma aleatoria
        SinEfecto sushi = new SinEfecto(1,3,0,0);
             
    }
    
    public void rellenarAregloComidaTier5(){
        //hace que la mascota no reciba daño por una ronda
        ConEfecto melon = new ConEfecto(0,0,0,0);
        //al morir la mascota, revive con las siguientes caracteristicas
        ConEfecto hongo = new ConEfecto(1,1,0,0);
        
        
    }
    
    public void rellenarAregloComidaTier6(){
        //a dos mascotas aleatorias del equipo les da:
        SinEfecto pizza = new SinEfecto(2,2,0,0);
        //hace +20 de daño por ronda una vez por ronda
        ConEfecto carne = new ConEfecto(0,20,0,0);
    
    }
    
    public void rellenarAregloComidaTier7(){
        //le agrega un tipo extra a la mascota
        ConEfecto gelatina = new ConEfecto(0,0,0,0);
    }
}

