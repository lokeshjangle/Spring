package example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages  = "movie_api")
public class SpringRestMovieProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMovieProjectApplication.class, args);
	}

}
