package abstractFactoryPatternNetflix.domain.movies;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class ScienceFictionMovies implements NetflixCatalogue {

    private List<NetflixDetails> netflixScienceFictionMovies;

    public ScienceFictionMovies(List<NetflixDetails> netflixScienceFictionMovies) {
        this.netflixScienceFictionMovies = netflixScienceFictionMovies;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return netflixScienceFictionMovies;
    }

    @Override
    public String toString(){
        return "Science Fiction Movie: "+"\n" +
                "Movie Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "Movie Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
