import java.util.Random;

public class tarea01_3 {

	public static void main(String[] args) {
		
		//Parte 4 de la tarea
		//Numeros randoms
		
		
		//Primer metodo
//		for (int i = 1; i<=1000; i++) { //ciclo for para generar 1000 numeros
//			int numero = (int) ((Math.random()*(100 - 1)) + 1); //metodo para generar numeros random
//																//genera numeros del 1 al 100 (incluyente)
//			System.out.printf("%d\n", numero); //imprimimos el numero generado
//		}
		
		
		//Segundo metodo
		Random random = new Random();
		for (int i = 1; i<=1000; i++) {
			int numeroSegundo = random.nextInt(100 - 1) + 1;
			
			System.out.printf("%d\n", numeroSegundo);
		}
		
	}//fin clase main

}
