package LLDApplication.RideSharingApplication.Model;

public class Driver {
    private int driverId;
    private String name;
    private Sex sex;
    private int origin;
    private int destination;
    private boolean available;
    
    public Driver() {
    }

    public Driver(int driverId, String name, Sex sex, int origin, int destination) {
        this.driverId = driverId;
        this.name = name;
        this.sex = sex;
        this.origin = origin;
        this.destination = destination;
        this.available = true;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
