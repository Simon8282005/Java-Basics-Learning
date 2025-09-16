public class Vehicle {
    protected String name = "Default Name";
    protected String brand = "Default Brand";
    protected int plateId = 1001;

    // Constructor cannot be inheritance

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlateId(int plateId) {
        this.plateId = plateId;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPlateId() {
        return plateId;
    }

    // Function
    public void hond() {
        System.out.println("Beee Beee !!");
    }

    public void displayInformation() {
        System.out.println(getName());
        System.out.println(getBrand());
        System.out.println(getPlateId());
    }
}