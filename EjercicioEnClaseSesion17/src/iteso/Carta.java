package iteso;
import iteso.Figura;
import iteso.Valor;

public class Carta {
	
	//atributos
	private Valor num;
	private Figura figura;
	
	public Carta(Valor valor, Figura figura) {
		this.figura = figura;
		this.num = valor;
	}

	public String toString() {
		return this.num + " de " + this.figura;
	}
}
