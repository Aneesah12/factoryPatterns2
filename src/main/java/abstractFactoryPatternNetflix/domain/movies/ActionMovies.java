package abstractFactoryPatternNetflix.domain.movies;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class ActionMovies implements NetflixCatalogue {

    private List<NetflixDetails> netflixActionMovies;

    public ActionMovies(List<NetflixDetails> netflixActionMovies) {
        this.netflixActionMovies = netflixActionMovies;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return netflixActionMovies;
    }

    @Override
    public String toString(){
        return "Action Movie: "+"\n" +
                "Movie Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "Movie Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
