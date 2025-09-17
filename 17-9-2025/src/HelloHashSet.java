import java.util.HashSet;

// a set that can contain unique elemnent also
public class HelloHashSet {
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("Volvo");

        System.out.println(cars);  // Output will only got one volvo
    }
}
