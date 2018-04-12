package cinemas_api;

import org.springframework.stereotype.Component;

@Component
public class MovieDomainToRepositoryMapper {
    public MovieRepositoryModel map(MovieDomainModel movieDomainModel) {
        return new MovieRepositoryModel(movieDomainModel.movieName,movieDomainModel.movieType);
    }
}
