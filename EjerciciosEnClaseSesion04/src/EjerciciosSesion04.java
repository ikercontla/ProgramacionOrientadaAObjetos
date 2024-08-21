import javax.swing.JOptionPane;

public class EjerciciosSesion04 {

	public static void main(String[] args) {
		
		// Ejercicio 1
		// Solicite de forma separada nombre, apellido paterno y materno
		
		String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
		String apellidoPaterno = JOptionPane.showInputDialog("Escribe tu apellido paterno: ");
		String apellidoMaterno = JOptionPane.showInputDialog("Escribe tu apellido materno: ");
		
		System.out.printf("Tu nombre es: %s %s, %s", apellidoPaterno.toUpperCase(), apellidoMaterno.toUpperCase(), nombre.toUpperCase());
		
		// Ejercicio 2
		// Solicite al usuario los datos de su viaje
		
		String velocidadPromedio = JOptionPane.showInputDialog("Escribe la velocidad promedio de su viaje en km por hr: ");
		String distanciaQueFalta = JOptionPane.showInputDialog("Escribe la distancia que falta en kilometros: ");
		String cuantoTiempoParaLlegar = JOptionPane.showInputDialog("Escribe en cuanto tiempo tienes que llegar en minutos: ");
		
		// Convertimos esos datos a valores numericos
		
		int velocidadPromedioValorNumerico = Integer.parseInt(velocidadPromedio);
		int distanciaQueFaltaValorNumerico = Integer.parseInt(distanciaQueFalta);
		int cuantoTiempoParaLlegarValorNumerico = Integer.parseInt(cuantoTiempoParaLlegar);
		
		// Pasamos el tiempo que le falta para llegar a horas 
		long cuantoTiempoParaLlegarEnHoras = cuantoTiempoParaLlegarValorNumerico/60;
		
		//Calculamos en cuanto tiempo llega
		long llegarATiempo = distanciaQueFaltaValorNumerico / velocidadPromedioValorNumerico;
		
		// Hacemos un if para comparar el tiempo que le falta con el tiempo en que llegara
		if (llegarATiempo <= cuantoTiempoParaLlegarEnHoras ) {
			JOptionPane.showMessageDialog(null,
											"Si Llegas",
											"LLegaste",
										   JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, 
											"Ya no llegaste",
										   "Llegaste?",
										   JOptionPane.WARNING_MESSAGE);
		}

	}// Fin del metodo main
} // Fin de la clase EjerciciosSesion04
