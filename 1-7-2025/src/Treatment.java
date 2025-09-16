abstract class Treatment {
    private String treatmentName;
    private double treatmentCost;

    public Treatment(String name, double cost) {
        setTreatmentName(name);
        setTreatmentCost(cost);
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    abstract String displaySummary();
}
