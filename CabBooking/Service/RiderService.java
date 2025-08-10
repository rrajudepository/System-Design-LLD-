package CabBooking.Service;

import CabBooking.Model.Rider;
import CabBooking.Repository.RiderRepository;

// SRP: Handles rider-related business logic
public class RiderService {
    private RiderRepository riderRepository;

    public RiderService(RiderRepository riderRepository) {
        this.riderRepository = riderRepository;
    }

    public void registerRider(String id, String name) {
        Rider rider = new Rider(id, name);
        riderRepository.addRider(rider);
    }
}
