public class Surgecy extends Treatment {
    public Surgecy(String name, double cost) {
        super(name, cost);
    }

    public String displaySummary() {
        return String.format("%s - %.2f", getTreatmentName(), getTreatmentCost());
    }
}
