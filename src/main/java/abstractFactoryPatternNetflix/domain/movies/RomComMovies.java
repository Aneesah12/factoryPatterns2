package abstractFactoryPatternNetflix.domain.movies;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class RomComMovies implements NetflixCatalogue {

    private List<NetflixDetails> netflixRomComMovies;

    public RomComMovies(List<NetflixDetails> netflixRomComMovies) {
        this.netflixRomComMovies = netflixRomComMovies;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return this.netflixRomComMovies;
    }

    @Override
    public String toString(){
        return "RomCom Movie: "+"\n" +
                "Movie Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "Movie Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
