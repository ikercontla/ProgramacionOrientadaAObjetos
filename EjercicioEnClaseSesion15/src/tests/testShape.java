package tests;
import figuras.*;

public class testShape {

    public static void main(String[] args) {
        // Creamos dos figuras de cada una
        Sphere sp1 = new Sphere(0,0,0, 3.14);
        Sphere sp2 = new Sphere(20,30, 40, 25.8);
        Cylinder cl1 = new Cylinder(-1,-20, -200, 3.14, 25);
        Cylinder cl2 = new Cylinder(3, -40, -50, -20, -200);
        Box b1 = new Box(4, 5, 6, 7, 8, 9);
        Box b2 = new Box(-40, -50, -60, 20, 30, 40);

        // La prueba de los métodos resize y move se deja de tarea

        // Metemos todas las figuras en un arreglo e imprimimos la información

        Shape3D[] shapes = {sp1, cl1, b1, b2, cl2, sp2};

        for(Shape3D shape : shapes) {
            System.out.println(shape);
        }
    }

}
