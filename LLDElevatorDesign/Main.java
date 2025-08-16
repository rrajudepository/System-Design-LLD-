package LLDElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);
        
        // Initialize elevator system
        new ElevatorCreator();
        
        // Display building floors
        System.out.println("Building created with " + building.getAllFloorList().size() + " floors");
        System.out.println("Elevator system initialized with " + ElevatorCreator.elevatorControllerList.size() + " elevators");
        
        // Simulate elevator operations
        ExternalDispatcher externalDispatcher = new ExternalDispatcher();
        externalDispatcher.submitExternalRequest(1, Direction.UP);
        System.out.println("External request submitted for floor 1 going UP");
    }
}
