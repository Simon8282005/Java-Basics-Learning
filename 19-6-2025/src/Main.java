import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new InPatient("GG", "InPatient", "10 Days");
        p1.addTreament(new Medication("Paracetamol", 30.0));
        p1.addTreament(new Medication("Physiotherapy", 150.0));
        p1.addTreament(new Medication("Appendectomy", 3500.0));

        p1.getPatientInfromation();
        p1.getTreatmentSummary();

    }
}
