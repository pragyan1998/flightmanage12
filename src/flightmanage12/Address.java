package flightmanage12;

public class Address {
    String street;
    String city;
    String state;

    String getPassengerAddressDetails(){
        return street+ ", " +city+ ", "+state;
    }
    //Parametrized constructor for object creation
    public Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }
}
