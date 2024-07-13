public class Appointment {
    private Patient patient;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this.patient = new Patient();
        this.timeSlot = "";
        this.doctor = null;
    }

    public Appointment(Patient patient, String timeSlot, HealthProfessional doctor) {
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    public String Details() {
        return patient.Details() + " " + timeSlot + " " + doctor.Details() + ".";
    }
}
