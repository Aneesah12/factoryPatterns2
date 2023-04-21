package abstractFactoryPatternNetflix.domain.tvShows;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class ScienceFictionTvShows implements NetflixCatalogue {

    private List<NetflixDetails> netflixScienceFictionTvShows;

    public ScienceFictionTvShows(List<NetflixDetails> movieDetails) {
        this.netflixScienceFictionTvShows = movieDetails;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return netflixScienceFictionTvShows;
    }

    @Override
    public String toString(){
        return "Science Fiction TV Show: "+"\n" +
                "TV Show Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "TV Show Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
