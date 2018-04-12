package cinemas_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MoviesMapper {
    private MovieMapper movieMapper;

    @Autowired
    public MoviesMapper(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<MovieDomainModel> map(List<MovieRepositoryModel> movieRepositoryModels) {
        List<MovieDomainModel> movieDomainModels = new ArrayList<MovieDomainModel>();
        for (MovieRepositoryModel movieRepository :
                movieRepositoryModels) {
            movieDomainModels.add(movieMapper.map(movieRepository));
        }
        return movieDomainModels;
    }
}
