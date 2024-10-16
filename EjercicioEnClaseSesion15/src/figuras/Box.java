package figuras;

public class Box extends Shape3D {

    // Atributos propios de la clase Box
    private double width;
    private double height;
    private double depth;

    // Constructor
    public Box(double x, double y, double z, double width, double height, double depth) {
        // Los atributos x, y, z los maneja la superclase
        super(x,y,z);
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    //  Setters y getters

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 1.0;
    }

    public void setHeight(double height) {
        this.width = (width > 0) ? height : 1.0;
    }

    public void setDepth(double depth) {
        this.depth = (depth > 0) ? depth : 1.0;
    }

    public double getWidth( ) { return this.width; }
    public double getHeight() { return this.height; }
    public double getDepth() { return this.depth; }

    // Implementación de los métodos propios de la clase

    public void resize(double dw, double dh, double dd) {
        setWidth(this.width + dw);
        setHeight(this.height + dh);
        setDepth(this.depth + dd);
    }

    // Sobreescribimos el método toString

    @Override
    public String toString() {
        // Construimos la parte del mensaje que le toca a la clase Box
        String mensaje = String.format("CAJA\nDimensiones:\n\tAncho = %.2f\n\tAlto = %.2f\n\tProfundidad = %.2f\n",
                                        this.width, this.height, this.depth);
        // Añadimos la parte del mensaje que le toca a la superclase
        mensaje += mensaje + super.toString();
        return mensaje;
    }

    // Implementación de los métodos abstractos

    @Override
    public double area() {
        double area = 2 * this.height + (this.width * this.depth);
        return area;
    }

    @Override
    public double volumen() {
        double volumen = this.width * this.height * this.depth;
        return volumen;
    }


}
