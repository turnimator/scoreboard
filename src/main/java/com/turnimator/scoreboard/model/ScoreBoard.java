/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turnimator.scoreboard.model;

import com.turnimator.scoreboard.interfaces.ScoreBoardInterface;
import com.turnimator.scoreboard.exceptions.isNotPlayingException;
import com.turnimator.scoreboard.exceptions.TeamNotEnlistedException;
import com.turnimator.scoreboard.exceptions.IsAlreadyPlayingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author atle
 */
public class ScoreBoard implements ScoreBoardInterface {

    HashMap<String, Team> teams = new HashMap<>();
    HashMap<String, Match> gamesPlaying = new HashMap<>();
    HashMap<String, Match> results = new HashMap<>();
    
    /**
     *
     * @param matchId
     * @throws isNotPlayingException
     */
    @Override
    public void finishGame(String matchId) throws isNotPlayingException {
        Match m = gamesPlaying.get(matchId);
        if (m == null){
            throw new isNotPlayingException();
        }
        gamesPlaying.remove(matchId);
        results.put(matchId, m);
    }

    /**
     *
     * @param matchId
     * @throws isNotPlayingException
     */
    @Override
    public void scoreHomeGoal(String matchId) throws isNotPlayingException {
        Match m = gamesPlaying.get(matchId);
        if (m == null){
            throw new isNotPlayingException();
        }
        m.scoreHomeGoal();
    }

    /**
     *
     * @param matchId
     * @throws isNotPlayingException
     */
    @Override
    public void scoreAwayGoal(String matchId) throws isNotPlayingException {
        Match m = gamesPlaying.get(matchId);
        if (m == null){
            throw new isNotPlayingException();
        }
        m.scoreAwayGoal();
    }

    /**
     *
     * @param matchId
     * @throws isNotPlayingException
     */
    @Override
    public void annulHomegoal(String matchId) throws isNotPlayingException {
        Match m = gamesPlaying.get(matchId);
        if (m == null){
            throw new isNotPlayingException();
        }
        m.annulHomeGoal();
    }

    /**
     *
     * @param matchId
     * @throws isNotPlayingException
     */
    @Override
    public void annulAwayGoal(String matchId) throws isNotPlayingException {
        Match m = gamesPlaying.get(matchId);
        if (m == null){
            throw new isNotPlayingException();
        }
        m.annulAwayGoal();
    }

    /**
     *
     * @param teamId
     * @return true is the team is playing a match, false if not
     */
    @Override
    public boolean isPlaying(String teamId) {        
        for (Match m : gamesPlaying.values()) {
            if (m.isPlaying(teamId)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param homeTeamId
     * @param awayTeamId
     * @return a new match id generated from the two unique team ids
     * @throws IsAlreadyPlayingException
     */
    @Override
    public String startGame(String homeTeamId, String awayTeamId) throws IsAlreadyPlayingException, TeamNotEnlistedException {
        // Sanity check
        if (isPlaying(homeTeamId) || isPlaying(awayTeamId)) {
            throw new IsAlreadyPlayingException();
        }
        
        Team home_team =  teams.get(homeTeamId);
        if (home_team == null){
            throw new TeamNotEnlistedException();
        }
        
        Team away_team = teams.get(awayTeamId);
        if (away_team == null){
            throw new TeamNotEnlistedException();
        }
        
        Match match = new Match(new PlayingTeam(home_team), new PlayingTeam(away_team));
        gamesPlaying.put(match.getId(), match);
        return match.getId();
    }

    /**
     * Enlist a team to play in the cup
     * @param teamId
     * @param name
     */
    @Override
    public void enlistTeam(String teamId, String name) {
        Team t = new Team(teamId, name);
        teams.put(teamId, t);
    }

    @Override
    public List<String> getScores() {
        ArrayList<String> scores = new ArrayList<>();
        for (Match m:gamesPlaying.values()){
            scores.add(m.getScoreString());
        }
        return scores;
    }

    @Override
    public List<String> getResults() {
        ArrayList<String> res = new ArrayList<>();
        for(Match m:results.values()){
            res.add(m.getResultString());
        }
        return res;
    }

}
