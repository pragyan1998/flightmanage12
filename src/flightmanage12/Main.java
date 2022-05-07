package flightmanage12;

public class Main {
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {
        //Flight object Creation
        //due to aggregation relationship,Flight object formed outside Ticket class object.
        Flight flight = new Flight("4566", "Indigo", 200, 150);
        //Passenger object creation
        //Due to aggregation relationship,Passenger object formed outside Ticket class object.
        Passenger pa = new Passenger("Old Street", "Lucknow", "Uttar Pradesh", "Saurabh", "9919213239", "saurabhshukla@gmail.com");
        Passenger pb = new Passenger("New Street", "Jaipur", "Rajasthan", "Prameet", "9412328128", "prameetverma@gmail.com");
        flight.getCapacity();
        // flight.capacity;

        //RegularTicket object creation
        RegularTicket regTic = new RegularTicket(1, "Lucknow", "Kolkata", "05/05/2022", "07/05/2022", flight, "17B", pa, false, "food,water and snacks");
        //TouristTicket object creation
        TouristTicket tourTic = new TouristTicket(2, "Delhi", "Mumbai", "03/05/2022", "04/05/2022", flight, "19D", pb, false, "Hotel la paz,Mumbai");
        System.out.println(regTic.getPnr());
        System.out.println(tourTic.getPnr());
    }
}

