package BookMyShows.Product;

public class Movie {
    /** Unique identifier for the movie. */
    int movieId;
    /** Display name of the movie. */
    String movieName;
    /** Duration of the movie in minutes. */
    int movieDurationInminutes;
    /** Primary language of the movie. */
    String movieLanguage;
    
    /** Creates a Movie with default values. */
    public Movie() {
        this.movieId = 0;
        this.movieName = "";
        this.movieDurationInminutes = 0;
        this.movieLanguage = "";
    }
    
    /** Creates a Movie with provided values. */
    public Movie(int movieId, String movieName, int movieDurationInminutes, String movieLanguage) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDurationInminutes = movieDurationInminutes;
        this.movieLanguage = movieLanguage;
    }
    
    //getter and setter

    /** Sets the unique movie id. */
    public void setId(int movieId){
        this.movieId= movieId;
    }

    /** Returns the unique movie id. */
    public int getId(){
        return movieId;
    }

    /** Sets the movie name. */
    public void setMovieName(String movieName){
        this.movieName= movieName;
    }

    /** Returns the movie name. */
    public String getMovieName(){
        return movieName;
    }

    /** Sets the movie duration in minutes. */
    public void setMovieDurationInminutes(int movieDurationInminutes){
        this.movieDurationInminutes= movieDurationInminutes;
    }

    /** Returns the movie duration in minutes. */
    public int getMovieDurationInminutes(){
        return movieDurationInminutes;
    }

    /** Sets the movie language. */
    public void setMovieLanguage(String movieLanguage){
        this.movieLanguage= movieLanguage;
    }

    /** Returns the movie language. */
    public String getMovieLanguage(){
        return movieLanguage;
    }
}
