package BookMyShows.Model;
import BookMyShows.Product.Shows;
import BookMyShows.Product.Seat;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    /** Selected show for this booking. */
    Shows show;
    /** Seats reserved in this booking. */
    List<Seat> seat = new ArrayList<>();
    /** Payment details associated with this booking. */
    Payment payment;
    
    // Getter and Setter methods
    /** Returns the show. */
    public Shows getShow() {
        return show;
    }
    
    /** Sets the show. */
    public void setShow(Shows show) {
        this.show = show;
    }
    
    /** Returns the booked seats. */
    public List<Seat> getSeat() {
        return seat;
    }
    
    /** Sets the booked seats. */
    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }
    /** Sets the payment. */
    public void setPayment(Payment payment){
        this.payment = payment;
    }

    /** Returns the payment. */
    public Payment getPayment(){
        return this.payment;
    }
}
