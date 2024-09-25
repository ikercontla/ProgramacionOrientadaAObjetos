package mx.iteso.example;

//ejercicio para ver como se crea 1 y solo una instancia de una clase
//mas comunmente llamadas Singleton

	
	
public class MySingleton {
	
	private static MySingleton instance = null;
	
	private int myInteger;
	private String myString;
	
	private MySingleton() {
		//proceso complicado de incizalicion
		
		System.out.println("Construyendo un objeto de tipo MySingleton"); 
		
		myInteger = 100;
		myString = "hola";
	}
	
	//crearemos los objetos de la siguiente manera
	public static MySingleton getInstance() {
		if (instance == null) { //comprobamos que no se haya creado una instancia
			instance = new MySingleton();
		}
		return instance; //si la instancia es diferente de null (es decir ya fue creada) 
						 // el metodo simplemente regresa la instancia antes creada
	}
	
	public int getMyInteger() {
		return myInteger;
		}

	public String getMyString() {
		return myString;
		}
}
