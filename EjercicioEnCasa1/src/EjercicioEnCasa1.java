import javax.swing.JOptionPane;

public class EjercicioEnCasa1 {

	public static void main(String[] args) {
		// Realiza un programa que reciba 4 enteros (Edad, Altura en cm y Peso en Kilogramos)
		
		// Solicitamos 3 valores
		String edad = JOptionPane.showInputDialog("Escribe tu edad: ");
		String estatura = JOptionPane.showInputDialog("Escribe tu estatura: ");
		String peso = JOptionPane.showInputDialog("Escribe tu peso: ");
		
		// Los convertimos a valores numericos
		 int edadValorNumerico = Integer.parseInt(edad);
		 int estaturaValorNumerico = Integer.parseInt(estatura);
		 double pesoValorNumerico = Double.parseDouble(peso);
		 
		 
		//Calculamos el IMC de la persona con la siguiente formula (Peso/(estatura))^2)
		
		 // Primero convertimos la estatura a double
		 double estaturaEnMetros = estaturaValorNumerico;
		 //Lo dividimos entre 100 para tener la estatura en metros
		 estaturaEnMetros = estaturaEnMetros/100;
		 
		 //Utilizamos formula
		 double imc = (pesoValorNumerico/(estaturaEnMetros*estaturaEnMetros));
		 //Redondeamos resultado a entero mas cercano
		 long imcRedondeado = Math.round(imc); 
		 
		 //Imprimimos resultado
		 System.out.println("Edad: " + edadValorNumerico);
		 System.out.println("Estatura: " + estaturaEnMetros);
		 System.out.println("Peso: " + pesoValorNumerico);
		 System.out.println("Tu indice de masa corporal es: " + imc);
		 System.out.println(imcRedondeado);

		System.out.println("Hola desde Github");
		 
		 //


	}

}