package BookMyShows.Product;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class MovieController {
      /** City to list of movies mapping. */
      Map<City, List<Movie>> cityVsMovies;
      /** Master list of all movies. */
      List<Movie> allMovieList;
      /** Initializes movie storage. */
      public MovieController(){
        cityVsMovies = new HashMap<>();
        allMovieList = new ArrayList<>();
      }

      /** Adds a movie for a given city. */
      public void addMovie(Movie movie, City city){
           allMovieList.add(movie);
           
           if (!cityVsMovies.containsKey(city)) {
               cityVsMovies.put(city, new ArrayList<>());
           }
           cityVsMovies.get(city).add(movie);
     }

      /** Returns the movie by exact name or null if not found. */
      public Movie getMovieByName(String movieName){
        for (Movie movie : allMovieList) {
            if (movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
      }
      /** Returns movies available for the city. */
      public List<Movie> getMovieByCity(City city){
        return cityVsMovies.get(city);
      }
}
