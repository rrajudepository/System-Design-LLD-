package CabBooking.Repository;
import CabBooking.Model.*;
//import CabBooking.Model.Driver;
import java.util.HashMap;
import java.util.Map;

// SRP: Handles Driver data storage
public class DriverRepository {
    private Map<String, Driver> drivers = new HashMap<>();

    public void addDriver(Driver driver) {
        drivers.put(driver.getId(), driver);
    }

    public Driver getDriver(String id) {
        return drivers.get(id);
    }
}
