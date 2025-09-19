package LLDApplication.RideSharingApplication.Service;
import java.util.HashMap;
import java.util.Map;
import LLDApplication.RideSharingApplication.Model.Rider;
public class RiderManager {
    private Map<Integer,Rider> riders;
    public RiderManager(){
        riders = new HashMap<>();
    }

    //Methods
    public void addRiders(int id, Rider rider){
        riders.put(id, rider);
    }
    public void removeRiders(int id){
        riders.remove(id);
    }

    public Rider getRider(int id){
        return riders.get(id);
    }
    

}
