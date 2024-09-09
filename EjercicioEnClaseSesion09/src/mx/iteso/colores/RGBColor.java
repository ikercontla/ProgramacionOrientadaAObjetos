package mx.iteso.colores; 

	//Ejercicio colores rgb

	//Atributos: 
	// red, green, blue (int)(privados)
	//name (String)(privado)

	//Constructores:
	//RGBColor()
	//RGBColor(red, green, blue, name)

	//Metodos:
	//getCyan() int
	//getMagenta() int
	//getYellow() int
	//getRGB() int
public class RGBColor {

	//primer paso	
	//definicion atributos	
	private int red; //guarda el componente rojo del color
	private int green; //guarda el componente verde del color
	private int blue; //guarda el componente azul del color
	private String name; //guarda el nombre del color
	
	//Segundo paso
	//Constructores
	public RGBColor() {		
	}	
	
	public RGBColor(int red, int green, int blue, String name) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
		setName(name);
	}
	
	//Tercer paso
	//getters y setters
	
	public void setRed(int red) {
		this.red = ((red >= 0) && (red <= 255)) ? red : 127;
	}
	
	public int getRed() {
		return this.red;
	}
	public void setGreen(int green) {
		this.green = ((green >= 0) && (green <= 255)) ? green : 127;
	}
	
	public int getGreen() {
		return this.green;
	}
	public void setBlue(int blue) {
		this.blue = ((blue >= 0) && (blue <= 255)) ? blue : 127;
	}
	
	public int getBlue() {
		return this.blue;
	}
	
	public void setName(String name) {
		if (name==null) { //validamos si name es null regresamos valor por default (gris)
			this.name = "gris";
			return;
		}
		if (name.equals("")) { //si el names es vacio regresamos valor por default (gris)
			this.name = "Gris";
			return;
		}
		this.name = name;
		return;
	}
	
	public String getName() {
		return this.name;
	}
	
	//metodos para convertir de RGB a CMYK
	
	//metodo para el negro
	public double getBlack() {
		
		//paso numero 1: normalizar los colores
		double redNormalizado = red/255.0; //division entre 2 enteros te regresa el cociente
		double greenNormalizado = green/255.0;
		double blueNormalizado = blue/255.0;
		
		//paso numero 2 aplicar formula para sacar el negro (black = 1 - max(redNormalizado, greenNormalizado, blueNormalizado)
		double black = 1.0 -  Math.max(redNormalizado, Math.max(greenNormalizado, blueNormalizado)); 
		
		return black;
	}
	
	//cuidar que el color no sea el negro puro para no tener divisiones entre 0
	
	//metodo para el cyan
	public double getCyan() {
		
		//calculamos el negro 
		double black = getBlack(); 
		//verificamos si es igual a 1 (en caso de que lo sea cyan sera 0
		if (black == 1.0) { return 0.0;
		}
		
		//Paso 1: normalizamos el rojo
		double redNormalizado = red/255.0;
		
		//formula para calcular el cyan
		double cyan = (1 - redNormalizado - black) / (1 - black);
		
		return cyan;
	}
	
	//metodo para el magenta
	public double getMagent() {
		//calculamos el negro 
		double black = getBlack(); 
		//verificamos si es igual a 1 (en caso de que lo sea cyan sera 0
		if (black == 1.0) { return 0.0;
		}
				
		//Paso 1: normalizamos el green
		double greenNormalizado = green/255.0;
				
		//formula para calcular el magent
		double magent = (1 - greenNormalizado - black) / (1 - black);
				
				return magent;
	}
	
	//metodo para el amarillo
	public double getYellow() {
		//calculamos el negro 
		double black = getBlack(); 
		//verificamos si es igual a 1 (en caso de que lo sea cyan sera 0
		if (black == 1.0) { return 0.0;
		}
				
		//Paso 1: normalizamos el azul
		double blueNormalizado = blue/255.0;
				
		//formula para calcular el yellow
		double yellow = (1 - blueNormalizado - black) / (1 - black);
				
		return yellow;
	}
	
	//crearemos un metodo para convertir RGB a CMYK
	
	public double[] convertToCMYK() {
		double[] cmyk = new double[4]; //creamos un arreglo de 4 doubles 
		
		cmyk[0] = getCyan(); //en el primer elemento del arreglo guardamos el valor de cyan y asi consecutivamente
		cmyk[1] = getMagent();
		cmyk[2] = getYellow();
		cmyk[3] = getBlack();
		
		return cmyk;
	}
	
	//Metodo para regresar la representacion hexadecimal de nuestro color 
	
	public int getRGB() {
		//Vamos a tomar los 3 atributos enteros (red,green,blue) y los empaquetaremos en un solo entero de 32 bits 
		//paso 1. pasamos los valores de los atributos a numeros de 8 bits
		
		byte redByte = (byte) red; //lo que hace es que los 24 bits mas significativos los tira a la basura
		byte greenByte = (byte) green;
		byte blueByte = (byte) blue;
		
		//creamos una variable int(32 bits) y hacemos corrimientos con los numeros de 8 bits
		
		int rgb = ((redByte & 0xFF) << 16) | ((greenByte & 0xFF) << 8) | ((blueByte & 0xFF) << 0);
		
		return rgb;
	}
	
	//metodo equales para comparar si dos colores son iguales
	
	//metodo clone: crear un nuevo objeto que tiene que tener los mismos atributos del objeto que quieres clonar
	
	//metodo que regresa un string que es el metodo toString para que los colores impriman su informacion en la consola de una forma bonita
	//regresara "el color (nombre del color) tiene los siguientes atributos: 
																	    //Red: [Red]
																		//Green: [Green]
																		//Blue:  [Blue]
	//su representacion en CMYK es: [CMYK]
	//su representacion hexadecimal es: [hex]"
								
	
}//fin clase RGBColor
