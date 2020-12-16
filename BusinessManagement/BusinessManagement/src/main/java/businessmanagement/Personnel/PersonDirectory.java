/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.Personnel;

import businessmanagement.CustomerManagement.CustomerProfile;
import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class PersonDirectory {
    ArrayList<Person> persons;
    
    public PersonDirectory(){
        persons = new ArrayList();
    }
    
    public void addPerson(Person p){
        persons.add(p);
    }
    
    public void deletePerson(Person p){
        for (int i = 0; i < persons.size(); i++){
            if(persons.get(i).equals(p)){
                persons.remove(i);
                i--;
            }
        }
    }

    public Person searchPerson(Person p){
        for(Person person: persons){
            if(person.equals(p)){
                return p;
            }
        }
        return null;
    }
    
    

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
    
}
