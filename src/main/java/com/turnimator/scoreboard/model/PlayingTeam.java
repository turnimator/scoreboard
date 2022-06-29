/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turnimator.scoreboard.model;

/**
 *
 * @author atle
 */
public class PlayingTeam extends Team {
    private int _goals = 0;
    private int _annulled_goals = 0;
    public PlayingTeam(String id, String name){
        super(id, name);
        _goals = 0;
    }
    
    public PlayingTeam(Team t){
        super(t.getId(),t.getName());
        _goals = 0;
    }
    public void scoreGoal() { _goals++; }
    public void annulGoal() { _goals--; _annulled_goals++; }
    public int getScore() { return _goals; }
    public int getAnnulledGoals() { return _annulled_goals; }
}
