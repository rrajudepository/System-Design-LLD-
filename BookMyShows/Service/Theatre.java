package BookMyShows.Service;
import BookMyShows.Product.*;
import java.util.ArrayList;
import java.util.List;
public class Theatre {
    /** Unique identifier for the theatre. */
    int theatreId;
    /** Address/location of the theatre. */
    String theatreAddress;
    /** City where this theatre operates. */
    City city;
    /** Screens available in this theatre. */
    List<Screen> screenlist = new ArrayList<>();
    /** Shows scheduled in this theatre. */
    List<Shows> show = new ArrayList<>();
    
    /** Creates a Theatre with default values. */
    public Theatre() {
        this.theatreId = 0;
        this.theatreAddress = "";
        this.city = null;
        this.screenlist = new ArrayList<>();
        this.show = new ArrayList<>();
    }
    
    /** Creates a Theatre with provided id, address and city. */
    public Theatre(int theatreId, String theatreAddress, City city) {
        this.theatreId = theatreId;
        this.theatreAddress = theatreAddress;
        this.city = city;
        this.screenlist = new ArrayList<>();
        this.show = new ArrayList<>();
    }
    
    // Getter and Setter methods
    /** Returns the theatre id. */
    public int getTheatreId() {
        return theatreId;
    }
    
    /** Sets the theatre id. */
    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }
    
    /** Returns the theatre address. */
    public String getTheatreAddress() {
        return theatreAddress;
    }
    
    /** Sets the theatre address. */
    public void setTheatreAddress(String theatreAddress) {
        this.theatreAddress = theatreAddress;
    }
    
    /** Returns the theatre city. */
    public City getCity() {
        return city;
    }
    
    /** Sets the theatre city. */
    public void setCity(City city) {
        this.city = city;
    }
    
    /** Returns the list of screens. */
    public List<Screen> getScreenlist() {
        return screenlist;
    }
    
    /** Sets the list of screens. */
    public void setScreenlist(List<Screen> screenlist) {
        this.screenlist = screenlist;
    }
    
    /** Returns the list of shows. */
    public List<Shows> getShow() {
        return show;
    }
    
    /** Sets the list of shows. */
    public void setShow(List<Shows> show) {
        this.show = show;
    }
}
