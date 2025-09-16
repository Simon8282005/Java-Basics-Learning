public class Flat extends Property {
    private double maintenanceCost;

    public Flat(String propertyID, Address address, int noRoom, double rent, double maintenanceCost) {
        super(propertyID, address, noRoom, rent);

        setMaintenanceCost(maintenanceCost);
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }
}
