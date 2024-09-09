package test;
import java.util.Arrays;

import mx.iteso.colores.RGBColor; 
public class TestRGBColor {

	public static void main(String[] args) {
		
		
		//Creamos varios colores para demostrar los metodos
		//de conversion del rgb a cmyk
		
		RGBColor color1 = new RGBColor(0,0,0,"Negro");
		
		System.out.println(Arrays.toString(color1.convertToCMYK())); //mandamos a llamar el metodo toString de la clase arrays para imprimir el arreglo 
		
		RGBColor color2 = new RGBColor(27,100,150,"Morado");
		
		System.out.println(Arrays.toString(color2.convertToCMYK()));
		
		RGBColor color3 = new RGBColor(150,80,225,"Prueba");
		
		System.out.println(color3.getRGB());
		
		System.out.printf("la representacion hexadecimal del color es: %X", color3.getRGB());
	}

}
