package ParkingLotSystem.Model;
import java.util.List;

public class ParkingLevel {
    int floor;
    List<ParkingSpot> parkingSpots;
    public ParkingLevel(){
        
    }
    public ParkingLevel(int floor, List<ParkingSpot> parkingSpots){
        this.floor=floor;
        this.parkingSpots=parkingSpots;
    }
    public void setFloor(int floor){
        this.floor=floor;
    }
    public int getFloor(){
        return this.floor;
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots){
        this.parkingSpots=parkingSpots;
    }
    public List<ParkingSpot> getParkingSpots(){
        return this.parkingSpots;
    }
    public void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.add(parkingSpot);
    }
    public boolean removeParkingSpot(ParkingSpot parkingSpot){
        return this.parkingSpots.remove(parkingSpot);
    }
    public void addParkingSpots(List<ParkingSpot> parkingSpots){
        this.parkingSpots.addAll(parkingSpots);
    }
    public void removeParkingSpots(List<ParkingSpot> parkingSpots){
        this.parkingSpots.removeAll(parkingSpots);
    }

}
