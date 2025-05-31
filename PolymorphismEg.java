
class FlightBooking{
    public void bookTickets(String des, int d, int m, int y, int pscount){
        System.out.println("The Destination is: " + des);
        System.out.println("The Journey Date: " + d + "-" + m + "-" + y);
        System.out.println("The Passenger Count: " + pscount);
        System.out.println("The Ticket Price: " + 15000*pscount);
    }
}

public class PolymorphismEg {
    public static void main(String[] args) {
        FlightBooking fb= new FlightBooking();
        fb.bookTickets("Dubai", 12,11,2025, 2);
    }    
}
