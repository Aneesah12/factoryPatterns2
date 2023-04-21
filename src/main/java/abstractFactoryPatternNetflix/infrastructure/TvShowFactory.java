package abstractFactoryPatternNetflix.infrastructure;

import abstractFactoryPatternNetflix.domain.*;
import abstractFactoryPatternNetflix.domain.tvShows.ActionTvShows;
import abstractFactoryPatternNetflix.domain.tvShows.RomComTvShows;
import abstractFactoryPatternNetflix.domain.tvShows.ScienceFictionTvShows;

import java.util.List;

public class TvShowFactory extends AbstractFactory {

    @Override
    public NetflixCatalogue getShowInfo(String type, List<NetflixDetails> netflixDetails) {

        return null;
    }
}
