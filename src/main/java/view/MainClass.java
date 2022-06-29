/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import com.turnimator.scoreboard.exceptions.IsAlreadyPlayingException;
import com.turnimator.scoreboard.exceptions.TeamNotEnlistedException;
import com.turnimator.scoreboard.exceptions.isNotPlayingException;
import com.turnimator.scoreboard.model.ScoreBoard;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atle
 */
public class MainClass {

    static void printScores(List<String> scores){
        System.out.println("\n------------- SCORES -------------");
        for(String s:scores){
            System.out.println(s);
        }
        System.out.println("----------------------------------\n");
    }
    
    static void printResults(List<String> res){
        System.out.println("\n------------- RESULTS -------------");
        int i = 1;
        for(String s:res){
            System.out.println(""+i+++": " + s); // <- I know it looks funny, but this is not part of the library.
        }
        System.out.println("----------------------------------\n");
    }
    /**
     * @param args the command line arguments
     * @throws com.turnimator.scoreboard.exceptions.isNotPlayingException
     * @throws com.turnimator.scoreboard.exceptions.IsAlreadyPlayingException
     * @throws com.turnimator.scoreboard.exceptions.TeamNotEnlistedException
     */
    public static void main(String[] args) throws isNotPlayingException, IsAlreadyPlayingException, TeamNotEnlistedException {
        
        // TODO code application logic here
        ScoreBoard b = new ScoreBoard();
        b.enlistTeam("valer", "Vaalerenga");
        b.enlistTeam("manu", "Manchester United");
        b.enlistTeam("steawa", "Steawa Bucuresti");
        b.enlistTeam("liege", "Standard Liege");
        
        System.out.println("Kickoff Vaalerenga against Manchester United at Vaalerenga Stadion");
        String match1 = b.startGame("valer", "manu");

        System.out.println("Kickoff Steawa Bucuresti against Standard Liege in Arena Națională");
        String match2 = b.startGame("steawa", "liege");

        System.out.println("\n**Oh, no! Manchester scores!");
        b.scoreAwayGoal(match1);
        printScores(b.getScores());
        System.out.println("Wait ... the referee waves his hands. Offside! Goal anulled!");
        b.annulAwayGoal(match1);
        printScores(b.getScores());
        
        System.out.println("\n**GOOOAL!  Arena Națională ERUPTS!");
        b.scoreHomeGoal(match2);
        printScores(b.getScores());
        
        System.out.println("The referee blows his whistle at Vaalerenga Stadion");
        b.finishGame(match1);
        printResults(b.getResults());

        System.out.println("Game over in Bucuresti");
        b.finishGame(match2);
        
        System.out.println("Final results");
        printResults(b.getResults());
        
    }

}
