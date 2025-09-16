package ParkingLotSystem.Model;

public class Vehicle {
    private String vehicleName;
    private VehicleType vehicleType;
    private String vehicleNumber;

    
    public Vehicle(String vehicleName, VehicleType vehicleType, String vehicleNumber){
        this.vehicleName = vehicleName;
        this.vehicleType=vehicleType;
        this.vehicleNumber=vehicleNumber;
    } 
    public void setVehicleName(String vehicleName){
        this.vehicleName = vehicleName;
    }
    public String getVehicleName(){
        return this.vehicleName;
    }
    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType=vehicleType;
    }
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public String getVehicleNumber(){
        return this.vehicleNumber;
    }
    
}
