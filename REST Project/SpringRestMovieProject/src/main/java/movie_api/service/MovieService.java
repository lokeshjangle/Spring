package movie_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.MovieRespository;

@Service  //Marks this class as a Service Implementation class
public class MovieService {  //This class is meant for handling Business Logic. It interact with movie repository
	
	@Autowired  //Injecting the reference of MovieRepository
	private MovieRespository movieRepositoryRef;
	
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovie = movieRepositoryRef.getAllMovie();
		return allMovie;
	}
	
	public Movie getOneMovie(Integer id) {
		return movieRepositoryRef.getOneMovie(id);
	}
	
	public void addNewMovie(Movie newMovie) {
		movieRepositoryRef.addNewMovie(newMovie);
	}
	
	public void deleteMovie(Integer movieId) {
		movieRepositoryRef.deleteMovie(movieId);
	}

}
