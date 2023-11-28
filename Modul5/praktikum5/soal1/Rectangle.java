package praktikum5.soal1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        shapeName = "Rectangle";
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return shapeName + ", length: " + length + ", width: " + width;
    }
}
