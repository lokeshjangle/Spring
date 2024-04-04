package movie_api.controller;

import java.util.Collection;
import movie_api.entity.Movie;
import movie_api.exception.MovieNotFoundException;
import movie_api.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	//GET, /movie-api - To get all movies
	
	@Autowired  //Injecting the reference of movieService
	private MovieService movieServiceRef;
	
	@RequestMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovies = movieServiceRef.getAllMovies();
		return allMovies;
	}
	
	//GET,/movie-api/{movie_id} - To get one movies against its MovieId
//	@RequestMapping("/movie-api/{movie_id}")
	
	@GetMapping("/movie-api/{movie_id}")
	public Movie getOneMovie(@PathVariable("movie_id") Integer id) {  //@PathVariable():- use to bind parameter with url parameter '{}' 
		Movie foundMovie = movieServiceRef.getOneMovie(id);
		if(foundMovie == null) {
			throw new MovieNotFoundException("Unable to find movie with this ID", id);
		}
		else {
			return foundMovie;
		}
	}
	
	//POST, /movie-api - 
	//@RequestMapping(value="/movie-api",method = RequestMethod.POST)  //By default RequestMethod = GET if we want to use different method rather than GET like (POST,PUT,DELETE) you need to mention RequestMethod.methodName
	
	@PostMapping("/movie-api")
	public void addNewMovie(@RequestBody Movie newMovie) {
		System.out.println("Object received:"+newMovie);
		movieServiceRef.addNewMovie(newMovie);
	}
	
	
	@DeleteMapping("/movie-api/{movieId}")
	public void deleteMovie(@PathVariable("movieId") Integer movieId) {
		Movie foundMovie = movieServiceRef.getOneMovie(movieId);
		if(foundMovie == null) {
			throw new MovieNotFoundException("Unable to find movie with this ID", movieId);
		}
		else {
			movieServiceRef.deleteMovie(movieId);
		}
	}
}
