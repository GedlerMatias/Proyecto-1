/*
 * aqui estan las comidas que brindan una ventaja a la mascota despues de comerlas 
 */
package Comida;

import com.mycompany.proyecto_1.Mascotas.Mascota;

/**
 *
 * @author Gedlr
 */
public class ConEfecto extends Comida{

    public ConEfecto(int bonusVida, int bonusDaño, int experiencia ,int bonusArmadura) {
        super(bonusVida, bonusDaño, experiencia, bonusArmadura);
    }

    
    
    /*a la mascota que este bajo el efecto, recibirà 3 de daño extra
    public void debil(Mascota mascotaAlimentada){
        mascotaAlimentada.setVidaMascota(mascotaAlimentada.getVidaMascota()-3);
        
    }
    
    public void armaduraDeMelon(Mascota mascotaAlimentada){
         
        mascotaAlimentada.setVidaMascota(mascotaAlimentada.getVidaMascota()+20);
    }*/
    
    
}
