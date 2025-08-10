package CabBooking.Service;

import CabBooking.Model.*;
import CabBooking.Repository.*;

import java.util.UUID;

// SRP: Handles trip booking logic
public class TripService {
    private DriverRepository driverRepository;
    private RiderRepository riderRepository;
    private TripRepository tripRepository;
    private FareCalculator fareCalculator;

    public TripService(DriverRepository driverRepo, RiderRepository riderRepo, TripRepository tripRepo, FareCalculator fareCalculator) {
        this.driverRepository = driverRepo;
        this.riderRepository = riderRepo;
        this.tripRepository = tripRepo;
        this.fareCalculator = fareCalculator;
    }

    public Trip bookTrip(String riderId, String driverId, Location pickup, Location drop, double distanceKm) {
        Rider rider = riderRepository.getRider(riderId);
        Driver driver = driverRepository.getDriver(driverId);

        if (rider == null || driver == null) {
            throw new RuntimeException("Rider or Driver not found!");
        }

        double fare = fareCalculator.calculateFare(distanceKm);
        Trip trip = new Trip(UUID.randomUUID().toString(), rider, driver, pickup, drop, fare);
        tripRepository.addTrip(trip);

        return trip;
    }
}
