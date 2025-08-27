package BookMyShows;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import BookMyShows.Product.MovieController;
import BookMyShows.Product.Seat;
import BookMyShows.Product.SeatCategory;
import BookMyShows.Product.City;
import BookMyShows.Service.TheatreController;
import BookMyShows.Product.Movie;
import BookMyShows.Service.Screen;
import BookMyShows.Service.Theatre;
import BookMyShows.Product.Shows;
import BookMyShows.Model.Booking;;

public class BookMyShow {
    /** Handles movie catalog and city-movie mapping. */
    MovieController movieController;
    /** Manages theatres and city-theatre mapping. */
    TheatreController theatreController;
    
    /** Constructs controllers for movies and theatres. */
    BookMyShow(){
        movieController =  new MovieController();
        theatreController = new TheatreController();

    }

    //Main Fubnction to initialize theatre, movie and booking 
    public static void main(String[] args){
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initializie();
        

        bookMyShow.createBooking(City.Bangalore,"Bahubali");
        bookMyShow.createBooking(City.Delhi,"Avengers");
        bookMyShow.createBooking(City.Mumbai,"Bahubali");



    }



    /** Initializes movies and theatres. */
    private void initializie(){
        createMovies();
        createTheatre();
    }


    
    /** Seeds movies by city. */
    private void createMovies(){
        Movie Avengers = new Movie(123, "Avengers", 245, "Hindi");
        Movie Bahubali = new Movie(213, "Bahubali", 230, "Hindi");
        City city1 = City.Bangalore;
        City city2 = City.Delhi;
        City city3 = City.Mumbai;
        City city4 = City.Kolkata;
        movieController.addMovie(Bahubali, city1);
        movieController.addMovie(Bahubali, city2);
        movieController.addMovie(Bahubali, city3);
        movieController.addMovie(Bahubali, city4);
        movieController.addMovie(Avengers, city1);
        movieController.addMovie(Avengers, city2);
        movieController.addMovie(Avengers, city3);
        movieController.addMovie(Avengers, city4);

        //Add more movie, theatres, city.


        
    }
    
    /** Seeds theatres, screens and shows; registers them to controller. */
    private void createTheatre(){

        Movie avengerMovie = movieController.getMovieByName("Avengers");
        Movie bahubaliMovie = movieController.getMovieByName("Bahubali");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setScreenlist(createScreen());
        inoxTheatre.setCity(City.Bangalore);
        List<Shows> inoxShows = new ArrayList<>();
        Shows inoxMorningShow = createShows(1, inoxTheatre.getScreenlist().get(0), avengerMovie, "08:00");
        Shows inoxEveningShow = createShows(2, inoxTheatre.getScreenlist().get(0), bahubaliMovie, "16:00");
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShow(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreenlist(createScreen());
        pvrTheatre.setCity(City.Delhi);
        List<Shows> pvrShows = new ArrayList<>();
        Shows pvrMorningShow = createShows(3, pvrTheatre.getScreenlist().get(0), avengerMovie, "10:00");
        Shows pvrEveningShow = createShows(4, pvrTheatre.getScreenlist().get(0), bahubaliMovie, "18:00");
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShow(pvrShows);

        Theatre cinepolisTheatre = new Theatre();
        cinepolisTheatre.setTheatreId(3);
        cinepolisTheatre.setScreenlist(createScreen());
        cinepolisTheatre.setCity(City.Mumbai);
        List<Shows> cinepolisShows = new ArrayList<>();
        Shows cinepolisNoonShow = createShows(5, cinepolisTheatre.getScreenlist().get(0), avengerMovie, "12:00");
        Shows cinepolisNightShow = createShows(6, cinepolisTheatre.getScreenlist().get(0), bahubaliMovie, "20:00");
        cinepolisShows.add(cinepolisNoonShow);
        cinepolisShows.add(cinepolisNightShow);
        cinepolisTheatre.setShow(cinepolisShows);

        theatreController.addTheatre(cinepolisTheatre, City.Mumbai);
        theatreController.addTheatre(pvrTheatre, City.Delhi);
        theatreController.addTheatre(inoxTheatre, City.Bangalore);


     }


     /** Creates a show instance for a screen and movie. */
     private Shows createShows(int showId, Screen screen, Movie movie, String showStartTime) {
 
         Shows show = new Shows();
         show.setShowId(showId);
         show.setScreenInfo(screen);
         show.setMovieDetail(movie);
         show.setStartTime(showStartTime);
         return show;
     }


    /** Creates a single screen with seats. */
    private List<Screen> createScreen(){
        List<Screen> screens = new ArrayList<>();
        Screen screen1= new Screen();
        screen1.setScreenId(1);
        screen1.setSeat(createSeats());

        screens.add(screen1);
        return screens;
    }

    /** Creates seats grouped by categories. */
    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();
        //1 to 40 : Silver, 40 to 70: Gold, 70 to 100: Platinum
        for(int i=0;i<40;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.Silver);
            seats.add(seat);
        }

        for(int i=40;i<70;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.Gold);
            seats.add(seat);
        }

        for(int i=70;i<100;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.Platinum);
            seats.add(seat);
        }
        return seats;
    }


    /** Creates a booking for a user city and chosen movie. */
    private void createBooking(City userCity, String movieName){

        List<Movie> movies = movieController.getMovieByCity(userCity);
        
        Movie interestedMovie = null;
         for(Movie movie : movies ){
            if(movie.getMovieName().equals(movieName)){
                interestedMovie = movie;
            }
         }

         Map<Theatre, List<Shows>> showsTheatreWise = theatreController.getAllShows(interestedMovie, userCity);
         
         Map.Entry<Theatre, List<Shows>> entry = showsTheatreWise.entrySet().iterator().next();
         List<Shows> runningShows = entry.getValue();

         Shows interestedShow = runningShows.get(0);
         

         int seatNumber = 30;
         List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
         
         if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);

            //start payment

            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();

            for( Seat screenSeat : interestedShow.getScreenInfo().getSeat()){
                if(screenSeat.getSeatId() == seatNumber){
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setSeat(myBookedSeats);

            booking.setShow(interestedShow);

         }else{
            System.out.println("Seat is already booked. Try another seat. Thanks");
             return;
         }

         System.out.println("Booking is successful. Enjoy your shows");


    }
}
