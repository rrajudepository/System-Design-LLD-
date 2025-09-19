package LLDApplication.RideSharingApplication.Model;

public class Rider {
    private int riderId;
    private String name;
    private Sex sex;
    private int origin;
    private int destination;
    private int noOfRides;
    private RideDetails rideDetails;
    private Preference preference;
    
    public Rider(int riderId, String name) {
        this.riderId = riderId;
        this.name=name;
        this.noOfRides=0;
    }

    public Rider(int riderId, String name, Sex sex, int origin, int destination, RideDetails rideDetails) {
        this.riderId = riderId;
        this.name = name;
        this.sex = sex;
        this.origin = origin;
        this.destination = destination;
        this.noOfRides = 0;
        this.rideDetails = rideDetails;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getNoOfRides() {
        return noOfRides;
    }

    public void setNoOfRides(int noOfRides) {
        this.noOfRides = noOfRides;
    }

    public RideDetails getRideDetails() {
        return rideDetails;
    }

    public void setRideDetails(RideDetails rideDetails) {
        this.rideDetails = rideDetails;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}
