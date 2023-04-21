package factoryPatternNetflix.domain;

import java.util.List;

public class ActionMovies implements NetflixMovies {

    private List<MovieDetails> movieDetails;

    public ActionMovies(List<MovieDetails> movieDetails) {
        this.movieDetails = movieDetails;
    }

    @Override
    public List<MovieDetails> getMovies() {
        return movieDetails;
    }

    @Override
    public String toString(){
        return "Action Movie: "+"\n" +
                "Movie Title: " + this.getMovies().get(0).getMovieTitle() + "\n" +
                "Movie Rating: " + this.getMovies().get(0).getRating() + "\n";
    }
}
