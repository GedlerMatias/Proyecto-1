
package Ser;

/**
 *
 * @author Gedlr
 */
public class Jugador extends Ser{
    private int oro;

    public Jugador(int oro, String nombre, int vidaJugador) {
        super(nombre, vidaJugador);
        this.oro = oro;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    
}
