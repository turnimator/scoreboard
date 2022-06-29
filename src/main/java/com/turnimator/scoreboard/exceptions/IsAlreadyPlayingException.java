/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turnimator.scoreboard.exceptions;

/**
 *
 * @author atle
 */
public class IsAlreadyPlayingException extends Exception {

    public IsAlreadyPlayingException() {
        super("Team is already playing a game");
    }
    
}
