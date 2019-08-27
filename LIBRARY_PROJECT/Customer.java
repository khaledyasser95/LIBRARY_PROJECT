/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class Customer {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String phonenumber;
    private String cardID;
    private String email;

    public Customer(String Name, String phonenumber, String cardID, String email) {
        this.Name = Name;
        this.phonenumber = phonenumber;
        this.cardID = cardID;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "Name=" + Name + ", phonenumber=" + phonenumber + ", cardID=" + cardID + ", email=" + email + '}';
    }
    
   List<Customer>  ArrayC=new Vector<>();
    public void add(String Name,String phonenumber,String cardID, String email) {
        
        
            ArrayC.add(new Customer(Name, phonenumber, cardID, email));
            

        
    }
    DefaultTableModel Tb = new DefaultTableModel();

    public DefaultTableModel getData() {
        
        Tb.addColumn("Name");
        Tb.addColumn("Phonenumber");
        Tb.addColumn("CardID");
        Tb.addColumn("Email");

    
        return Tb;

    }

    public Customer() {
    }
        public void print()
        {
            
        for (Customer s : ArrayC) 
            System.out.println(s);
        }
        
        
        public void delete (int index){
     
        ArrayC.remove(index);
          
    }
        
       public void update (int Index,String Name, String Phonenumber, String CardID, String email){
        Customer x = new Customer( Name, Phonenumber,  CardID,  email);
       
        ArrayC.set(Index, x);
        
    } 
        
        }
    

