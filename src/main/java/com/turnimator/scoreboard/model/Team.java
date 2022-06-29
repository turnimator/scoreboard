/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turnimator.scoreboard.model;

/**
 *
 * @author atle
 */
public class Team {
    private final String _id;
    private final String _name;
    public Team(String id, String name){
        _id = id; _name = name;
    }
    public String getId() { return _id; }
    public String getName() { return _name; }
}
