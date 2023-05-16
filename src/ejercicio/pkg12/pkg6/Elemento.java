
package ejercicio.pkg12.pkg6;


public class Elemento {
    Jugador jugador;
    Elemento sgte;

    public Elemento(Jugador jugador) {
        this.jugador = jugador;
        this.sgte = null;
    }

    public Jugador getJugador() {
        return jugador;
    }
    
    
}
