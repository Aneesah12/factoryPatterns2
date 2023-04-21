package abstractFactoryPatternNetflix.domain;

public class NetflixDetails {
    private String netflixShowTitle;
    private int netflixShowRating;

    public NetflixDetails(String netflixShowTitle, int netflixShowRating) {
        this.netflixShowTitle = netflixShowTitle;
        this.netflixShowRating = netflixShowRating;
    }

    public String getNetflixShowTitle() {
        return netflixShowTitle;
    }

    public void setNetflixShowTitle(String netflixShowTitle) {
        this.netflixShowTitle = netflixShowTitle;
    }

    public int getNetflixShowRating() {
        return netflixShowRating;
    }

    public void setNetflixShowRating(int netflixShowRating) {
        this.netflixShowRating = netflixShowRating;
    }
}
