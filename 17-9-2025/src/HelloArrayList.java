import java.util.ArrayList;
import java.util.Iterator;

public class HelloArrayList {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("Proton");
        cars.add("Volvo");

        // Use this to loop all element in the array list instead of using index
        Iterator <String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}