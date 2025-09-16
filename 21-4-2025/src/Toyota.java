public class Toyota extends Vehicle {
    public static void main(String[] args) {
        Toyota car = new Toyota();

        car.setName("Toyota");

        System.out.println(car.name);
        System.out.println(car.brand);
        System.out.println(car.plateId + "\n");

        car.hond();
        car.displayInformation();

    }
}
