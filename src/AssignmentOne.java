import java.util.ArrayList;

public class AssignmentOne {
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void CreateAppointment(Patient patient, String timeSlot, GeneralPractitioner doctor) {
        if (doctor.isAnyEmpty() || timeSlot.isEmpty() || patient.getMobile().isEmpty() || patient.getName().isEmpty()) {
            System.out.println("Cannot create appointment. All required information must be supplied.");
            return;
        }
        Appointment appointment = new Appointment(patient, timeSlot, doctor);
        appointments.add(appointment);
//        System.out.println("Appointment created for " + patient.getName() + " with generalpractitioner " + doctor.getName() + " at " + timeSlot);
    }

    public static void CreateAppointment(Patient patient, String timeSlot, Dietitian doctor) {
        if (doctor.isAnyEmpty() || timeSlot.isEmpty() || patient.getMobile().isEmpty() || patient.getName().isEmpty()) {
            System.out.println("Cannot create appointment. All required information must be supplied.");
            return;
        }
        Appointment appointment = new Appointment(patient, timeSlot, doctor);
        appointments.add(appointment);
//        System.out.println("Appointment created for " + patient.getName() + " with dietitian " + doctor.getName() + " at " + timeSlot);
    }

    public static void CancelBooking(String mobilePhone) {
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getMobile().equals(mobilePhone)) {
                appointments.remove(appointment);
                System.out.println("Appointment for " + appointment.getPatient().getName() + " has been cancelled.");
                return;
            }
        }
        System.out.println("No appointment found for mobile phone: " + mobilePhone);
    }


    public static void PrintExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        for (Appointment appointment : appointments) {
            System.out.println(appointment.Details());
        }
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // source https://www.hotdoc.com.au/search?as=practitioner&filters=specialty-27&in=dandenong-south-VIC-3164
        GeneralPractitioner doc1 = new GeneralPractitioner(1, "Dr. Amena Azizi", "Female", 30);
        GeneralPractitioner doc2 = new GeneralPractitioner(2, "Dr Ravi Wijesekara", "Male", 12);
        GeneralPractitioner doc3 = new GeneralPractitioner(3, "Dr. Priyanthi Gunawardana", "Female", 20);
        // Source https://www.hotdoc.com.au/search?as=practitioner&filters=specialty-119&in=dandenong-south-VIC-3164
        Dietitian diet1 = new Dietitian(5, "Meyya Venkat", "Female", "Paediatric nutrition");
        Dietitian diet2 = new Dietitian(6, "Racha Slim", "Female", "Weight management");
        System.out.println(doc1.Details());
        System.out.println(doc2.Details());
        System.out.println(doc3.Details());
        System.out.println(diet1.Details());
        System.out.println(diet2.Details());
        System.out.println("------------------------------");
        // Part 5 – Collection of appointments
        Patient pt1 = new Patient("Saman Kumara", "12-35678");
        Patient pt2 = new Patient("Alex Steve", "11-11911");
        Patient pt3 = new Patient("Michael Johnson", "11-25478");
        Patient pt4 = new Patient("Emily Davis", "13-36985");
        CreateAppointment(pt1, "12:20", doc3);
        CreateAppointment(pt3, "10:30", doc1);
        CreateAppointment(pt2, "8:45", diet1);
        CreateAppointment(pt4, "13:20", diet2);
        PrintExistingAppointments();
        CancelBooking("11-11911");
        PrintExistingAppointments();
    }


}
