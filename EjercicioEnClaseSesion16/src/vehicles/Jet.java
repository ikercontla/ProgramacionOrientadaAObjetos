package vehicles;

import interfaces.Flyable;

public class Jet extends Vehicle implements Flyable {
	
	private int height = 0;
	
	//constructor 
	public Jet(String status) {
		super(status);
	}
	//metodos abstractos Flyable
	@Override
	public void rise() {
		this.height = ((this.height + 40) <= MAX_HEIGHT) ? this.height + 40 : Flyable.MAX_HEIGHT;
	}
	
	@Override
	public void descend() {
		this.height = ((this.height - 40) >= 0) ? this.height - 40 : 0;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	

}
