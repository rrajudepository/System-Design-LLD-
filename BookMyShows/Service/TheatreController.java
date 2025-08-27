package BookMyShows.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import BookMyShows.Product.City;
import BookMyShows.Product.Movie;
import BookMyShows.Product.Shows;


public class TheatreController {
    /** City to list of theatres mapping. */
    Map<City, List<Theatre>> cityVsTheatre;
    /** Master list of all theatres. */
    List<Theatre> allTheatre;
    
    /** Initializes theatre storage. */
    public TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    /** Registers a theatre in a given city. */
    public void addTheatre(Theatre theatre, City city){
        allTheatre.add(theatre);
        List<Theatre> theatres = cityVsTheatre.get(city);
        if (theatres == null) {
            theatres = new ArrayList<>();
        }
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);

    }

    /** Returns shows for a movie in a city grouped by theatre. */
    public HashMap<Theatre, List<Shows>> getAllShows(Movie movie, City city){
        HashMap<Theatre, List<Shows>> theatreVsShows = new HashMap<>();
        
        List<Theatre> theatresInCity = cityVsTheatre.get(city);
        if (theatresInCity != null) {
            for (Theatre theatre : theatresInCity) {
                List<Shows> showsForMovie = new ArrayList<>();
                for (Shows show : theatre.getShow()) {
                    Movie showMovie = show.getMovieDetail();
                    if (showMovie != null && showMovie.equals(movie)) {
                        showsForMovie.add(show);
                    }
                }
                if (!showsForMovie.isEmpty()) {
                    theatreVsShows.put(theatre, showsForMovie);
                }
            }
        }
        
        return theatreVsShows;
    }
}
