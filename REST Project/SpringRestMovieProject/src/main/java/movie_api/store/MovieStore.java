package movie_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import movie_api.entity.Movie;

public class MovieStore {

	private static Map<Integer, Movie> movieCollection;
	
	
	static {
		//This is used to instantiate the Map and store some values into it;
		movieCollection = new HashMap<Integer, Movie>();
		Movie m1 = new Movie(101,"Evil Dead","Horrer",1998);
		Movie m2 = new Movie(102,"Speed","Thriller",1997);
		Movie m3 = new Movie(103,"PK","Fantasy",2014);
		Movie m4 = new Movie(104,"Life Of PI","Emotional",2012);
		Movie m5 = new Movie(105,"Gadar","Action",2001);
		
		//Store all data of movie in map Collection
		movieCollection.put(m1.getMovieId(), m1);
		movieCollection.put(m2.getMovieId(), m2);
		movieCollection.put(m3.getMovieId(), m3);
		movieCollection.put(m4.getMovieId(), m4);
		movieCollection.put(m5.getMovieId(), m5);
		
	}
	
	//Method to retrieve all available movies
	public static Collection<Movie> getAllAvailableMovies(){
		
		//Retrieving right side of the Map i.e values i.e Movie Object
		Collection<Movie> allAvailableMovie = movieCollection.values();
		return allAvailableMovie;
	}
	
	
	//Method to retrieve one movie against its id
	public static Movie getOneMovieById(Integer id){
		
		return movieCollection.get(id);
	}
	
	//Method to add new movie into the existing Map
	public static void addNewMovie(Movie newMovie) {
		movieCollection.put(newMovie.getMovieId(), newMovie);
	}
	
	//Method to delete movie form Map
	public static void deleteMovie(Integer movieId) {
		movieCollection.remove(movieId);
	}

}
