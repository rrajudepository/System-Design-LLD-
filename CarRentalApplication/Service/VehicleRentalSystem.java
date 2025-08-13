package CarRentalApplication.Service;
import java.util.List;
public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList){
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location){
        //based on the location, we will filterout the store location from storeList
        return storeList.get(0);
    }

    //Add Users

    //remove Users
    //add stores
    //remove stores
}
