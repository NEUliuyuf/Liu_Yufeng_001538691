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
public class Supplier {
    String supplierName;
    ProductCatalog productCatalog;

    public Supplier(String sm) {
        this.supplierName = sm;
        productCatalog = new ProductCatalog();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    @Override
    public String toString(){
        return supplierName;
    }
    
}
