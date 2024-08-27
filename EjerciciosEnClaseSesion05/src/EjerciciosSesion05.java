import javax.swing.JOptionPane;

public class EjerciciosSesion05 {

	public static void main(String[] args) {
		// 1. Definimos una clave alfanumerica
		
		String claveSecreta = "Hola";
		
		// 2. Preguntar al usuario y contamos las veces que introduce algo
		
		String entrada =""; //Inicializacion para el ciclo
		int contador = 0;
		String titulo = null, mensaje = null; 
		boolean bandera = true;
		
		do {
			entrada = JOptionPane.showInputDialog("Escribe la clave secreta: ");
			
			// Usuario se rindio 
			
			if (entrada == null) {
				contador++;
				mensaje = String.format("Te rendiste despues de %d intentos",  contador);
				titulo = "LOSER!";
				bandera = false;
				break;
			}
			
			// Usuario no introdujo nada
			
			if (entrada.equals("")) {
				continue;
			}
			
			//Escribe algo que no sea la clave secreta
			if (!(entrada.equals(claveSecreta))) {
				JOptionPane.showMessageDialog(null, "Esa no es la clave secreta", "Error", JOptionPane.ERROR_MESSAGE);
				contador++;
			} else {
				contador++;
				mensaje = String.format("Atinaste la clave secreta en %d intentos", contador);
				titulo = "Ganador!";
				bandera = false;
			}
			
		} while (bandera);
		
		//cuando el ciclo termina desplegamos el mensaje
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
		
//		
//		
//		// Ejemplo de uso Sentencia for
//		
//		//Impresion de caracteres
//		for (char c1 = 'A'; c1<='Z'; c1++) {
//			System.out.print(c1);
//		}
//	
	} //Fin del metodo main

} //Fin de la clase EjerciciosSesion05
