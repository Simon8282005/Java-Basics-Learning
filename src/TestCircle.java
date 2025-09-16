public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.radius + "\nArea: " + c1.getArea());

        Circle c2 = new Circle(10.0);
        System.out.println("\nRadius: " + c2.radius + "\nArea: " + c2.getArea());
    }
}
