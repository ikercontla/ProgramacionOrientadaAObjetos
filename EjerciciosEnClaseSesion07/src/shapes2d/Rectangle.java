package shapes2d;

public class Rectangle {
	
	//definimos atributos de la clase Rectangle
	public double base = 1.0; // 1.0 es el valor default de la base
	public double altura = 1.0; // valor default
	
	//definimos los metodos de la clase Rectangle
	
	//area
	public double area () {
		return base*altura;	
	}
	
	//perimetro
	public double perimetro () {
		return (2*base) + (2*altura);
	}
	
	//print
	
	public void print() { //void porque no va a regresar nada
		System.out.printf("Base: " + base + "Altura: " + altura);
		
	}
	
}
