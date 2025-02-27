package movie_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //Send the status not found in the case of this exception
public class MovieNotFoundException extends RuntimeException {
	private Integer invalidMovieId;
	public MovieNotFoundException( String errorMessage,Integer invalidMovieId) {
		super(errorMessage);
		this.invalidMovieId = invalidMovieId;
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message + " ===> "+ invalidMovieId;
		return finalMessage;
	}

}
