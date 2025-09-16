package ParkingLotSystem.Model;

//import java.time.LocalTime;
import java.util.Date;

public class ParkingTicket {
    int parkingId;
    Vehicle vehicle;
    SpotId spotId;
    Date inTime;
    Date outTime;
    
    public ParkingTicket(){
    }
    
    public ParkingTicket(int parkingId, Vehicle vehicle, SpotId spotId,  Date inTime){
        this.parkingId=parkingId;
        this.vehicle=vehicle;
        this.spotId= spotId;
        this.inTime=inTime;
    }
    public void setParkingId(int parkingId){
        this.parkingId=parkingId;
    }
    public int getParkingId(){
        return this.parkingId;
    }
    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public Vehicle getVehicle(){
        return this.vehicle;
    }
    public void setSpotId(SpotId spotId){
        this.spotId = spotId;
    }
    public SpotId getSpotId(){
        return this.spotId;
    }
    public void setInTime(Date inTime){
        this.inTime=inTime;
    }
    public Date getInTime(){
        return this.inTime;
    }
    public void setOutTime(Date outTime){
        this.outTime=outTime;
    }
    public Date getOutTime(){
        return this.outTime;
    }


}
