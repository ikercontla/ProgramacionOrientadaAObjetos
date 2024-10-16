package animals;
import interfaces.Flyable; 

public class Bird extends Animal implements Flyable {
	
	//atributos 
	private int height = 0;
	
	//constructor
	
	public Bird(String status) {
		super(status);
	}
	
	//metodos abstractos de animal 
	
	public void move() {
		System.out.println("Vuelo por los cielos porque soy un pajaro");
	}
	
	//metodos abstractos de Flyavle
	
	@Override
	public void rise() {
		this.height = ((this.height + 2) <= MAX_HEIGHT) ? this.height + 2 : Flyable.MAX_HEIGHT;
	}
	
	@Override
	public void descend() {
		this.height = ((this.height - 2) >= 0) ? this.height - 2 : 0;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	
}
	
