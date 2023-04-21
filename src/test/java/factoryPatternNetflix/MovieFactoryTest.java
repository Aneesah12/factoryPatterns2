package factoryPatternNetflix;

import factoryPatternNetflix.domain.ActionMovies;
import factoryPatternNetflix.domain.NetflixMovies;
import factoryPatternNetflix.domain.RomComMovies;
import factoryPatternNetflix.domain.ScienceFictionMovies;
import factoryPatternNetflix.infrastructure.MovieFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieFactoryTest {

    @Test
    public void shouldReturnRomComMovies() {

        NetflixMovies romComMovie = MovieFactory.getMovies();

        assertThat(romComMovie, instanceOf(RomComMovies.class));
        assert romComMovie != null;
        assertThat(romComMovie.getMovies().get(0).getMovieTitle(), equalTo("Blah"));
        assertThat(romComMovie.getMovies().get(0).getRating(), equalTo(2));
    }

    @Test
    public void shouldReturnActionMovie() {

        NetflixMovies actionMovie = MovieFactory.getMovies();

        assertThat(actionMovie, instanceOf(ActionMovies.class));
        assert actionMovie != null;
        assertThat(actionMovie.getMovies().get(0).getMovieTitle(), equalTo("Terminator"));
        assertThat(actionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

    @Test
    public void shouldReturnScienceFictionMovie() {

        NetflixMovies scienceFictionMovie = MovieFactory.getMovies();

        assertThat(scienceFictionMovie, instanceOf(ScienceFictionMovies.class));
        assert scienceFictionMovie != null;
        assertThat(scienceFictionMovie.getMovies().get(0).getMovieTitle(), equalTo("Alien"));
        assertThat(scienceFictionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

}