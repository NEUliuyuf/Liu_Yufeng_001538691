/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.OrderManagement;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class MasterOrderList {
    ArrayList<Order> masterOrderList;
    static int orderNum = 0;
    

    public MasterOrderList() {
        masterOrderList = new ArrayList();
    }
    
    public void addOrder(Order o){
        orderNum += 1;
        o.setNumber(orderNum);
        masterOrderList.add(o);
    }
    
    public void deletOrder(Order o){
        for (int i = 0; i < masterOrderList.size(); i++){
            if(masterOrderList.get(i).equals(o)){
                masterOrderList.remove(i);
                
                i--;
            }
        }
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrder(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    
    
    
    
}
