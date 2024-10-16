package figuras;

public class Sphere extends Shape3D {

    // Atributos propios de la clase Sphere
    private double radius;

    // Constructor
    public Sphere(double x, double y, double z, double radius) {
        // los atributos x, y, z los maneja la superclase
        super(x, y, z);
        setRadius(radius);
    }

    // Setters y Getters

    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 1.0;
    }

    // métodos propios de la clase Sphere
    public void resize(double dr) {
        setRadius(this.radius + dr);
    }

    // Métodos que sobreescritos de la clase Shape3D
    @Override
    public String toString() {
        //Creamos la parte del mensaje que le toca a Sphere
        String mensaje = String.format("ESFERA\nDimensiones:\n\tRadius = %.2f\n", this.radius);
        //Añadimos la parte del mensaje que le toca a la super clase
        mensaje += super.toString();
        return mensaje;
    }

    // Implementación de los métodos abstractos
    @Override
    public double area()  {
        double area = 4* Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public double volumen() {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
        return volumen;
    }


}
