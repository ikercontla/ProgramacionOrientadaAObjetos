package windows;

public class BasicWindows {
	
	//constances de clase
	public static final int MIN_WIDTH = 10; 
	public static final int MIN_HEIGHT = 15;
	
	//atributos protedigos
	protected int x, y;
	protected int width, height; 
	
	//constructores
	
	public BasicWindows() {
		//Construye una BasicWindow con los valores por default
		this(0, 0, MIN_WIDTH, MIN_HEIGHT);
	}
	
	public BasicWindows(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
	}
	
	//metodos setters
	
	public void setX(int x) {
		this.x = ((x >= 0) && (x <= ExtendedWindows.MAX_X)) ? x : 0;
	}

	public void setY(int y) {
		this.y = ((y >= 0) && (y <= ExtendedWindows.MAX_Y)) ? y : 0;
	}
	
	public void setWidth(int w) {
		this.width = (w >= MIN_WIDTH) ? w : MIN_WIDTH; 
	}
	
	public void setHeight(int h) {
		this.height = (h >= MIN_HEIGHT) ? h : MIN_HEIGHT;
	}
	
	//metodos getters
	public int getY() {
		return this.y;
	}

	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	//metodo display
	public void display() {
		//metodo que simula el dibujado de la ventana en la pantalla
		System.out.printf("Location: (%d, %d)\n", this.x, this.y);
		System.out.printf("Dimensions: %d x %d\n", this.width, this.height);
	}
	
	//metodo resize
	
	public void resize(int dw, int dh) {
		setWidth(this.width + dw);
		setHeight(this.height + dh);
	}
	
}//fin clase BasicWindos


