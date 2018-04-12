package cinemas_api;

import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public MovieDomainModel map(MovieRepositoryModel movieRepositoryModel) {
        return new MovieDomainModel(movieRepositoryModel.movieName,
                                    movieRepositoryModel.movieType);
    }
}
