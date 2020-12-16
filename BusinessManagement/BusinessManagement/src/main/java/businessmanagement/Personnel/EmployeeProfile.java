/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.Personnel;


/**
 *
 * @author 43999
 */
public class EmployeeProfile {
    Person person;
    int employeeID;

    public EmployeeProfile(Person person, int employeeID) {
        this.person = person;
        this.employeeID = employeeID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
   
    
    
}
