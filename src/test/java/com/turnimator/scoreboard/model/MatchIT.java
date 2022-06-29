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
public class MatchIT {
    
    public MatchIT() {
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
     * Test of getId method, of class Match.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        String expResult = "home:away";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPlaying method, of class Match.
     */
    @Test
    public void testIsPlaying() {
        System.out.println("isPlaying");
        String teamid = "";
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        boolean expResult = false;
        boolean result = instance.isPlaying(teamid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        expResult = true;
        result = instance.isPlaying("home");
        assertEquals(expResult, result);
    }

    /**
     * Test of scoreHomeGoal method, of class Match.
     */
    @Test
    public void testScoreHomeGoal() {
        System.out.println("scoreHomeGoal");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        instance.scoreHomeGoal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of annulHomeGoal method, of class Match.
     */
    @Test
    public void testAnnulHomeGoal() {
        System.out.println("annulHomeGoal");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        instance.annulHomeGoal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of scoreAwayGoal method, of class Match.
     */
    @Test
    public void testScoreAwayGoal() {
        System.out.println("scoreAwayGoal");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        instance.scoreAwayGoal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of annulAwayGoal method, of class Match.
     */
    @Test
    public void testAnnulAwayGoal() {
        System.out.println("annulAwayGoal");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        instance.annulAwayGoal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getScoreString method, of class Match.
     */
    @Test
    public void testGetScoreString() {
        System.out.println("getScoreString");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        String result = instance.getScoreString();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResultString method, of class Match.
     */
    @Test
    public void testGetResultString() {
        System.out.println("getResultString");
        Match instance = new Match(new PlayingTeam("home", "Home Team"), new PlayingTeam("away", "Away Team"));
        String expResult = "home:away";
        String result = instance.getResultString();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
