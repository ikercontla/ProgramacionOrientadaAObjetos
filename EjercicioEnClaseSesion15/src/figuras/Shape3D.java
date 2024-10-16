package figuras;

public abstract class Shape3D {

    protected double x, y, z;

    // Definición del constructor

    public Shape3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    // Setters y Getters

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() { return this.x; }

    public double getY() { return this.y; }

    public double getZ() { return this.z; }

    // Métodos que todas las sub-clases realizan igual

    public void move(double dx, double dy, double dz) {
        setX(this.x + dx);
        setY(this.y + dy);
        setZ(this.z + dz);
    }

    // Definición de métodos que las clases van a sobreescribir

    public String toString() {
        String mensaje = String.format("Dimensiones= < x:%.2f, y:%.2f, z:%.2f > \n"
                                        + "Área = %.2f\n"
                                        + "Volumen = %.2f\n", 
                                        this.x, this.y, this.z, area(), volumen());
        return mensaje;
    }

    // Definición de métodos abstractos
    // Las subclases de Shape3D tienen OBLIGACIÓN de implementar estos métodos

    public abstract double area();
    public abstract double volumen();


} //  fin de la clase Shape3D
