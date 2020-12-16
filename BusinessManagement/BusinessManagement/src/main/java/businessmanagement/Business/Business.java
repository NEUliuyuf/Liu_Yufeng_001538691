/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.Business;

import businessmanagement.CustomerManagement.CustomerAccount;
import businessmanagement.CustomerManagement.CustomerDirectory;
import businessmanagement.CustomerManagement.CustomerProfile;
import businessmanagement.MarketModel.Channel;
import businessmanagement.MarketModel.ChannelList;
import businessmanagement.MarketModel.Market;
import businessmanagement.MarketModel.MarketList;
import businessmanagement.OrderManagement.MasterOrderList;
import businessmanagement.Personnel.EmployeeDirectory;
import businessmanagement.Personnel.Person;
import businessmanagement.Personnel.PersonDirectory;
import businessmanagement.ProductManagement.Product;
import businessmanagement.ProductManagement.ProductCatalog;
import businessmanagement.ProductManagement.SolutionCatalog;
import businessmanagement.ProductManagement.SolutionOffer;
import businessmanagement.ProductManagement.Supplier;
import businessmanagement.ProductManagement.SupplierDirectory;

/**
 *
 * @author 43999
 */
public class Business {
    public String businessName;
    public PersonDirectory pd;
    public SupplierDirectory sd;
    public MasterOrderList mo;
    public MarketList ml;
    public ChannelList cl;
    public SolutionCatalog sc;
    public ProductCatalog pc;
    public CustomerDirectory cd;
    public EmployeeDirectory ed;
    
    
    public Business(String b){
        businessName = b;
        pd = new PersonDirectory();
        sd = new SupplierDirectory();
        mo = new MasterOrderList();
        ml = new MarketList();
        cl = new ChannelList();
        sc = new SolutionCatalog();
        pc = new ProductCatalog();
        cd = new CustomerDirectory();
        ed = new EmployeeDirectory();
        
        Market market1 = new Market("Boston");
        Market market2 = new Market("Quincy");
        Market market3 = new Market("Dedham");
        Market market4 = new Market("Newton");
        Market market5 = new Market("Brookline");
        Market market6 = new Market("New York");
        this.ml.addMarket(market1);
        this.ml.addMarket(market2);
        this.ml.addMarket(market3);
        this.ml.addMarket(market4);
        this.ml.addMarket(market5);
        this.ml.addMarket(market6);
        
        Person person1 = new Person("Leo","12/12/1997");
        CustomerProfile cp1 = new CustomerProfile(person1,market1);
        CustomerAccount ca1 = new CustomerAccount(cp1.getPerson().getName(),cp1.getPerson().getBirthday());
        cp1.setCustomerAccount(ca1);
        this.ml.searchMarket("Boston").addPerson();
        this.cd.newCustomer(cp1);
        this.pd.addPerson(person1);
        
        Person person2 = new Person("Mike","11/15/1998");
        CustomerProfile cp2 = new CustomerProfile(person2,market2);
        CustomerAccount ca2 = new CustomerAccount(cp2.getPerson().getName(),cp2.getPerson().getBirthday());
        cp2.setCustomerAccount(ca2);
        this.ml.searchMarket("Quincy").addPerson();
        this.cd.newCustomer(cp2);
        this.pd.addPerson(person2);
        
        Person person3 = new Person("Zoe","10/13/1995");
        CustomerProfile cp3 = new CustomerProfile(person3,market3);
        CustomerAccount ca3 = new CustomerAccount(cp3.getPerson().getName(),cp3.getPerson().getBirthday());
        cp3.setCustomerAccount(ca3);
        this.ml.searchMarket("Dedham").addPerson();
        this.cd.newCustomer(cp3);
        this.pd.addPerson(person3);
        
        Person person4 = new Person("Esteban","08/13/2000");
        CustomerProfile cp4 = new CustomerProfile(person4,market4);
        CustomerAccount ca4 = new CustomerAccount(cp4.getPerson().getName(),cp4.getPerson().getBirthday());
        cp4.setCustomerAccount(ca4);
        this.ml.searchMarket("Dedham").addPerson();
        this.cd.newCustomer(cp4);
        this.pd.addPerson(person4);
        
        Person person5 = new Person("Fiona","08/13/2000");
        CustomerProfile cp5 = new CustomerProfile(person5,market6);
        CustomerAccount ca5 = new CustomerAccount(cp5.getPerson().getName(),cp5.getPerson().getBirthday());
        cp5.setCustomerAccount(ca5);
        this.ml.searchMarket("New York").addPerson();
        this.cd.newCustomer(cp5);
        this.pd.addPerson(person5);
        
        Channel channel1 = new Channel("Facebook");
        this.cl.addChannel(channel1);
        
        Channel channel2 = new Channel("Offical website");
        this.cl.addChannel(channel2);
        
        Channel channel3 = new Channel("Store");
        this.cl.addChannel(channel3);
        
        Channel channel4 = new Channel("Ebay");
        this.cl.addChannel(channel4);
        
        Supplier s1 = new Supplier("Apple");
        this.sd.addSupplier(s1);
        
        Supplier s2 = new Supplier("Bose");
        this.sd.addSupplier(s2);
        
        Supplier s3 = new Supplier("Microsoft");
        this.sd.addSupplier(s3);
        
        Product product1 = new Product("iPhone 12",799,"None",s1);
        this.sd.getSupplier(s1).getProductCatalog().addProduct(product1);
        this.pc.addProduct(product1);
        
        Product product2 = new Product("iPhone 12 mini",699,"None",s1);
        this.sd.getSupplier(s1).getProductCatalog().addProduct(product2);
        this.pc.addProduct(product2);
        
        Product product3 = new Product("iPhone 12 pro",999,"None",s1);
        this.sd.getSupplier(s1).getProductCatalog().addProduct(product3);
        this.pc.addProduct(product3);
        
        Product product4 = new Product("SoundLink",179,"None",s2);
        this.sd.getSupplier(s2).getProductCatalog().addProduct(product4);
        this.pc.addProduct(product4);
        
        Product product5 = new Product("Home Speaker",299.95,"None",s2);
        this.sd.getSupplier(s2).getProductCatalog().addProduct(product5);
        this.pc.addProduct(product5);
        
        Product product6 = new Product("A20",995.95,"None",s2);
        this.sd.getSupplier(s2).getProductCatalog().addProduct(product6);
        this.pc.addProduct(product6);
        
        Product product7 = new Product("Xbox X",499.99,"None",s3);
        this.sd.getSupplier(s3).getProductCatalog().addProduct(product7);
        this.pc.addProduct(product7);
        
        Product product8 = new Product("Surface Pro 7",749.99,"None",s3);
        this.sd.getSupplier(s3).getProductCatalog().addProduct(product8);
        this.pc.addProduct(product8);
        
        SolutionOffer solution1 = new SolutionOffer("Boston Bundle 1",899,this.ml.searchMarket("Boston"));
        solution1.addProduct(product2);
        solution1.addProduct(product5);
        this.sc.addSolution(solution1);
        
        SolutionOffer solution2 = new SolutionOffer("For Dedham",1399,this.ml.searchMarket("Dedham"));
        solution2.addProduct(product6);
        solution2.addProduct(product7);
        this.sc.addSolution(solution2);
        
        SolutionOffer solution3 = new SolutionOffer("New York Gamer",1299,this.ml.searchMarket("New York"));
        solution3.addProduct(product5);
        solution3.addProduct(product7);
        solution3.addProduct(product2);
        this.sc.addSolution(solution3);
        
        SolutionOffer solution4 = new SolutionOffer("Boston Bundle 2",1299,this.ml.searchMarket("Boston"));
        solution4.addProduct(product1);
        solution4.addProduct(product8);
        this.sc.addSolution(solution4);
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public PersonDirectory getPd() {
        return pd;
    }

    public void setPd(PersonDirectory pd) {
        this.pd = pd;
    }

    public SupplierDirectory getSd() {
        return sd;
    }

    public void setSd(SupplierDirectory sd) {
        this.sd = sd;
    }

    public MasterOrderList getMo() {
        return mo;
    }

    public void setMo(MasterOrderList mo) {
        this.mo = mo;
    }

    public MarketList getMl() {
        return ml;
    }

    public void setMl(MarketList ml) {
        this.ml = ml;
    }

    public ChannelList getCl() {
        return cl;
    }

    public void setCl(ChannelList cl) {
        this.cl = cl;
    }

    public SolutionCatalog getSc() {
        return sc;
    }

    public void setSc(SolutionCatalog sc) {
        this.sc = sc;
    }

    public ProductCatalog getPc() {
        return pc;
    }

    public void setPc(ProductCatalog pc) {
        this.pc = pc;
    }

    public CustomerDirectory getCd() {
        return cd;
    }

    public void setCd(CustomerDirectory cd) {
        this.cd = cd;
    }

    public EmployeeDirectory getEd() {
        return ed;
    }

    public void setEd(EmployeeDirectory ed) {
        this.ed = ed;
    }
    
}
