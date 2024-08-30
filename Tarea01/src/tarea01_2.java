import javax.swing.JOptionPane;

public class tarea01_2 {
	
	//Reciclare el metodo del primer ejercicio 
	//Creamos un metodo para limpiar la string de acentos o de la ñ
	public static String limpiadorDeCadena(String caracter) {
		
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
	
    public static boolean verificarPalindromo(String miCadena) {
        int izquierda = 0; //creamos una variable para entrar al primer caracter de la cadena 
        				   //que ira recorriendo de izquierda a derecha
        int derecha = miCadena.length() - 1; //creamos una variable para entrar al ultimo caracter de la cadena 
        									 //que ira recorriendo de derecha a izquierda

        while (izquierda < derecha) { //ciclo while para ver cuando la variable "derecha" esta a la izquierda de la variable "izquierda"
            if (miCadena.charAt(izquierda) != miCadena.charAt(derecha)) { //verificamos si el caracter en el en el recorrido de la izquierda 
            															  //es el mismo que en el de la derecha
                return false;
            }
            izquierda++; //recorremos un indice a la derecha
            derecha--; // recorremos un indice a la izquierda
        }
        return true;
    }
	public static void main(String[] args) {
		//Ejercicio 3
		//Escribe un programa que reciba del usuario un string y determine si este es un palindroma o no
		
		//Primero tenemos que limpiar el string 
		//Convertir letras a minusculas
		//Eliminar caracteres acentuados o con tilde (Reciclare el metodo del primer ejercicio ^^)
		//Eliminar caracteres que no sean alfanumericos (espacios en blanco, signos de puntuacion, etc) 
		//usaremos la funcion "String newString = entrada.replaceAll(“[^A-Z]”, “”);"
		
		//Pedimos el string al usuario y lo limpiamos
		String miCadena = limpiadorDeCadena(JOptionPane.showInputDialog("Escriba el texto: ").toLowerCase());
		 
		//remplazamos caracteres no alfanumericos
		String newString = miCadena.replaceAll("[^a-z]", "");
		
		//Aplicamos metodo verificarPalindromo
		if (verificarPalindromo(newString)) { //si devuelve true es un palindromo
            JOptionPane.showMessageDialog(null, "El texto es un palíndromo.", "", JOptionPane.INFORMATION_MESSAGE);
        } else { //si devuelve false no es un palindromo
            JOptionPane.showMessageDialog(null, "El texto no es un palíndromo.", "", JOptionPane.ERROR_MESSAGE);
        }

		
	}//Fin metodo main

}
