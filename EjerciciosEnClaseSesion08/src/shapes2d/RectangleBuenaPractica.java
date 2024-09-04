package shapes2d;
public class RectangleBuenaPractica {
	
	//haremos el ejercicio de EjerciciosEnClaseSesion07 pero con buena practica
	//aplicando el set y get
	
	private double base;
	private double altura;
	
	//Agregaremos un constructor que reciba valores iniciales 
	public RectangleBuenaPractica(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	
	//Agregaremos otro constructor sin especificar los datos iniciales
	public RectangleBuenaPractica () {
		this(1.0, 1.0); //con el metodo this y pasandole los valores, lo que estamos haciendo es llamar al constructor
						//que si recibe 2 valores de tipo double y utilizarlo para asignar los valores 
	}
	
	//Setters y getters
	
	public double getBase() { 
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double base) {
		if(base>=1) this.base = base; }

	public void setAltura(double altura) {
		if(altura>=1) this.altura = altura; }
	
	public double getArea() {
		return base*altura;
	}
	 
	public double getPerimetro() {
		return base*2 + altura*2;
	}
	
	public void print() {
		System.out.print("Base: " + base + " Altura: " + altura + "\n");
	}
}
