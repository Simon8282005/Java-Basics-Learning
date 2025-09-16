import java.util.ArrayList;

// Creating a patient abstract class as the blueprint for others class
// this class cannot been instialize and need to be extends
abstract class Patient {

    private String patientName;
    private String patientType;

    ArrayList<Treatment> treamentList = new ArrayList<>();

    public Patient(String name, String type) {
        setPatientName(name);
        setPatientType(type);
    }

    public void setPatientName(String name) {
        patientName = name;
    }

    public void setPatientType(String type) {
        patientType = type;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    // ------------------------- Custome method --------------------------------
    public double calculateTotalTreatmentCost() {
        double totalCost = 0.0;

        for (Treatment t : treamentList) {
            totalCost += t.getTreatmentCost();
        }

        return totalCost;
    }

    public void addTreatment(Treatment treatment) {
        treamentList.add(treatment);
    }

    public void getTreatmentSummary() {
        for (Treatment t : treamentList) {
            System.out.println(t.displaySummary());
        }
    }
}