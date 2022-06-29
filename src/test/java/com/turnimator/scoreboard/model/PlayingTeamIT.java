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
public class PlayingTeamIT {

    public PlayingTeamIT() {
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
     * Test of scoreGoal method, of class PlayingTeam.
     */
    @Test
    public void testScoreGoal() {
        System.out.println("scoreGoal");
        PlayingTeam instance = new PlayingTeam("id", "name");
        instance.scoreGoal();
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 1;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of annulGoal method, of class PlayingTeam.
     */
    @Test
    public void testAnnulGoal() {
        System.out.println("annulGoal");
        PlayingTeam instance = new PlayingTeam("id", "name");;
        instance.annulGoal();
        instance.scoreGoal();

        int expResult = 1;
        int result = instance.getAnnulledGoals();
        assertEquals(expResult, result);
        expResult = 0;
        result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScore method, of class PlayingTeam.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        PlayingTeam instance = new PlayingTeam("id", "name");
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance.scoreGoal();
        expResult = 1;
        result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAnnulledGoals method, of class PlayingTeam.
     */
    @Test
    public void testGetAnnulledGoals() {
        System.out.println("getAnnulledGoals");
        PlayingTeam instance = new PlayingTeam("id", "name");
        int expResult = 0;
        int result = instance.getAnnulledGoals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        instance.scoreGoal();
        instance.annulGoal();
        expResult = 1;
        result = instance.getAnnulledGoals();
        assertEquals(expResult, result);
    }

}
