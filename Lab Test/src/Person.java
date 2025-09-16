public class Person implements Expense {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        setName(name);
        setAddress(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public double calculateAmount(int id) {
        return 0.0;
    }
}
