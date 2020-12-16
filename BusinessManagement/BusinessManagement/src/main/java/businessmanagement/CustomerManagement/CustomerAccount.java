/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.CustomerManagement;

import businessmanagement.CustomerManagement.CustomerProfile;
import businessmanagement.OrderManagement.OrderList;

/**
 *
 * @author 43999
 */
public class CustomerAccount {
    String userName;
    String passWord;
    

    public CustomerAccount(String u, String p) {
        userName = u;
        passWord = p;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    
    
}
