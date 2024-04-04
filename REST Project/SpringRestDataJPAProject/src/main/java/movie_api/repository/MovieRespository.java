package movie_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import movie_api.entity.Movie;


//@Repository  //It is not required because JPARepository is already a Managed Component . Since MovieRepository is inherited from it, also becomes Managed Component

public interface MovieRespository extends JpaRepository<Movie, Integer>{} 


//This is marker interface which extends by super Interface JPARepository in that all the method are already interface