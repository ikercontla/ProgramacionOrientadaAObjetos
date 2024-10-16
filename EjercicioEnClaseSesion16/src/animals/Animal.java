package animals;

public abstract class Animal {

	//definimos los atributos
	
	protected String status;
	
	//metodo constructor 
	public Animal(String status) {
		this.status = "Estoy vivo";
	}
	
	//definimos los metodos
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void sleep() {
		System.out.println("ZZzzzz...");
	}
	
	public void die() {
		System.out.println("Estoy muerto :c");
	}
	
	//metodo abstracto
	public abstract void move();
}
