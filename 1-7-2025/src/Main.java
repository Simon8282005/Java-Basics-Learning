public class Main {
    public static void main(String[] args) {
        InPatient patient1 = new InPatient("Simon", "InPatient");
        OutPatient patient2 = new OutPatient("Simon_011001", "OutPatient");

        patient1.addTreatment(new Medication("Medication", 20.0));
        patient1.addTreatment(new Surgecy("Surgecy", 26.0));

        patient2.addTreatment(new Therapy("Therapy", 90.0));

        System.out.println("Patient Name: " + patient1.getPatientName());
        System.out.println("Patient Type: " + patient1.getPatientType());
        patient1.getTreatmentSummary();

        System.out.println("\nPatient Name: " + patient2.getPatientName());
        System.out.println("Patient Type: " + patient2.getPatientType());
        patient2.getTreatmentSummary();
    }
}
