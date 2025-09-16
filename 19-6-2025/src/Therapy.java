public class Therapy extends Treatment {
    private String treatmentName;
    private double treatementCost;

    public Therapy(String treatmentName, double treatementCost) {
        setTreatmentName(treatmentName);
        setTreatmentCost(treatementCost);
    }

    @Override
    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    @Override
    public void setTreatmentCost(double treatmentCost) {
        this.treatementCost = treatmentCost;
    }

    @Override
    public double getTreatmentCost() {
        return this.treatementCost;
    }

    @Override
    public String getTreatmentName() {
        return this.treatmentName;
    }
}
