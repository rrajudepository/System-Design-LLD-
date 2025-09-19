package LLDApplication.LockerManagementSystem;

public class Locker {
    String lockerId;
    Size size;
    boolean isOccupied;

    public Locker() {
    }

    public Locker(String lockerId, Size size) {
        this.lockerId = lockerId;
        this.size = size;
        this.isOccupied = false;
    }
    public String getLockerId() {
        return lockerId;
    }

    public void setLockerId(String lockerId) {
        this.lockerId = lockerId;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
