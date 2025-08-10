package CabBooking.Model;

// OCP: Can add more pricing strategies without modifying existing code
public class FareCalculator {
    private static final double BASE_RATE_PER_KM = 10.0;

    public double calculateFare(double distanceKm) {
        return distanceKm * BASE_RATE_PER_KM;
    }
}
