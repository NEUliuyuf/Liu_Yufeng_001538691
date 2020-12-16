/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.CustomerManagement;

import businessmanagement.Business.Business;
import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class CustomerDirectory {
    ArrayList<CustomerProfile> customers;
    int id = 1;

    public CustomerDirectory() {
        customers = new ArrayList();
    }
    
    public void newCustomer(CustomerProfile c){
        c.CustomerID = id;
        customers.add(c);
        id += 1;
    }
    
    public void deletCustomer(CustomerProfile c){
        for (int i = 0; i < customers.size(); i++){
            if(customers.get(i) == c){
                customers.remove(i);
                i--;
            }
        }
    }
    
    
    public CustomerProfile searchCustomerByID(int cID){
        for (CustomerProfile cp:customers){
            if(cp.CustomerID == cID){
                return cp;
            }
        }
        return null;
    }

    public ArrayList<CustomerProfile> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<CustomerProfile> customers) {
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
