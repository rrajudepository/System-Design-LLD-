package BookMyShows.Product;
import BookMyShows.Service.Screen;
import java.util.ArrayList;
import java.util.List;
public class Shows {
    /** Unique identifier for the show. */
    int showId;
    /** Movie played in this show. */
    Movie movieDetail;
    /** Screen where the show runs. */
    Screen screenInfo;
    /** Start time of the show in HH:mm. */
    String startTime;
    /** Booked seat ids for this show. */
    List<Integer> bookedSeatIds = new ArrayList<>();
    
    // Getter and Setter methods
    /** Returns the show id. */
    public int getShowId() {
        return showId;
    }
    
    /** Sets the show id. */
    public void setShowId(int showId) {
        this.showId = showId;
    }
    
    /** Returns the movie details. */
    public Movie getMovieDetail() {
        return movieDetail;
    }
    
    /** Sets the movie details. */
    public void setMovieDetail(Movie movieDetail) {
        this.movieDetail = movieDetail;
    }
    
    /** Returns the screen information. */
    public Screen getScreenInfo() {
        return screenInfo;
    }
    
    /** Sets the screen information. */
    public void setScreenInfo(Screen screenInfo) {
        this.screenInfo = screenInfo;
    }
    
    /** Returns the show start time (HH:mm). */
    public String getStartTime() {
        return startTime;
    }
    
    /** Sets the show start time (HH:mm). */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    /** Returns the list of booked seat IDs. */
    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }
    
    /** Sets the list of booked seat IDs. */
    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }
}
