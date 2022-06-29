/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turnimator.scoreboard.model;

/**
 *
 * @author atle
 */
public class Match {
    private final PlayingTeam _home;
    private final PlayingTeam _away;
    
    public Match(PlayingTeam home, PlayingTeam away){
        _home = home;
        _away = away;       
    }
    
    public String getId() {
        return _home.getId() + ":" + _away.getId();
    }
    
    public boolean isPlaying(String teamid){
        return _home.getId().equals(teamid) || _away.getId().equals(teamid);
    }
    
    public void scoreHomeGoal() {
        _home.scoreGoal();
    }
    
    public void annulHomeGoal(){
        _home.annulGoal();
    }
    
    public void scoreAwayGoal(){
        _away.scoreGoal();
    }
    
    public void annulAwayGoal(){
        _away.annulGoal();
    }
    
    public String getScoreString(){
        return (_home.getName() + " - " + _away.getName() + " : " + _home.getScore() + " - " + _away.getScore());
    }
    
    public String getResultString(){
        return (_home.getName() + " " + _home.getScore() + " - " + _away.getName() + " " + _away.getScore());
    }
}
