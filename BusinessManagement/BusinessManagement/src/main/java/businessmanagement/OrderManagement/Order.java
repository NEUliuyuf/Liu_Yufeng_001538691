/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.OrderManagement;

import businessmanagement.CustomerManagement.CustomerProfile;
import businessmanagement.MarketModel.Channel;
import businessmanagement.MarketModel.Market;
import businessmanagement.ProductManagement.Product;
import businessmanagement.ProductManagement.SolutionOffer;

/**
 *
 * @author 43999
 */
public class Order {
    Market market;
    Channel channel;
    CustomerProfile customerProfile;
    int number;
    Product product;
    SolutionOffer solutionOffer;
    
    public Order(Market m, Channel c, CustomerProfile cp, Product p,SolutionOffer so){
        market = m;
        channel = c;
        customerProfile = cp;
        product = p;
        solutionOffer = so;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SolutionOffer getSolutionOffer() {
        return solutionOffer;
    }

    public void setSolutionOffer(SolutionOffer solutionOffer) {
        this.solutionOffer = solutionOffer;
    }
    
    public double getRetailPrice(){
        double price = 0;
        for(Product product : solutionOffer.getProductBundle()){
            price += product.getPrice();
        }
        return price;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int Number) {
        this.number = Number;
    }
    
    @Override
    public String toString(){
        return String.valueOf(number);
    }
}
