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
import static org.junit.Assert.assertNotNull;

public class MovieFactoryTest {

    @Test
    public void shouldReturnRomComMovies() {

        NetflixMovies romComMovie = MovieFactory.getMovies();

        assertNotNull(romComMovie);
        assertThat(romComMovie, instanceOf(RomComMovies.class));
        assertThat(romComMovie.getMovies().get(0).getMovieTitle(), equalTo("Blah"));
        assertThat(romComMovie.getMovies().get(0).getRating(), equalTo(2));
    }

    @Test
    public void shouldReturnActionMovie() {

        NetflixMovies actionMovie = MovieFactory.getMovies();

        assertNotNull(actionMovie);
        assertThat(actionMovie, instanceOf(ActionMovies.class));
        assertThat(actionMovie.getMovies().get(0).getMovieTitle(), equalTo("Terminator"));
        assertThat(actionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

    @Test
    public void shouldReturnScienceFictionMovie() {

        NetflixMovies scienceFictionMovie = MovieFactory.getMovies();

        assertNotNull(scienceFictionMovie);
        assertThat(scienceFictionMovie, instanceOf(ScienceFictionMovies.class));
        assertThat(scienceFictionMovie.getMovies().get(0).getMovieTitle(), equalTo("Alien"));
        assertThat(scienceFictionMovie.getMovies().get(0).getRating(), equalTo(5));
    }

}