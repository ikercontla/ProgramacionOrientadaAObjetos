package iteso;

public enum Valor {
	AS("As"), UNO("Uno"), 
	DOS("Dos"), TRES("Tres"), 
	CUATRO("Cuatro"), CINCO("Cinco"), 
	SEIS("Seis"), SIETE("Siete"), 
	OCHO("Ocho"), NUEVE("Nueve"), 
	DIEZ("Diez"), JOTO("Joto"),
	REINA("Reina"), REY("Rey");
	
	private final String nombreValor;
	
	private Valor(String nombre) { this.nombreValor = nombre; }
	
	public String toString() { return this.nombreValor; }
}
