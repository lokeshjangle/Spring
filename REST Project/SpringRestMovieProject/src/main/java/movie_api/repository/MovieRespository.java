package movie_api.repository;

import java.util.Collection;
import org.springframework.stereotype.Repository;
import movie_api.entity.Movie;
import movie_api.store.MovieStore;
@Repository  //Marks this class as a Repository
public class MovieRespository { //This is a repository used to interact with MovieStore

	public Collection<Movie> getAllMovie(){
		return MovieStore.getAllAvailableMovies();
	}
	
	public Movie getOneMovie(Integer id) {
		return MovieStore.getOneMovieById(id);
	}
	
	public void addNewMovie(Movie newMovie) {
		MovieStore.addNewMovie(newMovie);
	}
	
	public void deleteMovie(Integer movieId) {
		MovieStore.deleteMovie(movieId);
	}
}