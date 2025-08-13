package CarRentalApplication.Service;

public class Location {
    String address;
    int pincode;
    String city;
    String state;
    String country;

    public Location(int pincode, String city, String state, String country){
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setpincode(int pincode){
        this.pincode = pincode;
    }
    public int getpincode(){
        return pincode;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
