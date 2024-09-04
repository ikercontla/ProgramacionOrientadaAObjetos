package test;
import shapes2d.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// aqui podemos empezar a utilizar objetos de tipo rectangulo para aplicar la clase Rectangle
		
		Rectangle myRectangle = new Rectangle(); //definimos una variable "myRectangle" y le ponemos como tipo de dato Rectangle
												 //la instruccion new Rectangle crea un objeto de tipo Rectangle
		
		System.out.println(myRectangle.base); //accede al atributo base de el objeto myRectangle
		System.out.println(myRectangle.area()); //accede al metodo area de el objeto myRectangle
		
		myRectangle.base = 2.0; //cambiamos el atributo "base" y le asignamos 2.0
		myRectangle.altura = 3.0; //cambiamos el atributo "altura" y le asignamos 3.0
		System.out.println(myRectangle.area()); //imprimmos el area
		
		Rectangle myRectangle2 = new Rectangle();
		
		myRectangle2.base = 7.0;
		myRectangle2.altura = 12.0;
		System.out.println(myRectangle2.area());
		
		myRectangle.print(); //utilizamos el metodo print para imprimir los atributos del rectangulo
		myRectangle2.print();
		
		Rectangle myRectangle3 = new Rectangle();
		myRectangle3.base = -15.0;
		
		System.out.println(myRectangle3.area());
		
	}//Fin clase main

}
