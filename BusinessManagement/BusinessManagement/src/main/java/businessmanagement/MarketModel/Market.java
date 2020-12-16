/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.MarketModel;

/**
 *
 * @author 43999
 */
public class Market {
    String area;
    int numberOfPeople;

    public Market(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    
    public void addPerson(){
        numberOfPeople += 1;
    }
    
    @Override
    public String toString(){
        return area;
    }
}
