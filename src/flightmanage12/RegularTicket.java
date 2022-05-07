package flightmanage12;

public class RegularTicket extends Ticket{
    String specialServices;
    public String getSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
}
//I will put food,water,snacks

//Parametrised Constructor for object creation
public RegularTicket(int pnr,String from,String to,String departureDateTime,String arrivalDateTime,Flight flight,String seatNo,Passenger passenger,boolean cancelled,String specialServices){
        //super keyword to pass attribute values to Ticket superclass
    super(pnr,from,to,departureDateTime,arrivalDateTime,flight,seatNo,passenger,cancelled);
    this.specialServices = specialServices;
    }
}