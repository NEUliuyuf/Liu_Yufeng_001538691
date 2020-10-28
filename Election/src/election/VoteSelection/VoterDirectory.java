/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election.VoteSelection;

import java.util.ArrayList;

/**
 *
 * @author yufengliu
 */
public class VoterDirectory {
    public ArrayList<VoterProfile> voterList;
    
    public VoterDirectory(){
        voterList = new ArrayList();
    }
    
    public void newVoter(VoterProfile v){
        voterList.add(v);
    }
}
