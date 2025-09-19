package LLDApplication.RideSharingApplication.Model;

public class RideDetails {
    private boolean rideRequest;
    private RideAmount rideAmount;
    private PaymentStatus paymentStatus;
    private int noOfSeats;
    
    public RideDetails() {
    }

    public RideDetails(boolean rideRequest) {
        this.rideRequest = rideRequest;
        this.paymentStatus = PaymentStatus.PAID;
    }

    public boolean isRideRequest() {
        return rideRequest;
    }

    public void setRideRequest(boolean rideRequest) {
        this.rideRequest = rideRequest;
    }

    public RideAmount getRideAmount() {
        return rideAmount;
    }

    public void setRideAmount(RideAmount rideAmount) {
        this.rideAmount = rideAmount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
