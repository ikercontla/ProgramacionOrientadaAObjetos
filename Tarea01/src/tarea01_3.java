import java.util.Random;

import javax.swing.JOptionPane;

public class tarea01_3 {

	public static void main(String[] args) {
		
		//Parte 4 de la tarea
		//Numeros randoms
		
		int sumaNumero = 0;
		//Primer metodo
		for (int i = 1; i<=1000; i++) { //ciclo for para generar 1000 numeros
			int numero = (int) ((Math.random()*(100 - 1)) + 1); //metodo para generar numeros random
															//genera numeros del 1 al 100 (incluyente)
			sumaNumero = sumaNumero+numero; 
			System.out.printf("%d\n", numero); //imprimimos el numero generado
			
		}
		
		double mediaNumero = sumaNumero/1000;
		JOptionPane.showMessageDialog(null, sumaNumero, "Suma primer metodo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaNumero, "Media primer metodo", JOptionPane.INFORMATION_MESSAGE);
		
		
		//Segundo metodo
		Random random = new Random();
		for (int i = 1; i<=1000; i++) {
			int numeroSegundo = random.nextInt(100 - 1) + 1;
			
			System.out.printf("%d\n", numeroSegundo);
		}
		
		//Tendremos que sacar la media y la desviacion estandar de cada datos generados y comparar 
		
	}//fin clase main

}
