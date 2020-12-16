/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.CustomerManagement;

import businessmanagement.MarketModel.Market;
import businessmanagement.OrderManagement.Cart;
import businessmanagement.OrderManagement.OrderList;
import businessmanagement.Personnel.Person;

/**
 *
 * @author 43999
 */
public class CustomerProfile {
    Person person;
    int CustomerID;
    Market market;
    OrderList orderList;
    CustomerAccount customerAccount;
    Cart cart;
    
    public CustomerProfile(Person p, Market m){
        this.person = p;
        this.market = m;
        this.orderList = new OrderList();
        this.cart = new Cart();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    
    
    
    @Override
    public String toString(){
        return person.getName();
    }
}
