package factoryPatternNetflix.domain;

public class MovieDetails {
    private String movieTitle;
    private int rating;

    public MovieDetails(String movieTitle, int rating) {
        this.movieTitle = movieTitle;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
