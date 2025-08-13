package CarRentalApplication.Model;

import CarRentalApplication.Service.Reservation;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;
    public Bill(Reservation reservation){
        this. reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }
    private double computeBillAmount(){

        return 1000.0;
    }
    
}
