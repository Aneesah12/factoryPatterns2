package abstractFactoryPatternNetflix.infrastructure;

import abstractFactoryPatternNetflix.domain.NetflixCatalogue;
import abstractFactoryPatternNetflix.domain.NetflixDetails;

import java.util.List;

public abstract class AbstractFactory {
    public abstract NetflixCatalogue getShowInfo(String showType, List<NetflixDetails> netflixDetails);
}
