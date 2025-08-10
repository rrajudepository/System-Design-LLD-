package CabBooking.Util;

// SRP: Calculates distance between locations
public class DistanceCalculator {
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Simplified straight-line distance formula
        double dx = lat2 - lat1;
        double dy = lon2 - lon1;
        return Math.sqrt(dx * dx + dy * dy) * 111; // Approx km conversion
    }
}
