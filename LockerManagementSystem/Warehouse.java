package LLDApplication.LockerManagementSystem;
import java.util.Map;
import java.util.HashMap;

public class Warehouse {
    private Map<String, Locker> lockers;
    
    public Warehouse(){
        lockers = new HashMap<>();
    }

    public void addLocker(String lockerId, Size size){
        Locker locker = new Locker(lockerId, size);
        lockers.put(lockerId, locker);
        System.out.println("Locker with lockerId "+lockerId+" is added to Locker Management System\n");

    }
    public boolean findLocker(Size size){
       for(Map.Entry<String, Locker> entry : lockers.entrySet()){
        Locker locker = entry.getValue();
        if(locker.getSize()==size){
            return true;
        }
       }
       System.out.println("Locker with size "+size+" is not available\n");
        return false;
    }

    public void strorePackage(String lockerID){
        for(Map.Entry<String, Locker> entry : lockers.entrySet()){
            Locker locker = entry.getValue();
            if(locker.getLockerId()==lockerID){
                locker.setOccupied(false);
                System.out.println("LockerID "+ lockerID+" is stored with package\n");
            }
        }

    }

    public void RemovePackage(String lockerId){
        if(lockers.containsKey(lockerId)){
            Locker locker = lockers.get(lockerId);
            locker.setOccupied(false);
            System.out.println("Locker with lockerId "+lockerId+" is free\n");
        }else{
            System.out.println("Locker with "+ lockerId +" is not available\n");
        }
    }
}
