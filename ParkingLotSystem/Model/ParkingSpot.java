package ParkingLotSystem.Model;

public class ParkingSpot {
    SpotId spotId;
    VehicleType vehicletype;
    ParkingRate parkingRate;
    boolean availability;
    public ParkingSpot(SpotId spotId, VehicleType vehicletype, ParkingRate parkingRate, boolean availability){
        this.spotId=spotId;
        this.vehicletype=vehicletype;
        this.parkingRate=parkingRate;
        this.availability=availability;
    }
    public void setSpotId(SpotId spotId){
        this.spotId=spotId;
    }
    public SpotId getSpotId(){
        return this.spotId;
    }
    public void setVehicletype(VehicleType vehicletype){
        this.vehicletype=vehicletype;
    }
    public VehicleType getVehicletype(){
        return this.vehicletype;
    }
    public void setParkingRate(ParkingRate parkingRate){
        this.parkingRate=parkingRate;
    }
    public ParkingRate getParkingRate(){
        return this.parkingRate;
    }
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    public boolean getAvailability(){
        return this.availability;
    }
    
}
