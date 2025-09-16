public class Address {
    private int no;
    private String street;
    private String city;

    public Address(int no, String street, String city) {
        setNo(no);
        setCity(city);
        setStreet(street);
    }

    // Setter
    public void setNo(int no) {
        this.no = no;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter
    public int getNo() {
        return this.no;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return  this.city;
    }

    // Display all the information
    public String displayInformation() {
        return String.format("\nNo: %d, Street: %s, City: %s", getNo(), getStreet(), getCity());
    }
}