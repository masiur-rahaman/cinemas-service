package cinemas_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private MoviesRepository moviesRespository;
    private MoviesMapper moviesMapper;
    private MovieDomainToRepositoryMapper movieDomainToRepositoryMapper;


    @Autowired
    public MoviesService(MoviesRepository moviesRespository,
                         MoviesMapper moviesMapper,
                         MovieDomainToRepositoryMapper movieDomainToRepositoryMapper) {
        this.moviesRespository = moviesRespository;
        this.moviesMapper = moviesMapper;
        this.movieDomainToRepositoryMapper = movieDomainToRepositoryMapper;
    }

    public List<MovieDomainModel> GetMovies() {
        return moviesMapper.map(this.moviesRespository.findAll());
    }

    public void AddMovie(MovieDomainModel movieDomainModel) {
        this.moviesRespository.save(movieDomainToRepositoryMapper.map(movieDomainModel));

    }

}
