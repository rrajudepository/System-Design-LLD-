package LLDApplication.RideSharingApplication;


import LLDApplication.RideSharingApplication.Model.*;
import LLDApplication.RideSharingApplication.Service.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Ride Sharing Application");
        RideApplication rideApplication;
        Rider riderA = new Rider(123, "Shubham");
        Rider riderB = new Rider(124,"Ram");
        Driver driverA = new Driver(1, "Suresh", Sex.MALE, 50, 60);
        Driver driverB = new Driver(2, "Rakesh", Sex.MALE, 20, 50);
        RiderManager riderManager = new RiderManager();
        
        {
            riderManager.addRiders(123, riderA);
            riderManager.addRiders(124, riderB);
        }
    
        DriverManager driverManager = new DriverManager();
        
        {
            driverManager.addDrivers(1, driverA);
            driverManager.addDrivers(2, driverB);
        }
    
        {
            rideApplication = new RideApplication(riderManager, driverManager);
        }

        System.out.println("\n");
        rideApplication.createRide(123, 50, 60, 4);
        System.out.println("\n");
        rideApplication.createRide(123, 50, 60, 2);
        System.out.println("\n");
        rideApplication.createRide(123, 20, 50, 3);
        System.out.println("\n");
        rideApplication.createRide(123, 20, 50, 4);
        System.out.println("\n");
        rideApplication.createRide(123, 20, 50, 2);

        
    }
    
}
