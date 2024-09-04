package test;

import shapes2d.RectangleBuenaPractica;

public class testRectangleBuenaPractica {

	public static void main(String[] args) {
		// aqui podemos empezar a utilizar objetos de tipo rectangulo para aplicar la clase Rectangle
		
				RectangleBuenaPractica myRectangle = new RectangleBuenaPractica(10.0, 6.5); //definimos una variable "myRectangle" y 
																				   //le ponemos como tipo de dato Rectangle
														 						   //la instruccion new RectangleBuenaPractica 
																				   //crea un objeto de tipo RectangleBuenaPractica
			
				//esta forma de hacer ya no es posible porque no podemos acceder directamente al atributo 
				//myRectangle.base = 2.0; //cambiamos el atributo "base" y le asignamos 2.0
				//myRectangle.altura = 3.0; //cambiamos el atributo "altura" y le asignamos 3.0
				
				//tendremos que utilizar el metodo setBase() y setAltura()
				//Como ya tenemos el constructor podemos poner el valor de los atributos en la inicializacion del rectangulo
				//myRectangle.setBase(10.0);
				//myRectangle.setAltura(11.0);
				
				RectangleBuenaPractica myRectangle2 = new RectangleBuenaPractica(myRectangle.getPerimetro()/2.0, myRectangle.getAltura()*2);
				
				//myRectangle2.setBase(8.0);
				//myRectangle2.setAltura(12);
				
				RectangleBuenaPractica myRectangle3 = new RectangleBuenaPractica(myRectangle.getBase(), myRectangle.getArea());				
				
				myRectangle.print(); //utilizamos el metodo print para imprimir los atributos del rectangulo
				myRectangle2.print();
				myRectangle3.print();
				
				//imprimimos el area y perimetro 
				System.out.println("Area Rectangulo 1: " + myRectangle.getArea() + " Perimetro Rectangulo 1: " + myRectangle.getPerimetro());
				System.out.println("Area Rectangulo 2: " + myRectangle2.getArea() + " Perimetro Rectangulo 2: " + myRectangle2.getPerimetro());
				System.out.println("Area Rectangulo 3: " + myRectangle3.getArea() + " Perimetro Rectangulo 3: " + myRectangle3.getPerimetro());
	}
}
