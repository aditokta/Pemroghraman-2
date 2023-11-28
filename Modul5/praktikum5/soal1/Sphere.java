package praktikum5.soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        shapeName = "Sphere";
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return shapeName + ", radius: " + radius;
    }
}
