import javax.swing.JOptionPane;

public class tarea01 {

	//Creamos un metodo para limpiar la string de acentos o de la ñ
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
	
	 public static String rot13(String cadena) {
	        
		 String cadenaCodificada = "";
	        for (char c : cadena.toCharArray()) {
	            if (c >= 'A' && c <= 'Z') {
	                // Calcula el carácter ROT13
	                char offset = 'A';
	                char caracterCodificado = (char) (((c - offset + 13) % 26) + offset);
	                cadenaCodificada.append(caracterCodificado);
	            }
	             else {
	                // Agrega caracteres que no están en el rango A-Z o a-z sin cambios
	                cadenaCodificada.append(caracterCodificado);
	            }
	        }
	        
	        return cadenaCodificada.toString();
	    }
	
	public static void main(String[] args) {
		
		//Solicitar mensaje al usuario 
		String mensajeSecreto = JOptionPane.showInputDialog("Escriba el mensaje secreto: ");
		
		//Limpiamos el mensaje y lo convertimos a mayusculas
		String mensajeSecretoLimpio = limpiadorDeString(mensajeSecreto).toUpperCase();
		
		for 
		
		

		
		
		//Codificar el string de acuerdo a las reglas que se especifican mas adelante
		
		//Imprimir en un cuadro de texto el string codificado
		
		//Imprimir en cuadro de texto el string que resulta de decodificar el string obtenido al codificar el mensaje original
				
		//Reglas: 

	}

}
