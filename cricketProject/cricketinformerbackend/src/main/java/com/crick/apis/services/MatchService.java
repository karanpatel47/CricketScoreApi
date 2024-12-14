package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;

public interface MatchService {
    // get all matchs
    List<Match> getAllMatches();
    //get live matchs
    List<Match> getLiveMatches();

}
