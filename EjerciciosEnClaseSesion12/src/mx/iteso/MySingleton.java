package mx.iteso;

public class MySingleton {
	
	//Definicion de la parte static
	
	private static MySingleton instance = null;
	
	//Definicion de atributos no static
	
	private int unEntero;
	private String unString;
	
	//metodo que devuelva la instancia
	
	public static MySingleton getInstance() {
		if (instance == null) instance = new MySingleton();
		return instance;
	}
	
	//Constructor privado 
	private MySingleton() {
		this.unEntero = 1;
		this.unString = "Messi";
	}
	
	// Definimos métodos no static

    public void setUnEntero(int valor) {
        this.unEntero = valor;
    }

    public void setUnString(String valor) {
        this.unString = valor;
    }

    public int getUnEntero() { return this.unEntero;}

    public String getUnString() { return this.unString; }
	
	
}
