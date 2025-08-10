package CabBooking.Model;

// SRP: Represents a Driver entity only
public class Driver {
    private String id;
    private String name;
    private String vehicleNumber;

    public Driver(String id, String name, String vehicleNumber) {
        this.id = id;
        this.name = name;
        this.vehicleNumber = vehicleNumber;
    }

    public String getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    public String getVehicleNumber() { 
        return vehicleNumber; 
    }
}
