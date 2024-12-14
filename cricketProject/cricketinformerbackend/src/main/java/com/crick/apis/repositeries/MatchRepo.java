package com.crick.apis.repositeries;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //find match by team name from database
    Optional<Match> findByTeamHeading(String teamHeading);
}
