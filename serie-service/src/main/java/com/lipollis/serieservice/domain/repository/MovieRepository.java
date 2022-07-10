package com.lipollis.serieservice.domain.repository;

import com.lipollis.movieservice.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("SELECT m FROM Movie m WHERE m.genre = ?1")
	List<Movie> findByGenre(String genre);
}
