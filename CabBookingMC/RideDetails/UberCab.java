package CabBookingMC.RideDetails;

import java.util.HashMap;
public class UberCab {
    HashMap<String, Driver> cabs =new HashMap<>();
        
    public void addCabDirver(String name,int age, char sex,  String vehicleNumber, int x, int y, String vehicleName){
            cabs.put(vehicleNumber, new Driver(name, age, sex, vehicleNumber, x, y, vehicleName));
    }
    
    public void DriverDetails(){
        System.out.println("Driver details are given below : ");
        int i=1;
        for(Driver driver : cabs.values()){
            System.out.print("(" +i+ ") ");
            driver.getInfo();
            i++;
            
        }
        System.out.println("_______________________________________");
    }
    
    public void getEarningDetails(){
         int i=1;
        for(Driver driver : cabs.values()){
            System.out.print("(" +i+ ") ");
            driver.getEarning();
            i++;
            
        }
        System.out.println("_______________________________________");
        
    }
    
    public Driver getAvailability(int srcX, int srcY, int max_dist){
        //System.out.println("Rajkishor3");
    
        
        for(Driver driver : cabs.values()){
            //driver.getInfo();
            if(driver!=null && driver.isAvailable()){
              //  driver.getInfo();
                int dist = Math.abs(driver.getlocationX()-srcX)+Math.abs(driver.getlocationY()-srcY);
                if(dist<=max_dist){
                    //System.out.println("Rajkishor2");
                    return driver;
                }
            }
        }
        return null;
    }
}
