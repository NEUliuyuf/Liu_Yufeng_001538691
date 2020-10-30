/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election;

import election.Admin.CandidateSeatAssignment;
import election.Admin.Election;
import election.Admin.Seat;
import election.Area.District;
import election.Persona.CandidateDirectory;
import election.Persona.CandidateProfile;
import election.Persona.PersonDirectory;
import election.VoteSelection.Vote;
import election.VoteSelection.VoteAssignment;
import election.VoteSelection.VoterDirectory;
import election.VoteSelection.VoterProfile;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class ElectionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        District d_Boston = new District("Boston");     
        District d_NewYork = new District("New York");
        
        Election e_Boston = new Election(d_Boston);    // boston election
        Election e_NewYork = new Election(d_NewYork);   // new york election
        
        PersonDirectory pd = new PersonDirectory();
        
        pd.newPerson("001"); // candidate for President
        pd.newPerson("002"); // candidate for President
        
        pd.newPerson("003"); // candidate for Vice President
        pd.newPerson("004"); // candidate for Vice President
        pd.newPerson("005"); // candidate for Vice President
        
        pd.newPerson("006"); // Voter in Boston
        pd.newPerson("007"); // Voter in Boston
        pd.newPerson("008"); // Voter in Boston
        pd.newPerson("009"); // Voter in Boston
        pd.newPerson("010"); // Voter in Boston
        pd.newPerson("011"); // Voter in Boston
        pd.newPerson("012"); // Voter in Boston
        pd.newPerson("013"); // Voter in Boston
        pd.newPerson("014"); // Voter in Boston
        pd.newPerson("015"); // Voter in Boston
        pd.newPerson("016"); // Voter in Boston
        
        pd.newPerson("017"); // Voter in New York
        pd.newPerson("018"); // Voter in New York
        pd.newPerson("019"); // Voter in New York
        pd.newPerson("020"); // Voter in New York
        pd.newPerson("021"); // Voter in New York
        pd.newPerson("022"); // Voter in New York
        pd.newPerson("023"); // Voter in New York
        pd.newPerson("024"); // Voter in New York
        pd.newPerson("025"); // Voter in New York
        pd.newPerson("026"); // Voter in New York
        pd.newPerson("027"); // Voter in New York
        pd.newPerson("028"); // Voter in New York
        pd.newPerson("029"); // Voter in New York
        pd.newPerson("030"); // Voter in New York
        
        CandidateDirectory cd_Boston = new CandidateDirectory(e_Boston);
        CandidateDirectory cd_NewYork = new CandidateDirectory(e_NewYork);
        
        CandidateProfile B001 = cd_Boston.newCandidateProfile(pd.findPerson("001"));// President
        CandidateProfile B002 = cd_Boston.newCandidateProfile(pd.findPerson("002"));// President
        
        CandidateProfile B003 = cd_Boston.newCandidateProfile(pd.findPerson("003"));// vice President
        CandidateProfile B004 = cd_Boston.newCandidateProfile(pd.findPerson("004"));// vice President
        CandidateProfile B005 = cd_Boston.newCandidateProfile(pd.findPerson("005"));// vice President
        
        CandidateProfile N001 = cd_NewYork.newCandidateProfile(pd.findPerson("001"));// President
        CandidateProfile N002 = cd_NewYork.newCandidateProfile(pd.findPerson("002"));// President
        
        CandidateProfile N003 = cd_NewYork.newCandidateProfile(pd.findPerson("003"));// vice President
        CandidateProfile N004 = cd_NewYork.newCandidateProfile(pd.findPerson("004"));// vice President
        CandidateProfile N005 = cd_NewYork.newCandidateProfile(pd.findPerson("005"));// vice President
        
        Seat bostonSeatPresident = e_Boston.newSeat(1, "President");
        Seat bostonSeatVicePresident = e_Boston.newSeat(2, "Vice President");
        
        Seat newYorkSeatPresident = e_NewYork.newSeat(1, "President");
        Seat newYorkSeatVicePresident = e_NewYork.newSeat(2, "Vice President");
        
        e_Boston.assignCandidateToASeat("President", 1, B001);
        e_Boston.assignCandidateToASeat("President", 1, B002);
        e_Boston.assignCandidateToASeat("Vice President", 2, B003);
        e_Boston.assignCandidateToASeat("Vice President", 2, B004);
        e_Boston.assignCandidateToASeat("Vice President", 2, B005);
        
        e_NewYork.assignCandidateToASeat("President", 1, N001);
        e_NewYork.assignCandidateToASeat("President", 1, N002);
        e_NewYork.assignCandidateToASeat("Vice President", 2, N003);
        e_NewYork.assignCandidateToASeat("Vice President", 2, N004);
        e_NewYork.assignCandidateToASeat("Vice President", 2, N005);
        
        VoterProfile v006 = new VoterProfile(pd.findPerson("006"));
        VoterProfile v007 = new VoterProfile(pd.findPerson("007"));
        VoterProfile v008 = new VoterProfile(pd.findPerson("008"));
        VoterProfile v009 = new VoterProfile(pd.findPerson("009"));
        VoterProfile v010 = new VoterProfile(pd.findPerson("010"));
        VoterProfile v011 = new VoterProfile(pd.findPerson("011"));
        VoterProfile v012 = new VoterProfile(pd.findPerson("012"));
        VoterProfile v013 = new VoterProfile(pd.findPerson("013"));
        VoterProfile v014 = new VoterProfile(pd.findPerson("014"));
        VoterProfile v015 = new VoterProfile(pd.findPerson("015"));
        VoterProfile v016 = new VoterProfile(pd.findPerson("016"));
        VoterProfile v017 = new VoterProfile(pd.findPerson("017"));
        VoterProfile v018 = new VoterProfile(pd.findPerson("018"));
        VoterProfile v019 = new VoterProfile(pd.findPerson("019"));
        VoterProfile v020 = new VoterProfile(pd.findPerson("020"));
        VoterProfile v021 = new VoterProfile(pd.findPerson("021"));
        VoterProfile v022 = new VoterProfile(pd.findPerson("022"));
        VoterProfile v023 = new VoterProfile(pd.findPerson("023"));
        VoterProfile v024 = new VoterProfile(pd.findPerson("024"));
        VoterProfile v025 = new VoterProfile(pd.findPerson("025"));
        VoterProfile v026 = new VoterProfile(pd.findPerson("026"));
        VoterProfile v027 = new VoterProfile(pd.findPerson("027"));
        VoterProfile v028 = new VoterProfile(pd.findPerson("028"));
        VoterProfile v029 = new VoterProfile(pd.findPerson("029"));
        VoterProfile v030 = new VoterProfile(pd.findPerson("030"));
        
        VoterDirectory vd = new VoterDirectory();
        
        vd.newVoter(v006);
        vd.newVoter(v007);
        vd.newVoter(v008);
        vd.newVoter(v009);
        vd.newVoter(v010);
        vd.newVoter(v011);
        vd.newVoter(v012);
        vd.newVoter(v013);
        vd.newVoter(v014);
        vd.newVoter(v015);
        vd.newVoter(v016);
        vd.newVoter(v017);
        vd.newVoter(v018);
        vd.newVoter(v019);
        vd.newVoter(v020);
        vd.newVoter(v021);
        vd.newVoter(v022);
        vd.newVoter(v023);
        vd.newVoter(v024);
        vd.newVoter(v025);
        vd.newVoter(v026);
        vd.newVoter(v027);
        vd.newVoter(v028);
        vd.newVoter(v029);
        vd.newVoter(v030);
       
        CandidateSeatAssignment csaBoston_President_001 = new CandidateSeatAssignment(B001,e_Boston.findSeat("President",1));
        CandidateSeatAssignment csaBoston_President_002 = new CandidateSeatAssignment(B002,e_Boston.findSeat("President",1));
        CandidateSeatAssignment csaBoston_VicePresident_003 = new CandidateSeatAssignment(B003,e_Boston.findSeat("Vice President",2));
        CandidateSeatAssignment csaBoston_VicePresident_004 = new CandidateSeatAssignment(B004,e_Boston.findSeat("Vice President",2));
        CandidateSeatAssignment csaBoston_VicePresident_005 = new CandidateSeatAssignment(B005,e_Boston.findSeat("Vice President",2));
        
        CandidateSeatAssignment csaNewYork_President_001 = new CandidateSeatAssignment(N001,e_NewYork.findSeat("President",1));
        CandidateSeatAssignment csaNewYork_President_002 = new CandidateSeatAssignment(N002,e_NewYork.findSeat("President",1));
        CandidateSeatAssignment csaNewYork_VicePresident_003 = new CandidateSeatAssignment(N003,e_NewYork.findSeat("Vice President",2));
        CandidateSeatAssignment csaNewYork_VicePresident_004 = new CandidateSeatAssignment(N004,e_NewYork.findSeat("Vice President",2));
        CandidateSeatAssignment csaNewYork_VicePresident_005 = new CandidateSeatAssignment(N005,e_NewYork.findSeat("Vice President",2));
        
        
        
        for(int i = 0; i < 25; i++){
            Random random = new Random();
            int a = random.nextInt(2);
            int b = random.nextInt(3);
            VoterProfile vp = vd.voterList.get(i);
            if (i < 11){
                if(a == 0){
                    
                    Vote v = new Vote(vp,e_Boston.findSeat("President",1));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaBoston_President_001);

                }else if(a == 1){
                    
                    Vote v = new Vote(vp,e_Boston.findSeat("President",1));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaBoston_President_002);
                }
                if(b == 0){
                    
                    Vote v = new Vote(vp,e_Boston.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean success = va.assignVote(csaBoston_VicePresident_003);
              
                }else if(b == 1){
                    
                    Vote v = new Vote(vp,e_Boston.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaBoston_VicePresident_004);
                }else if(b == 2){
                    
                    Vote v = new Vote(vp,e_Boston.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaBoston_VicePresident_005);
                }
                
            }else{
                if(a == 0){
                    
                    Vote v = new Vote(vp,e_NewYork.findSeat("President",1));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaNewYork_President_001);

                }else if(a == 1){
                    
                    Vote v = new Vote(vp,e_NewYork.findSeat("President",1));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaNewYork_President_002);
                }
                if(b == 0){
                    
                    Vote v = new Vote(vp,e_NewYork.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean success = va.assignVote(csaNewYork_VicePresident_003);
              
                }else if(b == 1){
                    
                    Vote v = new Vote(vp,e_NewYork.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaNewYork_VicePresident_004);
                }else if(b == 2){
                    
                    Vote v = new Vote(vp,e_NewYork.findSeat("Vice President",2));
                    VoteAssignment va = new VoteAssignment(v);
                    Boolean Success = va.assignVote(csaNewYork_VicePresident_005);
                }
            }
        }
        
        System.out.println("Boston vote 001 for president: " + csaBoston_President_001.receivedvotes.size());
        System.out.println("Boston vote 002 for president: " + csaBoston_President_002.receivedvotes.size());
        System.out.println("Boston vote 003 for vice president: " + csaBoston_VicePresident_003.receivedvotes.size());
        System.out.println("Boston vote 004 for vice president: " + csaBoston_VicePresident_004.receivedvotes.size());
        System.out.println("Boston vote 005 for vice president: " + csaBoston_VicePresident_005.receivedvotes.size());
        
        System.out.println("New York vote 001 for president: " + csaNewYork_President_001.receivedvotes.size());
        System.out.println("New York vote 002 for president: " + csaNewYork_President_002.receivedvotes.size());
        System.out.println("New York vote 003 for vice president: " + csaNewYork_VicePresident_003.receivedvotes.size());
        System.out.println("New York vote 004 for vice president: " + csaNewYork_VicePresident_004.receivedvotes.size());
        System.out.println("New York vote 005 for vice president: " + csaNewYork_VicePresident_005.receivedvotes.size());
        
        System.out.println("first person to vote for president in Boston is: " + csaBoston_President_001.receivedvotes.get(0).voterprofile.person.getPersonId());
        
    }
    
}