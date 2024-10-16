package vehicles;

public class Vehicle {

	//definimos los atributos 
	protected double fuel;
	protected double speed;
	protected String status;
	
	//metodo constructor 
	
	public Vehicle(String status) {
		this.status = "No estoy vivo pero si existo";
	}
	
	//metodos de la clase vehicles
	
	public void speedUp() {
		this.speed += 50;
	}
	
	public void slowDown() {
		this.speed -= 50;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void loadFuel(double fuel) {
		this.fuel += fuel;
	}
}
