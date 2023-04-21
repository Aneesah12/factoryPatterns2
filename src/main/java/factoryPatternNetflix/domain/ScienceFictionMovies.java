package factoryPatternNetflix.domain;

import factoryPatternNetflix.domain.MovieDetails;
import factoryPatternNetflix.domain.NetflixMovies;

import java.util.List;

public class ScienceFictionMovies implements NetflixMovies {

    private List<MovieDetails> movieDetails;

    public ScienceFictionMovies(List<MovieDetails> movieDetails) {
        this.movieDetails = movieDetails;
    }

    @Override
    public List<MovieDetails> getMovies() {
        return movieDetails;
    }

    @Override
    public String toString(){
        return "Science Fiction Movie: "+"\n" +
                "Movie Title: " + this.getMovies().get(0).getMovieTitle() + "\n" +
                "Movie Rating: " + this.getMovies().get(0).getRating() + "\n";
    }
}
