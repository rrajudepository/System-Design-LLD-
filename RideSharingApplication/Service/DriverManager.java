package LLDApplication.RideSharingApplication.Service;
import LLDApplication.RideSharingApplication.Model.Driver;

import java.util.HashMap;
import java.util.Map;
public class DriverManager {
    private Map<Integer, Driver> drivers;

    public DriverManager(){
        drivers = new HashMap<>();
    }

    //methods
    public void addDrivers(int id, Driver driver){
        drivers.put(id, driver);
    }

    public void removeDriver(int id){
        drivers.remove(id);
    }

    public Map<Integer, Driver> getAllDrivers(){
        return drivers;
    }
}
