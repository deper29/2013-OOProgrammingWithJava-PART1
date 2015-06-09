/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deper29
 */
public class Player {
    
    private String name;
    private int numGoals;
    
    public Player(String name){
        this.name = name;
        this.numGoals = 0;
    }
    
    public Player(String name, int numGoals){
        this.name = name;
        this.numGoals = numGoals;
    }
    
    public int goals(){
        return this.numGoals;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "Player: " + this.name + ", goals " + this.numGoals;
    }
    
}
