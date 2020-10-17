/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author yufengliu
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private int blanace;
    private Date createDate;

    public Account() {
        this.createDate = new Date();
    }
    
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBlanace() {
        return blanace;
    }

    public void setBlanace(int blanace) {
        this.blanace = blanace;
    }

    public Date getCreateDate() {
        return createDate;
    }
    
    @Override
    public String toString(){
        return bankName;
    }
}
