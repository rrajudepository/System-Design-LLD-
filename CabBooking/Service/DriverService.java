package CabBooking.Service;

import CabBooking.Model.Driver;
import CabBooking.Repository.DriverRepository;

// SRP: Handles driver-related business logic
public class DriverService {
    private DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public void registerDriver(String id, String name, String vehicleNumber) {
        Driver driver = new Driver(id, name, vehicleNumber);
        driverRepository.addDriver(driver);
    }
}
