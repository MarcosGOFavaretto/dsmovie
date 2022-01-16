package com.favaretto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.favaretto.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
