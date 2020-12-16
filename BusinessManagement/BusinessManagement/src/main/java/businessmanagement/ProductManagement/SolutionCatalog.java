/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class SolutionCatalog {
    ArrayList<SolutionOffer> solutionOfferList;
    
    public SolutionCatalog(){
        solutionOfferList = new ArrayList();
    }

    public ArrayList<SolutionOffer> getSolutionOfferList() {
        return solutionOfferList;
    }
    
    public void addSolution(SolutionOffer s){
        solutionOfferList.add(s);
    }
    
    public void deleteSolution(SolutionOffer s){
        for (int i = 0; i < solutionOfferList.size(); i++){
            if(solutionOfferList.get(i).equals(s)){
                solutionOfferList.remove(i);
                i--;
            }
        }
    }
}
