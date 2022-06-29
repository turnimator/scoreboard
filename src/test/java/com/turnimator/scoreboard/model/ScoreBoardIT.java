/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.turnimator.scoreboard.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author atle
 */
public class ScoreBoardIT {
    
    public ScoreBoardIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of finishGame method, of class ScoreBoard.
     */
    @Test
    public void testFinishGame() throws Exception {
        System.out.println("finishGame");
        String matchId = "mymatch";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam("home", "Home Team");
        instance.enlistTeam("away", "Away Team");
        matchId = instance.startGame("home", "away");
        instance.finishGame(matchId);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of scoreHomeGoal method, of class ScoreBoard.
     */
    @Test
    public void testScoreHomeGoal() throws Exception {
        System.out.println("scoreHomeGoal");
        String matchId = "mymatch";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam("home", "Home Team");
        instance.enlistTeam("away", "Away Team");
        matchId = instance.startGame("home", "away");
        instance.scoreHomeGoal(matchId);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of scoreAwayGoal method, of class ScoreBoard.
     */
    @Test
    public void testScoreAwayGoal() throws Exception {
        System.out.println("scoreAwayGoal");
        String matchId = "mymatch";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam("home", "Home Team");
        instance.enlistTeam("away", "Away Team");
        matchId = instance.startGame("home", "away");
        instance.scoreAwayGoal(matchId);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of annulHomegoal method, of class ScoreBoard.
     */
    @Test
    public void testAnnulHomegoal() throws Exception {
        System.out.println("annulHomegoal");
        String matchId = "a:b";
        ScoreBoard instance = new ScoreBoard();
        
        // TODO review the generated test code and remove the default call to fail.
        instance.enlistTeam("a", "Team A");        
        instance.enlistTeam("b", "Team B");
        instance.startGame("a", "b");
        instance.annulHomegoal(matchId);
        
    }

    /**
     * Test of annulAwayGoal method, of class ScoreBoard.
     */
    @Test
    public void testAnnulAwayGoal() throws Exception {
        System.out.println("annulAwayGoal");
        String matchId = "";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam("home", "Home Team");
        instance.enlistTeam("away", "Away Team");
        matchId = instance.startGame("home", "away");
        instance.annulAwayGoal(matchId);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPlaying method, of class ScoreBoard.
     */
    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        String teamId = "myteam";
        ScoreBoard instance = new ScoreBoard();
        boolean expResult = false;
        boolean result = instance.isPlaying(teamId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of startGame method, of class ScoreBoard.
     */
    @Test
    public void testStartGame() throws Exception {
        System.out.println("startGame");
        String homeTeamId = "hometeam";
        String awayTeamId = "awayteam";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam(awayTeamId, "Away Team");
        instance.enlistTeam(homeTeamId, "Home Team");
        String expResult = "hometeam:awayteam";
        String result = instance.startGame(homeTeamId, awayTeamId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of enlistTeam method, of class ScoreBoard.
     */
    @Test
    public void testEnlistTeam() {
        System.out.println("enlistTeam");
        String teamId = "myteam";
        String name = "Vålerenga";
        ScoreBoard instance = new ScoreBoard();
        instance.enlistTeam(teamId, name);
        // TODO review the generated test code and remove the default call to fail.
        boolean expResult = false;
        boolean result = instance.isPlaying(teamId);
        assertEquals(expResult, result);
    }
    
}
