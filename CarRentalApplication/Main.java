package CarRentalApplication;
import java.util.ArrayList;
import java.util.List;

import CarRentalApplication.Service.*;
import CarRentalApplication.Products.*;
import CarRentalApplication.Model.*;
public class Main {
    public static void main(String args[]){
        List<User> users = addUsers();
        List<Vehicle> vehicles= addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        //1st User comes
        User user = users.get(0);

        //User search based in the location 
        
        Location location = new Location(403012, "Banglore", "Karnataka","India");
        Store store = rentalSystem.getStore(location);

        //get all vehicles you are interested in based upon different filters
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //Reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));
    
        //Generate the Bill
        Bill bill = new Bill(reservation);

        //Make Payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //Trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.getReservationId());

        System.out.println("\nRide is completed and fare is calculated and finally paid.\n");


    }
    
    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User(12345, "Rajkishor", "Certified Driver");
        users.add(user1);

        return users;
    }

    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car(12345, 5643, VehicleType.CAR, "Tototo");
        vehicles.add(vehicle1);
        Vehicle vehicle2 = new Car(12346, 5644, VehicleType.CAR, "Maruti");
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.setStoreId(9876);
        store1.setVehicles(vehicles);

        stores.add(store1);

        return stores;
    }
}
