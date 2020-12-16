/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.OrderManagement;

import businessmanagement.CustomerManagement.CustomerProfile;
import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class OrderList {
    ArrayList<Order> orderList;
    
    
    public OrderList(){
        orderList = new ArrayList();
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
    public void deletOrder(Order o){
        for (int i = 0; i < orderList.size(); i++){
            if(orderList.get(i).equals(o)){
                orderList.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    
}
