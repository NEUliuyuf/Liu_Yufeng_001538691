/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election.VoteSelection;

import election.Admin.Seat;
import election.Persona.Person;
import java.io.File;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class VoterProfile {
    public Person person;
    String party;
    Selfie selfie;
    boolean voted; 
    
    HashMap<Seat, Vote> votes;
    
    public VoterProfile(Person p){
        person = p;
        votes = new HashMap<Seat, Vote>();
        voted = false;
        
    }
    public void newVoteForSeat(Seat s){
        
        Vote v = new Vote(this, s);
        votes.put(s, v);
        
    }
    
    public void addSelfie(File file){
        this.selfie = new Selfie(file);
    }
    
    public boolean getVoted(){
        return this.voted;  // check voted or not
    }
    
    public boolean setVoted(boolean b){
        this.voted = b;
        return this.voted;
    }
    
    
}
