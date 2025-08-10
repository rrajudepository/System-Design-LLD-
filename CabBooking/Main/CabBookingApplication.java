package CabBooking.Main;

import CabBooking.Model.*;
import CabBooking.Repository.*;
import CabBooking.Service.*;
import CabBooking.Util.DistanceCalculator;

public class CabBookingApplication {
    public static void main(String[] args) {
        // Create repositories
        DriverRepository driverRepo = new DriverRepository();
        RiderRepository riderRepo = new RiderRepository();
        TripRepository tripRepo = new TripRepository();

        // Create services
        DriverService driverService = new DriverService(driverRepo);
        RiderService riderService = new RiderService(riderRepo);
        FareCalculator fareCalculator = new FareCalculator();
        TripService tripService = new TripService(driverRepo, riderRepo, tripRepo, fareCalculator);

        // Register driver and rider
        driverService.registerDriver("D1", "John", "KA01AB1234");
        riderService.registerRider("R1", "Alice");

        // Create locations
        Location pickup = new Location(12.9716, 77.5946);
        Location drop = new Location(13.0358, 77.5970);

        // Calculate distance
        double distance = DistanceCalculator.calculateDistance(
                pickup.getLatitude(), pickup.getLongitude(),
                drop.getLatitude(), drop.getLongitude()
        );

        // Book trip
        Trip trip = tripService.bookTrip("R1", "D1", pickup, drop, distance);

        // Print trip details
        System.out.println("Trip booked successfully!");
        System.out.println("Driver: " + trip.getDriver().getName());
        System.out.println("Rider: " + trip.getRider().getName());
        System.out.println("Fare(in Rupee):  " + trip.getFare());
    }
}
