package flightmanage12;

public class Contact {
    String name;
    String phone;
    String email;
    String getPassContactDetails() {
        return name + ", " + phone + ", " + email;
    }

    //Parametrised constructor for object creation
    Contact(String name,String phone,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
}
