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
public class SupplierDirectory {
    ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList();
    }
    
    public void addSupplier(Supplier s){
        supplierList.add(s);
    }
    
    public Supplier getSupplier(Supplier s){
        return s;
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    
    
}
