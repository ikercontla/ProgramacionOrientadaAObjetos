import javax.swing.JOptionPane;

public class tarea01 {

	public static String limpiadorDeString(String cadena) {
		//Remplazamos los caracteres con acento y la ñ 
		cadena = cadena.replace('á', 'a');
		cadena = cadena.replace('é', 'e');
		cadena = cadena.replace('í', 'i');
		cadena = cadena.replace('ó', 'o');
		cadena = cadena.replace('ú', 'u');
		cadena = cadena.replace('ñ', 'n');
		cadena = cadena.replace('Á', 'a');
		cadena = cadena.replace('É', 'e');
		cadena = cadena.replace('Í', 'i');
		cadena = cadena.replace('Ó', 'o');
		cadena = cadena.replace('Ú', 'u');
		cadena = cadena.replace('Ñ', 'n');
		return cadena;
	} // Fin metodo limpiadorDeString
	
	public static void main(String[] args) {
		
		//Solicitar mensaje al usuario 
		String mensajeSecreto = JOptionPane.showInputDialog("Escriba el mensaje secreto: ");
		
		//Limpiamos el mensaje y lo convertimos a mayusculas
		String mensajeSecretoLimpio = limpiadorDeString(mensajeSecreto).toUpperCase();
		
		System.out.printf(mensajeSecretoLimpio);
		

		
		
		//Codificar el string de acuerdo a las reglas que se especifican mas adelante
		
		//Imprimir en un cuadro de texto el string codificado
		
		//Imprimir en cuadro de texto el string que resulta de decodificar el string obtenido al codificar el mensaje original
				
		//Reglas: 

	}

}
