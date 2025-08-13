package CarRentalApplication.Service;
import java.util.List;
import java.util.ArrayList;
import CarRentalApplication.Products.*;
public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();
    

    public void setStoreId(int storeId){
        this.storeId = storeId;
    }
    public int getStoreId(){
        return storeId;
    }
    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryManagement.getVehicles();
    }

    //add vehicles, update vehicles, use inventory management to update this

    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID){
        for(Reservation reservation : reservations){
            if(reservation.getReservationId()== reservationID){
                return true;
            }
        }
        return false;
    }

    //more mehtod to update reservation.
}
