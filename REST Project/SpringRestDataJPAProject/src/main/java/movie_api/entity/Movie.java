package movie_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie_details")
public class Movie {
	
	@Id
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_title")
	private String movieName;
	@Column(name="movie_type")
	private String movieType;
	@Column(name="movie_year")
	private int year;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieName, String movieType, int year) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieType = movieType;
		this.year = year;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieType=" + movieType + ", year=" + year
				+ "]";
	}
	

}
