public class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String dateTime;

    public Appointment(int appointmentId, int patientId, int doctorId, String dateTime){
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }
    public String toString(){
        return "Appointment Id: " +appointmentId+ ", Patient Id: "
                +patientId + ", Doctor Id:" +doctorId +"Date & Time"+ dateTime;
    }
}
