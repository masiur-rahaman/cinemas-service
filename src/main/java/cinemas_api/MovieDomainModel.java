package cinemas_api;

@lombok.Getter
public class MovieDomainModel {
    String movieName;
    String movieType;

    public MovieDomainModel() {
        super();
    }

    public MovieDomainModel(String movieName, String movieType) {
        this.movieName = movieName;
        this.movieType = movieType;
    }
}
