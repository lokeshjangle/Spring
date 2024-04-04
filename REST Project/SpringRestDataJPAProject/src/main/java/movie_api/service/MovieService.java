package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.MovieRespository;

@Service  //Marks this class as a Service Implementation class
public class MovieService {  //This class is meant for handling Business Logic. It interact with movie repository
	
	@Autowired  //Injecting the reference of MovieRepository
	private MovieRespository movieRepositoryRef;
	
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovie = movieRepositoryRef.findAll();
		return allMovie;
	}
	
	public Movie getOneMovie(Integer id) {
		Movie foundMovie = null;
		Optional<Movie> optionalRef =  movieRepositoryRef.findById(id);
		if(!optionalRef.isEmpty()) {
			foundMovie = optionalRef.get();
		}
		return foundMovie;
	}
	
	public void addNewMovie(Movie newMovie) {
		movieRepositoryRef.save(newMovie);
	}
	
	public void deleteMovie(Integer movieId) {
		movieRepositoryRef.deleteById(movieId);
	}

}
