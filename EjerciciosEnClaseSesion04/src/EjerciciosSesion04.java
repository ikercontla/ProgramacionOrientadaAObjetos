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
		
		// Ejercicio 3
		//Solicite al usuario su lenguaje de programacion favorito 
		//Si es java imprimir "su lenguaje es el mas popular"
		//Si es C imprimir "su lenguaje es el segundo mas popular
		//Si es C++ imprimir "su lenguaje es el tercero mas popular"
		//En caso de que sea otro imprimir "Su lenguaje no es popular o no existe"
		
		//solicitamos al usuario su lenguaje de programacion favorito
		String lenguajeFavorito = JOptionPane.showInputDialog("Cual es su lenguaje de programacion favorito?");
		
		// Convertimos la respuesta a todo minusculas para que podamos compararlo a una cadena mas facilmente
		String lenguajeFavoritoMinusculas = lenguajeFavorito.toLowerCase();
		
		//Comparamos a java, C y c++ con el metodo equals
		
		if (lenguajeFavoritoMinusculas.equals("java")) {
			System.out.printf("su lenguaje de programacion es el mas popular");
		}
		else if (lenguajeFavoritoMinusculas.equals("c")) {
			System.out.printf("Su lenguaje de programacion es el segundo mas popular");
		}
		else if (lenguajeFavoritoMinusculas.equals("c++")) {
			System.out.printf("Su lenguaje de programacion es el tercero mas popular");
		}
		else {
			System.out.printf("Su lenguaje no es popular o no existe");
		}

		//Ejercicio 4 
		// Solicitar al usuario: Nombre del mes y year
		//Desplegar el numero de dia del mes
		//Utilizar switch
		//Si es Febrero, determinar si el year es bisiesto
		
		//solicitamos al usuario el mes y el year
		String nombreDelMes = JOptionPane.showInputDialog("Escriba el nombre del mes: ");
		String year = JOptionPane.showInputDialog("Que year es: ");
		
		//Convertimos el year a valor numerico
		int yearValorNumerico = Integer.parseInt(year);
		
		//Creamos una string para almacenar el dia de mes
		String diasMes = "";
		
		//Utilizamos la sentencia "switch" para todos los casos
		switch (nombreDelMes.toLowerCase().trim()) {
		case "enero" : diasMes = "31"; break;
		case "marzo" : diasMes = "31"; break;
		case "abril" : diasMes = "30"; break;
		case "mayo" : diasMes = "31"; break; 
		case "junio" : diasMes = "30"; break;
		case "julio" : diasMes = "31"; break;
		case "agosto" : diasMes = "31"; break;
		case "septiembre" : diasMes = "30"; break;
		case "octubre" : diasMes = "31"; break;
		case "noviembre" : diasMes = "30"; break;
		case "diciembre" : diasMes = "31"; break;
		case "febrero" : 
			if ((yearValorNumerico % 4 == 0 && yearValorNumerico % 100 != 0) || (yearValorNumerico % 400 == 0)) { //determinamos si el year es bisiesto
				System.out.printf("El year es bisiesto \n");
				diasMes = "29"; // si si lo es el mes tendria 29 dias
			}
			else { 
				System.out.printf("El year no es bisiesto \n");
				diasMes = "28";
			}
			break;
			
		}
		
		System.out.printf("El mes tiene %s dias", diasMes);
		
	}// Fin del metodo main
} // Fin de la clase EjerciciosSesion04




























