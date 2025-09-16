public class Owner extends Person implements Expense {
    private String ownerNo;
    private Property[] property;

    public Owner(String ownerNo, Property[] property, String name, Address address) {
        super(name, address);

        setOwnerNo(ownerNo);
        setProperty(property);
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public void setProperty(Property[] property) {
        this.property = property;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public Property[] getProperty() {
        return property;
    }

    @Override
    public double calculateAmount(int id) {
        return super.calculateAmount(id);
    }
}
