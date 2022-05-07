package flightmanage12;

public abstract class Ticket {
    private int pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;

    //Aggregation relationship between Flight and Ticket classes
    private Flight flight;
    private String seatNo;
    //Aggregation relationship between Passenger and Ticket classes
    private Passenger passenger;
    private boolean cancelled;

    public String checkStatus() {
        if (cancelled == true) {
            return "Cancelled";
        }
        return "Confirmed";
    }

    public String checkDuration() {
        String str1[] = departureDateTime.split(",");
        int time1 = Integer.parseInt(str1[1]);
        String str2[] = arrivalDateTime.split(",");
        int time2 = Integer.parseInt(str2[1]);
        int time = time2 - time1;
        return Integer.toString(time);
    }

    public void cancelTicket() {
        this.cancelled = true;
    }

    //Parametrised Constructor
    public Ticket(int pnr, String from, String to, String departureDateTime, String arrivalDateTime, Flight flight, String SeatNo, Passenger passenger, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.flight = flight;
        this.seatNo = seatNo;
        this.passenger = passenger;
        this.cancelled = cancelled;


//Getter and Setters for accessing all private attributes

    }

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}

