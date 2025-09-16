package ParkingLotSystem.Model;

public class ParkingRate {
    VehicleType vehicleType;
    double charge; //perhour

    public ParkingRate(VehicleType vehicleType, int charge){
        this.vehicleType=vehicleType;
        this.charge=charge;
    }
    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType=vehicleType;
    }
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
    public void setCharge(int charge){
        this.charge=charge;
    }
    public double getCharge(){
        return this.charge;
    }
    
}
