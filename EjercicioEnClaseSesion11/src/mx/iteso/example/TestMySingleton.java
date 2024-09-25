package mx.iteso.example;

public class TestMySingleton {

	public static void main(String[] args) {
		
		//esto da error ya que el constructor no es visible	
		//MySingleton mySingleton = new MySingleton(); 
		
		//para poder generar un objeto de tipo MySingleton
		//tendremos que usar el metodo getInstance
		
		MySingleton mySingleton = MySingleton.getInstance();
		
		System.out.println(mySingleton.getMyInteger());
		
		MySingleton otroSingleton = MySingleton.getInstance();
		
		//compararemos las 2 instancias creadas
		//deberia ser true ya que mySingleton y otroSingleton apuntan al mismo lado
		System.out.println("mySingleton == otroSingleton: " + (mySingleton == otroSingleton));

	}

}
