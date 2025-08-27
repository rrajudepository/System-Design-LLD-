package BookMyShows.Product;

public class Seat {
    /** Numeric identifier of the seat on the screen. */
    int seatId;
    /** Row number/index this seat belongs to. */
    int row;
    /** Category of the seat (Silver/Gold/Platinum). */
    SeatCategory seatCategory;
    
    // Getter and Setter methods
    /** Returns the seat id. */
    public int getSeatId() {
        return seatId;
    }
    
    /** Sets the seat id. */
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    
    /** Returns the row number. */
    public int getRow() {
        return row;
    }
    
    /** Sets the row number. */
    public void setRow(int row) {
        this.row = row;
    }
    
    /** Returns the seat category. */
    public SeatCategory getSeatCategory() {
        return seatCategory;
    }
    
    /** Sets the seat category. */
    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
