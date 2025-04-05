import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TelemedicineSystem system = new TelemedicineSystem();

        while (true){
            System.out.println("\n Telemedicine System");
            System.out.println("1. Register as Doctor");
            System.out.println("2. Register as Patient");
            System.out.println("3. Login as Doctor");
            System.out.println("4. Login as Patient");
            System.out.println("5. Exit");
            System.out.println("Enter option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Name: ");
                    String dname = sc.nextLine();
                    System.out.println("Email: ");
                    String demail = sc.nextLine();
                    System.out.println("Password: ");
                    String dpass = sc.nextLine();
                    System.out.println("Specialization: ");
                    String spec = sc.nextLine();
                    system.registerDoctor(dname,demail,dpass,spec);
                    break;
                case 2:
                    System.out.println("Name: ");
                    String pname = sc.nextLine();
                    System.out.println("Email: ");
                    String pemail = sc.nextLine();
                    System.out.println("Password: ");
                    String ppass = sc.nextLine();
                    system.registerPatient(pname,pemail,ppass);
                    break;
                case 3:
                    System.out.println("Email: ");
                    String loginDemail = sc.nextLine();
                    System.out.println("Password: ");
                    String loginDpass = sc.nextLine();
                    Doctor doc = system.loginDoctor(loginDemail, loginDpass);
                    break;
                case 4:
                    System.out.println("Email: ");
                    String loginPemail = sc.nextLine();
                    System.out.println("Password: ");
                    String loginPpass = sc.nextLine();
                    Patient pat = system.loginPatient(loginPemail, loginPpass);
                    if (pat != null){
                        patientMenu(system, pat, sc);
                    }
                    break;
                case 5:
                    System.out.println();
                    System.exit(0);


            }
        }
    }
  private static void patientMenu(TelemedicineSystem system, Patient pat, Scanner sc){
        while (true){
            System.out.println("\n Patient Menu:");
            System.out.println("1.Book Appointment");
            System.out.println("2.View All Appointment");
            System.out.println("3.Logout");
            System.out.println("Choose: ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    system.listDoctors();
                    System.out.println("Enter Doctor ID:");
                    int docId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter date & time (e.g. 2025-04-06 10AM): ");
                    String dt = sc.nextLine();
                    system.bookAppointment(pat,docId,dt);
                    break;
                case 2:
                    system.viewAppointments();
                    break;
                case 3:
                    return;
            }
        }
  }
}
