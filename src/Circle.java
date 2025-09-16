public class Circle {
    double radius;

    // Constructor with and without parameter are two different things
    public Circle() {
        radius = 1;
    }

    public Circle(double new_radius) {
        radius = new_radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
