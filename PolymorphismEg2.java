
class AppointmentScheduler{
    public void bookAppointment(String spec,String timeslot, int age, boolean sosPriority){
        System.out.println("Doctor Specialization: " + spec);
        System.out.println("Appointment Time Slot: " + timeslot );
        System.out.println("Patient Age: " + age);
        System.out.println("Emergency Priority: " + sosPriority);
    }
}

public class PolymorphismEg2 {
    public static void main(String[] args) {
        AppointmentScheduler as= new AppointmentScheduler();
        as.bookAppointment("Dentist","12-11-2025", 22, true);
    }
}
