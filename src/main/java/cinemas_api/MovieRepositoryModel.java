package cinemas_api;

import org.springframework.data.annotation.Id;

public class MovieRepositoryModel {
    @Id
    public String id;
    public String movieName;
    public String movieType;

    public MovieRepositoryModel(String movieName, String movieType) {
        this.movieName = movieName;
        this.movieType = movieType;
    }

    @Override
    public String toString() {
        return String.format(
                "MovieRepositoryModel[id=%s, movieName='%s', movieType='%s']",
                id, movieName, movieType);
    }
}
