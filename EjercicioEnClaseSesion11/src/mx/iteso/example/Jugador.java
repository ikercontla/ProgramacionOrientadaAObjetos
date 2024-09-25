package mx.iteso.example;

public class Jugador {
	 private static int contadorJugadores = 0;

	 private String nombre;

	 public Jugador (String nombre) {
		 if (contadorJugadores < 5) {
			 this.nombre = nombre;
	         contadorJugadores ++;
	     } else {
	    	 System.out.println("ya no puedes crear jugadores, se alcanzó el máximo");
	     }
	    }

	 public String getNombre() {
		 return this.nombre;
	 }

	 public static int getContadorJugadores() {
		 return contadorJugadores;
	 }
}
