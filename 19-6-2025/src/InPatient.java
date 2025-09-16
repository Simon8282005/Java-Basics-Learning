public class InPatient extends Patient {
    private String daysInHospital;

    public InPatient(String patientName, String patientType, String daysInHospital) {
        super(patientName, patientType);
        setDaysInHospital(daysInHospital);
    }

    public void setDaysInHospital(String dayInHospital) {
        this.daysInHospital = dayInHospital;
    }

    public String getDaysInHospital() {
        return daysInHospital;
    }

    @Override
    public void addTreament(Treatment treatment) {
        treatmentsList.add(treatment);
    }
}
