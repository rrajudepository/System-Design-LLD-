package CabBooking.Repository;

import CabBooking.Model.Trip;
import java.util.ArrayList;
import java.util.List;

// SRP: Handles Trip data storage
public class TripRepository {
    private List<Trip> trips = new ArrayList<>();

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> getAllTrips() {
        return trips;
    }
}
