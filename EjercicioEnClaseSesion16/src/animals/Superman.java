package animals;
import interfaces.Flyable; 

public class Superman extends Man implements Flyable {

	//atributos
	private int power = 20;
	private int height = 0;
	//constructor
	public Superman(String status) {
		super(status);
	}
	
	//metodos
	public void moveFast() {
		System.out.println("Corro a super velocidad");
	}
	
	public void losePower(int kryptonite) {
		power -= kryptonite;
		if (this.power <= 0) {
			die();
		}
	}
	
	//metodos abstractos de Flyable
	
	@Override
	public void rise() {
		this.height = ((this.height + 10) <= MAX_HEIGHT) ? this.height + 10 : Flyable.MAX_HEIGHT;
	}
	
	@Override
	public void descend() {
		this.height = ((this.height - 10) >= 0) ? this.height - 10 : 0;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	
	
}
