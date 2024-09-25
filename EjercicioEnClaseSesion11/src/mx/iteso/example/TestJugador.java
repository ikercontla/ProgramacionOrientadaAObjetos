package mx.iteso.example;

public class TestJugador {

	public static void main(String[] args) {
		
		System.out.println("Número de jugadores: " + Jugador.getContadorJugadores());

        Jugador j1 = new Jugador("Pepe");
        System.out.println("Se creó el jugador " + j1.getNombre());

        Jugador j2 = new Jugador("Paco");
        System.out.println("Se creó el jugador " + j2.getNombre());
        Jugador j3 = new Jugador("Pedro");
        System.out.println("Se creó el jugador " + j3.getNombre());
        Jugador j4 = new Jugador("Juan");
        System.out.println("Se creó el jugador " + j4.getNombre());
        Jugador j5 = new Jugador("José");
        System.out.println("Se creó el jugador " + j5.getNombre());
        Jugador j6 = new Jugador("Erick");
        System.out.println("Se creó el jugador " + j6.getNombre());

        

    }


}
