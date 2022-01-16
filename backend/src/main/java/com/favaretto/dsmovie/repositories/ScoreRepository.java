package com.favaretto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.favaretto.dsmovie.entities.Score;
import com.favaretto.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
