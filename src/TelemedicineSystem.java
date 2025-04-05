import java.util.*;
public class TelemedicineSystem {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    private int userIdCounter = 1;
    private int appointmentIdCounter =1;

    public void registerDoctor(String name, String email, String password, String specialization){
        doctors.add(new Doctor(userIdCounter++, name, email, password, specialization));
        System.out.println("Doctor registered successfully");
    }

    public void registerPatient(String name, String email, String password){
        patients.add(new Patient(userIdCounter++, name, email, password));
        System.out.println("Patients registered successfully");
    }
    public Patient loginPatient(String email, String password){
        for (Patient p: patients){
            if (p.getEmail().equals(email) && p.checkPassword(password)){
                System.out.println("Login Successful! Welcome " +p.getName());
                return p;
            }
        }
        System.out.println("Login failed");
        return  null;
    }
    public Doctor loginDoctor(String email, String password){
        for (Doctor d: doctors){
            if (d.getEmail().equals(email) && d.checkPassword(password)){
                System.out.println("Login Successful! Welcome Dr. " +d.getName());
                return d;
            }
        }
        System.out.println("Login Failed");
        return  null;
    }
    public void bookAppointment(Patient patient, int doctorId, String dateTime){
        for (Doctor d: doctors){
            if (d.getId() == doctorId){
                appointments.add(new Appointment(appointmentIdCounter++, patient.getId(),
                        doctorId, dateTime));
                System.out.println("Appointment booked with Dr. " +d.getName());
                return;
            }
        }
        System.out.println("Doctor not found");
    }
    public void viewAppointments(){
        for (Appointment a: appointments){
            System.out.println(a);
        }
    }
    public void listDoctors(){
        for (Doctor d: doctors){
            System.out.println("Id: " +d.getId() + ", Name: Dr. " +d.getName()
            + ", Specialization: " +d.getSpecialization());
        }
    }
}
