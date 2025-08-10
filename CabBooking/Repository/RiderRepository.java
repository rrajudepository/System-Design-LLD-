package CabBooking.Repository;

import CabBooking.Model.Rider;
import java.util.HashMap;
import java.util.Map;

// SRP: Handles Rider data storage
public class RiderRepository {
    private Map<String, Rider> riders = new HashMap<>();

    public void addRider(Rider rider) {
        riders.put(rider.getId(), rider);
    }

    public Rider getRider(String id) {
        return riders.get(id);
    }
}
