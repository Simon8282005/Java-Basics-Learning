public class Client extends Person {
    private String clientNo;
    private String prefType;
    private double maxRent;
    private Property[] property;
    private Property[] matchProperty;

    private int index = 0;

    public Client(String clientNo, String prefType, double maxRent, Property[] property, String name, Address address) {
        super(name, address);

        setClientNo(clientNo);
        setPrefType(prefType);
        setMaxRent(maxRent);
        setProperty(property);
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public void setPrefType(String prefType) {
        this.prefType = prefType;
    }

    public void setMaxRent(double maxRent) {
        this.maxRent = maxRent;
    }

    public void setMatchProperty(Property[] matchProperty) {
        this.matchProperty = matchProperty;
    }

    public void setProperty(Property[] property) {
        this.property = property;
    }

    public String getClientNo() {
        return clientNo;
    }

    public String getPrefType() {
        return prefType;
    }

    public double getMaxRent() {
        return maxRent;
    }

    public Property[] getMatchProperty() {
        return matchProperty;
    }

    public Property[] getProperty() {
        return property;
    }

    public void findMatchPorperty(String prefType, int maxRent) {
        for (Property properties : getProperty()) {
            if (properties.getPropertyID().equals(prefType) && (properties.getRent() == maxRent)) {
                matchProperty[index] = properties;
                System.out.println("Expected property found. ");
            } else {
                System.out.println("Sorry. No expected property found. ");
            }
        }
    }

    @Override
    public double calculateAmount(int id) {
        // Assume that 111 is flat
        // and 000 is house
        for (Property property : getMatchProperty()) {
            return property.calculateAmount();
        }
        return 0.0;
    }
}
