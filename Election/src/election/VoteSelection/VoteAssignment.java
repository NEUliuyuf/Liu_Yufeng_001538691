/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election.VoteSelection;

import election.Admin.CandidateSeatAssignment;

/**
 *
 * @author yufengliu
 */
public class VoteAssignment {
    Vote vote;
    CandidateSeatAssignment candidateSeatAssignment;
    
    
    public VoteAssignment(Vote v){
        vote = v;
    }
    
    public boolean assignVote(CandidateSeatAssignment candidateSeatAssignment){
        if (vote.voterprofile.getVoted() == false){
            candidateSeatAssignment.castVoteForCandidate(vote);
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
