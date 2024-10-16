package animals;

public class Man extends Animal {

	//constructor
	public Man(String status) {
		super(status);
	}
	
	//metodos 
	public void think() {
		System.out.println("pienso luego existo");
	}
	
	//metodo abstracto move
	
	public void move() {
		System.out.println("Camino alegremente por el parque :D");
	}
}
