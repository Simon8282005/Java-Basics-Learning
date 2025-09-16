public class OutPatient extends Patient {
    private String targetHospital;

    public OutPatient(String patientName, String patientType) {
        super(patientName, patientType);
    }

    public void setTargetHospital(String targetHospital) {
        this.targetHospital = targetHospital;
    }

    public String getTargetHospital() {
        return targetHospital;
    }
}
