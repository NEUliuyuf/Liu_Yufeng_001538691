/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.Personnel;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class EmployeeDirectory {
    ArrayList<EmployeeProfile> employees;
    
    public EmployeeDirectory(){
        employees = new ArrayList();
    }

    public ArrayList<EmployeeProfile> getEmployees() {
        return employees;
    }

    
    public void addEmployee(EmployeeProfile e){
        employees.add(e);
    }
    
    public void setEmployees(ArrayList<EmployeeProfile> employees) {
        this.employees = employees;
    }
    
}
