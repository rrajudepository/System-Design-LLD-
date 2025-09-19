package LLDApplication.RideSharingApplication.Service;
import java.util.Map;

import LLDApplication.RideSharingApplication.Model.*;

public class RideApplication {
    private RiderManager riderManager;
    private DriverManager driverManager;

    public RideApplication(RiderManager riderManager, DriverManager driverManager){
        this.riderManager = riderManager;
        this.driverManager = driverManager;
    }
 
    //methods

    public void createRide(int id, int origin, int destination, int noOfSeats){
        boolean driverAvailability=false;
        Driver driver = null;
        for(Map.Entry<Integer, Driver> entry : driverManager.getAllDrivers().entrySet()){
            driver= entry.getValue();
           if(driver.getDestination()==destination && driver.getOrigin()==origin && driver.isAvailable()){
            driver.setAvailable(false);
            driverAvailability=true;
            break;
           }
        }
        if(!driverAvailability){
            System.out.println("No Driver is available");
            return;
        }
        System.out.println("Number of seats booked are "+noOfSeats);
        Rider rider = riderManager.getRider(id);
        rider.setOrigin(origin);
        rider.setDestination(destination);
        rider.setNoOfRides(rider.getNoOfRides()+1);
        RideAmount rideAmount = new RideAmount();
        rideAmount.setChargedPerKm(20);
        if(rider.getNoOfRides()>4){
            System.out.println("You are now preffered rider");
            System.out.println("You have to pay half amount and your scaling is 0.5");
            rider.setPreference(Preference.YES);
            rideAmount.setScaling(Scaling.ZERO_POINT_FIVE);
        }else{
            rider.setPreference(Preference.NO);
            if(noOfSeats>2){
                System.out.println("Your scaling to this ride is 0.7");
                rideAmount.setScaling(Scaling.ZERO_POINT_SEVEN);
            }else{
                System.out.println("You have to pay full amount and you are getting scaling 1");
                rideAmount.setScaling(Scaling.ONE);
            }
        }
        double totalAmount = (int)((rider.getDestination()-rider.getOrigin())*rideAmount.getChargedPerKm()*rideAmount.getScaling().factor); 
        rideAmount.setTotalAmount(totalAmount);


        RideDetails rideDetails = new RideDetails();
        rideDetails.setRideAmount(rideAmount);
        rideDetails.setRideRequest(true);
        rideDetails.setPaymentStatus(PaymentStatus.PENDING);
        System.out.println("Total amount of this ride is "+ totalAmount);
        rideDetails.setPaymentStatus(PaymentStatus.PAID);
        rider.setRideDetails(rideDetails);
        System.out.println("Enjoy your ride");
        System.out.println("Pay your ride amount " + totalAmount);
        rideDetails.setPaymentStatus(PaymentStatus.PAID);
        driver.setAvailable(true);
    }
 


    public void updateRide(int id, int origin, int destination, int noOfSeats){
        Rider rider = riderManager.getRider(id);
        rider.setRiderId(id);
        rider.setOrigin(origin);
        rider.setDestination(destination);
        RideDetails rideDetails = rider.getRideDetails();
        rideDetails.setNoOfSeats(noOfSeats);
        rider.setRideDetails(rideDetails);

    }

    public void withdrawRide(int id){
       Rider rider = riderManager.getRider(id);
       RideDetails rideDetails = rider.getRideDetails();
       rideDetails.setRideRequest(false);

    }

    public void closeRide(int id){
      
    }
    
}
