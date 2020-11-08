/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda.Agenda;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacQu
 */
public class Contact implements Comparable{
    private String firstName,lastName,phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public String toString(){
        return lastName+ " " + " "+firstName+ "\t"+phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    @Override
    public int compareTo(Object o) {
       int result;
       if(lastName.equals(((Contact)o).lastName)){
           result=firstName.compareTo(((Contact)o).firstName);
       }else{
           result=lastName.compareTo(((Contact)o).lastName);
       }
       return result;
    }
   
}
