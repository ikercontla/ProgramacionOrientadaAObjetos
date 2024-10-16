package figuras;

public class Cylinder extends Shape3D {

    // Atributos propios de la clase Cylinder
    private double radius;
    private double height;

    //Constructor
    public Cylinder(double x, double y, double z, double radius, double height) {
        // los atributos x, y, z son manejados por la superclase
        super(x, y, z);
        setRadius(radius);
        setHeight(height);
    }

    // Setter y Getters

    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 1.0;
    }
    
    public void setHeight(double height) {
        this.height = (height > 0) ? height : 1.0;
    }

    public double getRadius() { return this.radius; }
    public double getHeight() { return this.height; }

    // Implementación de los métodos propios de la clase Cylinder

    public void resize(double dr, double dh) {
        setRadius(this.radius + dr);
        setHeight(this.height + dh);
    }

    // Métodos sobreescritos
    @Override
    public String toString() {
        //Construimos la parte del mensaje que le toca a Cylinder
        String mensaje = String.format("CILINDRO\nDimensiones:\n\tRadio = %.2f\n\tAltura= %.2f\n", this.radius, this.height);
        //Añadimos la parte del mensaje que le toca a la superclase
        mensaje += super.toString();
        return mensaje;
    }

    // Métodos abstractos que se implementan

    @Override
    public double area() {
        double area = (2 * Math.PI * Math.pow(this.radius, 2)) + 
                      (2* Math.PI * this.height * this.radius);
        return area;
    }

    @Override
    public double volumen() {
        double volumen = Math.PI * this.height * Math.pow(this.radius, 2);
        return volumen;
    }

}
