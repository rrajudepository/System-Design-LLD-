package ParkingLotSystem.Service;

import ParkingLotSystem.Model.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("\nWelcome to the Parking Lot System..............\n");
        System.out.println("Creating Vehicles for the Parking Lot");
        Vehicle bike1 = new Vehicle("Bike1",VehicleType.BIKE, "SUB12340");
       // Vehicle bike2 = new Vehicle(VehicleType.BIKE, "SUB12341");
        Vehicle car1 = new Vehicle("Car1",VehicleType.CAR, "SAB12350");
       // Vehicle car2 = new Vehicle(VehicleType.CAR, "SAB12351");
        Vehicle truck1 = new Vehicle("Truck1",VehicleType.TRUCK, "TAR12360");
        //Vehicle truck2 = new Vehicle(VehicleType.TRUCK, "TAR12361");

        System.out.println("vehicles are created for the Parking Lot\n");
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        System.out.println("Creating Parking Spots of different level of Parking Building.....");
        for(int i=0;i<5;i++){
            ParkingSpot parkingSpot = new ParkingSpot(new SpotId(i + 1), VehicleType.BIKE, new ParkingRate(VehicleType.BIKE, 50), true);
            parkingSpots.add(parkingSpot);
        }
        for(int i=0;i<5;i++){
            ParkingSpot parkingSpot = new ParkingSpot(new SpotId(i+1),VehicleType.CAR, new ParkingRate(VehicleType.CAR, 100), true);
            parkingSpots.add(parkingSpot);
        }
        for(int i=0;i<5;i++){
            ParkingSpot parkingSpot = new ParkingSpot(new SpotId(i+1),VehicleType.TRUCK, new ParkingRate(VehicleType.TRUCK, 150), true);
            parkingSpots.add(parkingSpot);
        }
        System.out.println("Spots created......\n");
        //creating parking level

        ParkingLevel parkingLevel = new ParkingLevel();
        parkingLevel.setFloor(0);
        parkingLevel.setParkingSpots(parkingSpots);

        //craeting Parking Lot Service
        ParkingLotService parkingLotService = new ParkingLotService();
        System.out.println("Adding parking level to the parking lot service");
        //adding the level to parking lot service 
        parkingLotService.setParkingLevel(parkingLevel);

        System.out.println("Levels added............\n");

        //adding vehicle to the parking lot
        parkingLotService.addVehicleToSpot(bike1, 1);
        parkingLotService.addVehicleToSpot(car1, 2);
        parkingLotService.addVehicleToSpot(truck1, 3);

        parkingLotService.removeVehicleFromSpot(bike1, 1);
        parkingLotService.removeVehicleFromSpot(car1, 2);
        parkingLotService.removeVehicleFromSpot(truck1, 3);






        
        


    }
}
