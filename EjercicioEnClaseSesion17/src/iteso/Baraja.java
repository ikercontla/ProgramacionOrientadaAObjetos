package iteso;
import java.util.Random;

import iteso.Carta;

public class Baraja {
	
	//atributo arreglo de 52 cartas
	private Carta[] cartas;
	
	public Baraja() {
		this.cartas = new Carta[56];
		llenarBaraja();
	}	
	
	private void llenarBaraja() {
		int indice = 0;
			 for (Figura figura : Figura.values()) {
				 for (Valor valor : Valor.values()) {
	                    this.cartas[indice] = new Carta(valor, figura);
	                    indice++;
	                    if (indice >= cartas.length) {
	                        break;
	                    }
	             }
	         }
		 
	}
	
	public void printCartas() {
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		for (int i = cartas.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			// Intercambiar array[i] con array[j]
			Carta temp = this.cartas[i];
			this.cartas[i] = this.cartas[j];
			this.cartas[j] = temp;
		}
	}
	
	public Carta sacarCarta() {
		int indiceActual = 0;
        if (indiceActual < cartas.length) {
            Carta carta = cartas[indiceActual];
            indiceActual++; // Incrementamos el índice actual
            return carta;
        } else {
            return null; // Si no hay más cartas, devolvemos null
        }
    }
}
