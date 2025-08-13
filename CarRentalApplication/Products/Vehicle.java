package CarRentalApplication.Products;

import java.util.Date;

public class Vehicle {
    int vehicleID;
    int vehicleNumber;
    VehicleType vehicleType;
    String companyName;
    String modelName;
    int kmDriven;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;

    Vehicle(int vehicleID, int vehicleNumber, VehicleType vehicleType, String companyName){
        this.vehicleID = vehicleID;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.companyName = companyName;
        status = Status.ACTIVE;

    }

    //getters and setters

    public void setVehicleID(int vehicleID){
        this.vehicleID = vehicleID;
    }
    public int getVehicleID(){
        return vehicleID;
    }
    public void setVehicleNumber(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public int getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setModelName( String modelName){
        this.modelName = modelName;
    }
    public String getModelName(){
        return modelName;
    }
    public void setKmDriven(int kmDriven){
        this.kmDriven = kmDriven;
    }
    public int getKmDriven(){
        return kmDriven;
    }
    public void setDailyRentalCost(int dailyRentalCost){
        this.dailyRentalCost = dailyRentalCost;
    }
    public int getDailyRentalCost(){
        return dailyRentalCost;
    }
    public void setHourlyRentalCost(int hourlyRentalCost){
        this.hourlyRentalCost = hourlyRentalCost;
    }
    public int getHourlyRentalCost(){
        return hourlyRentalCost;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return status;
    }
}
