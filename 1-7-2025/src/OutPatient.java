public class OutPatient extends Patient implements PatientProperties{
    public OutPatient(String name, String type) {
        super(name, type);
    }

    public void displayAddress(String houseAddress) {
        System.out.println("House address: " + houseAddress);
    }

    public void displayHospitalAddress(String hospitalAddress) {
        System.out.println("Hospital address: " + hospitalAddress);
    }
}
