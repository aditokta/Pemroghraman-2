package praktikum5.soal1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        shapeName = "Cylinder";
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String toString() {
        return shapeName + ", radius: " + radius + ", height: " + height;
    }
}
