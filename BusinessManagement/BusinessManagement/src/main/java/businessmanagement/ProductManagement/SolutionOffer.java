/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.ProductManagement;

import businessmanagement.MarketModel.Channel;
import businessmanagement.MarketModel.Market;
import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class SolutionOffer {
    double price;
    ArrayList<Product> productBundle;
    Market market;
    String name;
    
    public SolutionOffer(String n,double p, Market m){
        price = p;
        name = n;
        market = m;
        productBundle = new ArrayList();
    }
    
    public void addProduct(Product p){
        productBundle.add(p);
    }
    
    public void deletProduct(Product p){
        for (int i = 0; i < productBundle.size(); i++){
            if(productBundle.get(i).equals(p)){
                productBundle.remove(i);
                i--;
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Product> getProductBundle() {
        return productBundle;
    }

    public void setProductBundle(ArrayList<Product> productBundle) {
        this.productBundle = productBundle;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
