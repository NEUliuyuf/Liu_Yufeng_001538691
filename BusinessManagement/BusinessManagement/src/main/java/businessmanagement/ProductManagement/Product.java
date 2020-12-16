/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.ProductManagement;

/**
 *
 * @author 43999
 */
public class Product {
    String name;
    int id = -1;
    double price;
    String expireDate;
    Supplier supplier;

    public Product(String name, double price, String expireDate,Supplier s) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.expireDate = expireDate;
        supplier = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Supplier getSupplier() {
        return supplier;
    }

    
    
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
