package CabBookingMC.MainFunction;
//import CabBookingMC.RideDetails.UberCab;
//import CabBookingMC.RideDetails.RideDetails;
import CabBookingMC.RideDetails.*;
public class MainFunction {
    public static void main (String[] args) throws java.lang.Exception
    {
        
        UberCab Cabs = new UberCab();
        RideDetails ride = new RideDetails(Cabs);  // Pass cab system to ride
        
        //Rider Details : 
        ride.addRiders("Abhi@123","Abhishek", 23, 0, 0 , 'M');
        ride.addRiders("Rahul@xyz","Rahul", 29, 10,0, 'M');
        ride.addRiders("Nan@987","Nandini", 22, 15, 6, 'F');
       // ride.riderDetails();
        
        
    
        
        //Driver registration : 
        Cabs.addCabDirver("Driver1", 22, 'M', "KA-01-12345",10,1,"Swift");
        Cabs.addCabDirver("Driver2", 29, 'M', "KA-02-12345",11,10,"Swift");
        Cabs.addCabDirver("Driver3", 24, 'F', "KA-03-12345",5,3,"Skoda");
        //Cabs.DriverDetails();
        //Cabs.getEarningDetails();
        
        
        //finding ride for users 
        ride.findRide("Rahul@xyz", 10,0,15,3);
        //System.out.println("Updated Location of drivers are : ");
       // Cabs.DriverDetails();
        
        
        ride.findRide("Nan@987", 0,0,10,2); //no driver for pickup in 5 unit dist 
        //System.out.println("Updated Location of drivers are : ");
        //Cabs.DriverDetails();
        
        ride.findRide("Abhi@987", 0,0,10,2); //User not registered 
        
        
        ride.findRide("Nan@987", 5,0,10,2);
        System.out.println("Updated Location of drivers are : ");
        Cabs.DriverDetails();
        ride.riderDetails();

    }
}
