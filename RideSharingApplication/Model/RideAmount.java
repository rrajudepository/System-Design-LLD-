package LLDApplication.RideSharingApplication.Model;

public class RideAmount {
    private int chargedPerKm;
    private double totalAmount;
    private Scaling scaling;
    
    public RideAmount() {
    }

    public RideAmount(int chargedPerKm, Scaling scaling) {
        this.chargedPerKm = chargedPerKm;
        this.totalAmount = 0.0;
        this.scaling = scaling;
    }

    public int getChargedPerKm() {
        return chargedPerKm;
    }

    public void setChargedPerKm(int chargedPerKm) {
        this.chargedPerKm = chargedPerKm;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Scaling getScaling() {
        return scaling;
    }

    public void setScaling(Scaling scaling) {
        this.scaling = scaling;
    }
}
