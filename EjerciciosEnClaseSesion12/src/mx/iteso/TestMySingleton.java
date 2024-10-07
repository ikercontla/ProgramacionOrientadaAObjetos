package mx.iteso;

public class TestMySingleton {

	public static void main(String[] args) {
		
		//A travez del metodo getInstance creamos el objeto MySingleton
		MySingleton objeto = MySingleton.getInstance();
		
		System.out.println(objeto.getUnEntero());
			
		//creare otro objeto(no lo hare) para comprobar que solo existe un objeto (el que ya habia creado)
		
		MySingleton otroObjeto = MySingleton.getInstance();
		
		//modificare los valores del "nuevo" objeto creado
		otroObjeto.setUnEntero(1000);
		otroObjeto.setUnString("cara de banana");
		
		//imprimo el String del primer objeto creado
		System.out.println(objeto.getUnString());
		
		//Imprimimos la direccion de los objetos para comprobar que ambos apuntan al mismo lado
		//es decir apuntan a la misma instancia
		System.out.println("objeto: " + objeto);
		System.out.println("otroObjeto: " + otroObjeto);
	}

}
