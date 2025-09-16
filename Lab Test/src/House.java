public class House extends Property {
    private int noStorey;

    public House(String propertyID, Address address, int noRoom, double rent, int noStorey) {
        super(propertyID, address, noRoom, rent);

        setNoStorey(noStorey);
    }

    public void setNoStorey(int noStorey) {
        this.noStorey = noStorey;
    }

    public int getNoStorey() {
        return noStorey;
    }
}
