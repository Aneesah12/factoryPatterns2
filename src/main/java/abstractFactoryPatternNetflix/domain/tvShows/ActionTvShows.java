package abstractFactoryPatternNetflix.domain.tvShows;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public class ActionTvShows implements NetflixCatalogue {

    private List<NetflixDetails> netflixActionTvShows;

    public ActionTvShows(List<NetflixDetails> netflixActionTvShows) {
        this.netflixActionTvShows = netflixActionTvShows;
    }

    @Override
    public List<NetflixDetails> getNetflixShowData() {
        return netflixActionTvShows;
    }

    @Override
    public String toString(){
        return "Action TV Show: "+"\n" +
                "TV Show Title: " + this.getNetflixShowData().get(0).getNetflixShowTitle() + "\n" +
                "TV Show Rating: " + this.getNetflixShowData().get(0).getNetflixShowRating() + "\n";
    }
}
