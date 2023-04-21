package factoryPatternNetflix.domain;

import factoryPatternNetflix.domain.MovieDetails;
import factoryPatternNetflix.domain.NetflixMovies;

import java.util.List;

public class RomComMovies implements NetflixMovies {

    private List<MovieDetails> movieDetails;

    public RomComMovies(List<MovieDetails> movieDetails) {
        this.movieDetails = movieDetails;
    }

    @Override
    public List<MovieDetails> getMovies() {
        return this.movieDetails;
    }

    @Override
    public String toString(){
        return "RomCom Movie: "+"\n" +
                "Movie Title: " + this.getMovies().get(0).getMovieTitle() + "\n" +
                "Movie Rating: " + this.getMovies().get(0).getRating() + "\n";
    }
}
