package cinemas_api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends MongoRepository<MovieRepositoryModel,String> {
//    public List<MovieRepositoryModel> findAll();

}
