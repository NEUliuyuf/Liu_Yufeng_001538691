/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class ProductCatalog {
    ArrayList<Product> productCatalog;
    static int id = 1;
    
    public ProductCatalog(){
        productCatalog = new ArrayList();
    }
    
    public void addProduct(Product p){
        productCatalog.add(p);
        if(p.id < 0){
            p.setId(id);
            id += 1;
        }
    }
    
    public void deleteProdcut(Product product){
        for (int i = 0; i < productCatalog.size(); i++){
            if(productCatalog.get(i).equals(product)){
                productCatalog.remove(i);
                i--;
            }
        }
    }
    
    public Product searchProductByName(String Name, int id){
        for(Product p : productCatalog){
            if(p.name.equals(Name) && p.id == id){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    
    
}
