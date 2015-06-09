
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deper29
 */
public class Team {
    
    private String name;
    private ArrayList<Player> roster;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.maxSize = 16;
        this.roster = new ArrayList<Player>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(this.roster.size() == maxSize){
            return;
        }
        this.roster.add(player);
    }
    
    public void printPlayers(){
        for (Player p : this.roster){
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.roster.size();
    }
    
    public int goals(){
        int goals = 0;
        for (Player p : this.roster){
            goals += p.goals();
        }
        return goals;
    }
}
