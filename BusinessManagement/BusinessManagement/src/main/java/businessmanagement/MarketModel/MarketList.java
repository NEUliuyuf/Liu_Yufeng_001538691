/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class MarketList {
    ArrayList<Market> marketList;

    public MarketList() {
        marketList = new ArrayList();
    }
    
    public void addMarket(Market m){
        marketList.add(m);
    }
    
    public Market searchMarket(String name){
        for (Market m : marketList){
            if(m.getArea().equals(name)){
                return m;
            }
        }
        return null;
    }
    
    public void DeleteMarket(Market m){
        for (int i = 0; i < marketList.size(); i++){
            if(marketList.get(i).equals(m)){
                marketList.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }
    

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
    
 
    
    
}
