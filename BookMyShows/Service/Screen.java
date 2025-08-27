package BookMyShows.Service;
import java.util.ArrayList;
import java.util.List;
import BookMyShows.Product.Seat;
public class Screen {
    /** Unique identifier for the screen. */
    int screenId;
    /** Seats configured on this screen. */
    List<Seat> seat = new ArrayList<>();
    
    // Getter and Setter methods
    /** Returns the screen id. */
    public int getScreenId() {
        return screenId;
    }
    
    /** Sets the screen id. */
    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }
    
    /** Returns the list of seats on this screen. */
    public List<Seat> getSeat() {
        return seat;
    }
    
    /** Sets the list of seats on this screen. */
    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }
}
