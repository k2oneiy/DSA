package BusProject;
import java.text.ParseException;
import java.util.*;

public class BusDemo {
    public static void main(String[] args) throws ParseException {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,20));
        buses.add(new Bus(3,false,10));


        for (Bus b:buses){
            b.displayBusInfo();
        }


        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while (userOpt==1){
            System.out.println("Enter 1 to Book or 2 to Exit");
            userOpt = scanner.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed! ");
                }
                else {
                    System.out.println("Sorry Bus is Full. Try another book on this day.");
                }
            }
        }

    }
}
