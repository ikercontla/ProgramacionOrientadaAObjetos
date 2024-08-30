import javax.swing.JOptionPane;

public class tarea01_1 {

	//Segunda parte del ejercicio
	//Definimos metodo para codificar utilizando xOR
	public static String codificadorXOR(String mensaje, int llave){ //recibe dos argumentos: mensaje para codificar y la llave con la se codificara
		
		String mensajeCodificado = ""; //definimos un string vacio para ir agregando los caracteres despues de aplicarles el xor
		
		for (char c : mensaje.toCharArray()) { //recorre cada caracter del mensaje
			mensajeCodificado += (char) (c^llave); // Aplica el operador xor al valor del caracter y luego convierte el resultado a un caracter
												   // luego lo suma a la cadena vacia "mensajeCodificado"
		}
		return mensajeCodificado; //regresamos la cadena creada
	} //Fin metodo codificadorXOR
	
	public static void main(String[] args) {
		
		short llave = 10791; //definimos la llave
		String mensaje = JOptionPane.showInputDialog("Mensaje para codificarXOR: "); //pedimos al usuario el mensaje a codificar
		
		String mensajeCodificado = codificadorXOR(mensaje, llave); //aplicamos metodo 
		
		JOptionPane.showMessageDialog(null, mensajeCodificado, "Mensaje codificado", JOptionPane.INFORMATION_MESSAGE);//imprimimos mensaje codificado
		
		String mensajeDecodificado = codificadorXOR(mensajeCodificado, llave); //para decodificar nada mas volvemos a 
																			   //aplicar el metodo en la cadena codificada
		
		JOptionPane.showMessageDialog(null, mensajeDecodificado, "Mensaje Decodificado", JOptionPane.INFORMATION_MESSAGE);


	}

}
