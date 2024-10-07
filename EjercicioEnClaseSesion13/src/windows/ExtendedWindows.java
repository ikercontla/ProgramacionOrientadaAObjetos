package windows;

public class ExtendedWindows extends BasicWindows {
	
	//constantes
	public static final int MAX_X = 1200;
	public static final int MAX_Y = 1080;
	
	//atributos
	protected String title;
	
	//constructores
	
	public ExtendedWindows() {
		this(0, 0, MIN_WIDTH, MIN_HEIGHT, "Ventana");
	}
	public ExtendedWindows(int x, int y, int w, int h, String title) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setTitle(title);
	}
	
	//setter (solo falta setTitle)
	
	public void setTitle(String title) {
		this.title = title;

	}
	
	//getter
	
	public String getTitle() {
		return this.title;
	}
	
	//metodo move
	public void move(int dx, int dy) {
		setX(x + dx) ;
		setY(y + dy);
	}
	
	@Override //significa que lo que sigue sera una sobrescritura de una metodo que ya existe en las clases de "arriba"
	public void display() {
		System.out.printf("Titulo %s\n", this.title);
		super.display(); //super accede al metodo display de la superclase (clase mas arriba)
	}
	



}
