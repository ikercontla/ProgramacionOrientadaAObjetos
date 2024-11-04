package iteso;

public enum Figura {
	CORAZON("Corazón"), TREBOL("Trébol"), DIAMANTE("Diamante"), ESPADA("Espada");

private final String nombreFigura;

private Figura(String nombre ) { this.nombreFigura = nombre; }

public String toString() { return this.nombreFigura; }

}