public class Medication extends Treatment {
    public Medication(String name, double cost) {
        super(name, cost);
    }

    public String displaySummary() {
        return String.format("%s - %.2f", getTreatmentName(), getTreatmentCost());
    }
}
