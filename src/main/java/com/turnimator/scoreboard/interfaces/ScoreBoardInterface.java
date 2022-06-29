/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turnimator.scoreboard.interfaces;

import com.turnimator.scoreboard.exceptions.isNotPlayingException;
import com.turnimator.scoreboard.exceptions.TeamNotEnlistedException;
import com.turnimator.scoreboard.exceptions.IsAlreadyPlayingException;
import java.util.List;

/**
 *
 * @author atle
 */
public interface ScoreBoardInterface {
    /**
     * Add a team to the score board 
     * @param teamId A unique identifier for the team (can be the same as the name)
     * @param name The team name
     */
    void enlistTeam(String teamId, String name);
    
    /**
     * Start a game
     * @param homeTeamId
     * @param awayTeamId
     * @return a new match Id
     * @throws IsAlreadyPlayingException 
     * @throws com.turnimator.scoreboard.exceptions.TeamNotEnlistedException 
     */
    String startGame(String homeTeamId, String awayTeamId) throws IsAlreadyPlayingException, TeamNotEnlistedException;
    
    /**
     * Finish a game
     * @param matchId
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException
     */
    void finishGame(String matchId)throws isNotPlayingException;
    
    /**
     * Register a goal for the home team
     * @param matchId 
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException 
     */
    void scoreHomeGoal(String matchId)throws isNotPlayingException;
    
    /**
     * Register a goal for the away team
     * @param matchId
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException
     */
    void scoreAwayGoal(String matchId)throws isNotPlayingException;
    
    /**
     * Register an annulment or erroneous entry for the home team 
     * @param matchId
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException
     */
    void annulHomegoal(String matchId) throws isNotPlayingException;
    
    /**
     * Register an annulment or erroneous entry for the away team 
     * @param matchId
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException
     */
    void annulAwayGoal(String matchId) throws isNotPlayingException;
    
    /**
     * Check is a team is currently playing
     * @param teamId
     * @return 
     */
    boolean isPlaying(String teamId);
    
    List<String> getScores();
    
    List<String> getResults();
    
}
