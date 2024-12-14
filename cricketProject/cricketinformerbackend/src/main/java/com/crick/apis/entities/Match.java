package com.crick.apis.entities;

import jakarta.persistence.*;

import java.util.Date;

import static com.crick.apis.entities.MatchStatus.COMPLETED;
import static com.crick.apis.entities.MatchStatus.LIVE;

@Entity
@Table(name = "crick_matches ")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading ;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;


    @Enumerated
    private MatchStatus status;

    private Date date = new Date();

    public Match(String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, Date date, String liveText, int matchId, String matchLink, String matchNumberVenue, MatchStatus status, String teamHeading, String textComplete) {
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.date = date;
        this.liveText = liveText;
        this.matchId = matchId;
        this.matchLink = matchLink;
        this.matchNumberVenue = matchNumberVenue;
        this.status = status;
        this.teamHeading = teamHeading;
        this.textComplete = textComplete;
    }

    public Match() {
    }
    // for cheak match status live or not
    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status = LIVE;
        }
        else {
            this.status = COMPLETED;
        }
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }
}
