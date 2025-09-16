package ParkingLotSystem.Service;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import ParkingLotSystem.Model.ParkingTicket;
import ParkingLotSystem.Model.ParkingLevel;
import ParkingLotSystem.Model.ParkingSpot;
import ParkingLotSystem.Model.Vehicle;
import ParkingLotSystem.Model.SpotId;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class ParkingLotService {
    private Queue<ParkingTicket> parkingTickets;
    private List<ParkingLevel> parkingLevels;
    private Map<ParkingSpot, ParkingTicket> PSvsPT;
    
    public ParkingLotService(){
        this.parkingTickets = new LinkedList<>();
        this.parkingLevels = new ArrayList<>();
        this.PSvsPT = new HashMap<>();
    }

    public void setParkingTickets(Queue<ParkingTicket> parkingTickets){
        this.parkingTickets = parkingTickets;
    }
    public Queue<ParkingTicket> getParkingTickets(){
        return this.parkingTickets;
    }
    public void setParkingLevels(List<ParkingLevel> parkingLevels){
        this.parkingLevels = parkingLevels;
    }
    public List<ParkingLevel> getParkingLevels(){
        return this.parkingLevels;
    }
    public void setPSvsPT(Map<ParkingSpot, ParkingTicket> PSvsPT){
        this.PSvsPT = PSvsPT;
    }
    public Map<ParkingSpot, ParkingTicket> getPSvsPT(){
        return this.PSvsPT;
    }
    public void setParkingLevel(ParkingLevel parkingLevel){
        parkingLevels.add(parkingLevel);
    }
    public boolean addVehicleToSpot(Vehicle vehicle, int id){
        System.out.println("Welcome to the Parking Spot:\n");
         for(ParkingLevel parkingLevel : parkingLevels){
            for(ParkingSpot parkingSpot : parkingLevel.getParkingSpots()){
                if(parkingSpot.getVehicletype()==vehicle.getVehicleType() && parkingSpot.getAvailability()){
                    ParkingTicket parkingTicket = new ParkingTicket();
                    parkingTicket.setParkingId(id);
                    parkingTicket.setVehicle(vehicle);
                    parkingTicket.setInTime(new Date());
                    parkingTicket.setSpotId(new SpotId(id));
                    PSvsPT.put(parkingSpot, parkingTicket);
                    parkingSpot.setAvailability(false);
                    parkingSpot.setSpotId(new SpotId(id));
                    System.out.println(vehicle.getVehicleName()+"with vehicle number "+ vehicle.getVehicleNumber()+" is added to the spot with SpotId: "+ id+"\n\n");
                    parkingTickets.add(parkingTicket);
                    return true;

                } 
            }
         }
         return false;
    }
    
    public void removeVehicleFromSpot(Vehicle vehicle, int id){
        System.out.println("We are removing the vehicle "+vehicle.getVehicleName()+" from vehicle spot ");
        for(ParkingLevel parkingLevel : parkingLevels){
            for(ParkingSpot parkingSpot : parkingLevel.getParkingSpots()){
                if(parkingSpot.getSpotId().getId() == id){
                    ParkingTicket parkingTicket = PSvsPT.get(parkingSpot);
                if (parkingTicket == null) {
                    System.out.println("No parking ticket found for this vehicle/spot. Removal failed.");
                    return;
                }

                parkingTicket.setOutTime(new Date());

                long durationInMillis = parkingTicket.getOutTime().getTime() - parkingTicket.getInTime().getTime();
                long durationInHours = TimeUnit.MILLISECONDS.toHours(durationInMillis);

                if (durationInHours == 0) {
                    durationInHours = 1;
                }

                double parkingCost = parkingSpot.getParkingRate().getCharge() * durationInHours;
                System.out.println(vehicle.getVehicleType()+" with vehicle Number "+vehicle.getVehicleNumber()+" removed from the spot.");
                PSvsPT.remove(parkingSpot);
                parkingTickets.remove(parkingTicket);
                System.out.println("Total cost of the parking is "+ parkingCost);
                System.out.println("\n\n");
                return;
                }
            }
        }
        //return 0;
    }

}
