package CabBookingMC.RideDetails;
import java.util.HashMap;
import java.util.Map;
public class RideDetails {
    HashMap<String, User> riders = new HashMap<>();
    UberCab cab;
    
    
    public RideDetails(UberCab cab){
           this.cab = cab;
    }
    
    public void addRiders(String id ,String name, int age, int x, int y, char sex){
        riders.put(id, new User( name, age, x, y, sex));
    }
    
    public void riderDetails(){
            System.out.println("Rider details are given below : ");
            int i=1;
            for( Map.Entry<String, User> val : riders.entrySet()){
              System.out.println("(" +i+ ")" + "User Id : "+ val.getKey());
              val.getValue().getInfo();
              i++;
            }
        
        
            System.out.println("________________________________________________");
        }
       
    //Finding available ride for registered users    
    public void findRide(String id, int srcX, int srcY, int destX, int destY){
        User user = riders.get(id);
        
        //checking for valid users 
        if(user==null){
            System.out.println("User is not registered. Kindly register first");
            System.out.println("____________________________________");
            return;
        }else{
            System.out.println("User details is given below : ");
            user.getInfo();
        }
        
        //checking for available rides nearby (upto 5 unit distance)
        Driver nearbyDriver= cab.getAvailability(srcX, srcY, 5);
        if(nearbyDriver==null){
            System.out.println("No driver found");
            System.out.println("______________________________________");
            return;
        }
        if(nearbyDriver!=null){
            System.out.println("Driver found. Details are given below : ");
            nearbyDriver.getInfo();
            System.out.println("Ride starts .....Enjoy your ride :) ");
        }
        
        //Fare calucaltion 
        int dist = Math.abs(destX-srcX)+Math.abs(destY-srcY);
        int fare = dist*10;
        
        
        //upadating the earning details of dirvers 
        nearbyDriver.updateEarning(fare);
        System.out.println("Total earning by all Drivers after this ride : ");
        cab.getEarningDetails();
        
        
        //updating the location of driver 
        nearbyDriver.updateLocation(destX, destY);
        
        //updating the location of user 
        user.updateLocation(destX, destY);
        
        
    }
}
