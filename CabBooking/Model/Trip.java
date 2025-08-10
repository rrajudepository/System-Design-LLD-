package CabBooking.Model;

// SRP: Represents trip details
public class Trip {
    private String id;
    private Rider rider;
    private Driver driver;
    private Location pickupLocation;
    private Location dropLocation;
    private double fare;

    public Trip(String id, Rider rider, Driver driver, Location pickup, Location drop, double fare) {
        this.id = id;
        this.rider = rider;
        this.driver = driver;
        this.pickupLocation = pickup;
        this.dropLocation = drop;
        this.fare = fare;
    }

    public String getId() { return id; }
    public Rider getRider() { return rider; }
    public Driver getDriver() { return driver; }
    public Location getPickupLocation() { return pickupLocation; }
    public Location getDropLocation() { return dropLocation; }
    public double getFare() { return fare; }
}
