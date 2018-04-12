package cinemas_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class MovieController {
  public MoviesService moviesService;

  @Autowired

  public MovieController(MoviesService moviesService) {
      this.moviesService = moviesService;
  }

  @CrossOrigin
  @GetMapping("/movies")
  public ResponseEntity<List<MovieDomainModel>> GetMovies(String[] args) {
    List<MovieDomainModel> movies = moviesService.GetMovies();
    return new ResponseEntity<>(movies, OK);
  }

  @CrossOrigin
  @PostMapping("/addmovie")
  public ResponseEntity<MovieDomainModel> AddMovie(@RequestBody MovieDomainModel movieDomainModel) {
      moviesService.AddMovie(movieDomainModel);
      return new ResponseEntity<>(movieDomainModel, CREATED);
  }
}
