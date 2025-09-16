public class Property {
    private String propertyID;
    private Address address;
    private int noRoom;
    private double rent;

    public Property(String propertyID, Address address, int noRoom, double rent) {
        setPropertyID(propertyID);
        setAddress(address);
        setNoRoom(noRoom);
        setRent(rent);
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setNoRoom(int noRoom) {
        this.noRoom = noRoom;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public Address getAddress() {
        return address;
    }

    public int getNoRoom() {
        return noRoom;
    }

    public double getRent() {
        return rent;
    }

    public double calculateAmount() {
        return 0.0;
    }
}
