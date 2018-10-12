package com.stackroute.movies.repository;

import com.stackroute.movies.domain.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies,String> {
}
