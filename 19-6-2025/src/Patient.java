import java.util.ArrayList;

abstract class Patient {
    private String patientName;
    private String patientType;

    // Add arraylist to store all the treatment that patient got
    ArrayList<Treatment> treatmentsList = new ArrayList<>();

    public Patient(String patientName, String patientType) {
        setPatientName(patientName);
        setPatientType(patientType);
    }

    public void setPatientName(String patientName) { this.patientName = patientName; }

    public void setPatientType(String patientType) { this.patientType = patientType; }

    public String getPatientName() { return this.patientName; }

    public String getPatientType() { return this.patientType; }

    public ArrayList<Treatment> getTreatmentsList() { return treatmentsList; }

    // Class function
    public double calculateTotalTreatmentCost() { return 0.0; }

    public void addTreament(Treatment treatment) {}

    public void getTreatmentSummary() {
        // Loop the array list to get all the treament in list
        // sum out all the treatment's cost
        double totalCost = 0.0;

        System.out.println("All treatment: ");
        for (Treatment t : getTreatmentsList()) {
            System.out.print(t.getTreatmentName() + ", ");
            System.out.print(t.getTreatmentCost() + "\n");
            totalCost += t.getTreatmentCost();
        }
        System.out.printf("Total cost: RM %.2f", totalCost);
    }

    public void getPatientInfromation() {
        System.out.printf("Patient Name: %s\n", getPatientName());
        System.out.printf("Patient Type: %s\n", getPatientType());
    }



}