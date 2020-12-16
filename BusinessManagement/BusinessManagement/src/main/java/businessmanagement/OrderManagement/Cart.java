/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.OrderManagement;

import businessmanagement.MarketModel.Channel;
import businessmanagement.MarketModel.Market;
import businessmanagement.ProductManagement.Product;
import businessmanagement.ProductManagement.SolutionOffer;
import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class Cart {
    ArrayList<Product> products;
    ArrayList<SolutionOffer> bundles;
    Market market;
    Channel channel;
    
    public Cart(){
        products = new ArrayList();
        bundles = new ArrayList();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    public void addBundle(SolutionOffer solutionOffer){
        bundles.add(solutionOffer);
    }
    
    public void deleteProduct(Product product){
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).equals(product)){
                products.remove(i);
                i--;
            }
        }
    }
    
    public void deleteBundle(SolutionOffer solutionOffer){
        for (int i = 0; i < bundles.size(); i++){
            if(bundles.get(i).equals(solutionOffer)){
                bundles.remove(i);
                i--;
            }
        }
    }
    
    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<SolutionOffer> getBundles() {
        return bundles;
    }

    public void setBundles(ArrayList<SolutionOffer> bundles) {
        this.bundles = bundles;
    }
    
    
    
    
}
