package interfaces;

public interface Flyable {

	//definimos la constante
	public static final int MAX_HEIGHT = 100;
	
	//definimos los comportamientos
	
	public abstract void rise();
		
	public abstract void descend();
		
	public abstract int getHeight();
		
	
}
