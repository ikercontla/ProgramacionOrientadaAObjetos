import javax.swing.JOptionPane;

public class tarea01 {

	//Creamos un metodo para limpiar la string de acentos o de la ñ
	public static String limpiadorDeString(String caracter) {
		
		//Remplazamos los caracteres con acento y la ñ 
		caracter = caracter.replace('á', 'a');
		caracter = caracter.replace('é', 'e');
		caracter = caracter.replace('í', 'i');
		caracter = caracter.replace('ó', 'o');
		caracter = caracter.replace('ú', 'u');
		caracter = caracter.replace('ñ', 'n');
		caracter = caracter.replace('Á', 'a');
		caracter = caracter.replace('É', 'e');
		caracter = caracter.replace('Í', 'i');
		caracter = caracter.replace('Ó', 'o');
		caracter = caracter.replace('Ú', 'u');
		caracter = caracter.replace('Ñ', 'n');
		return caracter;
	} // Fin metodo limpiadorDeString
	
	//Creamos un metodo para el codificador
	public static String rot13(String cadena) {
		
		String cadenaResultante = "";
	       
		 for (char c : cadena.toCharArray()) { //ciclo for each, el ciclo itera sobre cada caracter de el arreglo  "cadena" y el metodo "toCharArray" convierte la cadena en un arreglo de caracteres
			  if (c >= 'a' && c <= 'z') {//Verifica si el caracter es una letra minuscula (esto servira solo para decodificar el mensaje codificado
	                cadenaResultante += (char) ('a' + (c - 'a' + 13) % 26); //Aplicamos el rot13 y lo agregamos a la cadena "cadenaResultante"
	            } else if (c >= 'A' && c <= 'Z') { 
	                cadenaResultante += (char) ('A' + (c - 'A' + 13) % 26);
	            } else {
	                // Si el carácter no es una letra, simplemente lo agrega 
	                cadenaResultante += (char) (c);
	        }
		 }
	        
	        return cadenaResultante;
	    }//Fin metodo rot13
	
	public static void main(String[] args) {
		
		//Solicitar mensaje al usuario 
		String mensajeSecreto = JOptionPane.showInputDialog("Escriba el mensaje secreto: ");
		
		//Limpiamos el mensaje y lo convertimos a mayusculas
		String mensajeSecretoLimpio = limpiadorDeString(mensajeSecreto).toUpperCase();
		
		//Aplicamos metodo rot13 a la cadena y lo imprimimos
		String mensajeCodificado = rot13(mensajeSecretoLimpio);
		JOptionPane.showMessageDialog(null, mensajeCodificado, "Mensaje codificado", JOptionPane.INFORMATION_MESSAGE);
			
		//Aplicamos metodo rot13 otra vez a la cadena codificada para decodificarla
		String mensajeDecodificado = rot13(mensajeCodificado);
		JOptionPane.showMessageDialog(null, mensajeDecodificado, "Mensaje decodificado", JOptionPane.INFORMATION_MESSAGE);
		
	}//Fin metodo main

}//Fin clase tarea01
