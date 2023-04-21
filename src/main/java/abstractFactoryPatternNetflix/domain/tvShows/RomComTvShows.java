package abstractFactoryPatternNetflix.domain.tvShows;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class RomComTvShows implements NetflixCatalogue {

    private List<NetflixDetails> netflixRomComTvShows;

    public RomComTvShows(List<NetflixDetails> netflixRomComTvShows) {
        this.netflixRomComTvShows = netflixRomComTvShows;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return this.netflixRomComTvShows;
    }

    @Override
    public String toString(){
        return "RomCom TV Show: "+"\n" +
                "TV Show Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "TV Show Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
