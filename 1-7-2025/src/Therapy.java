public class Therapy extends Treatment {
    public Therapy(String name, double cost) {
        super(name, cost);
    }

    public String displaySummary() {
        return String.format("%s - %.2f", getTreatmentName(), getTreatmentCost());
    }
}
