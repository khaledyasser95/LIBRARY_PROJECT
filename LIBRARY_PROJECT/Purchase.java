/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class Purchase {
List <Purchase> P = new Vector<>();
    private String nameofbook;
    
    private int noofbooksavailable;
    private float price;
    private int noofbookspurchased;
    private String nameofCust;
    public Purchase(String nameofCust,String nameofbook, float price) {
        this.nameofbook = nameofbook;
        this.price = price;
        this.nameofCust = nameofCust;
       
    }

    public String getNameofbook() {
        return nameofbook;
    }

    public int getNoofbooksavailable() {
        return noofbooksavailable;
    }

    public float getPrice() {
        return price;
    }

    public int getNoofbookspurchased() {
        return noofbookspurchased;
    }

    public String getNameofCust() {
        return nameofCust;
    }
    

   
    Books Book = new Books();

    public Purchase() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return " No of books available" + noofbooksavailable + " Price: " + price + " No of books purchased: " + noofbookspurchased ;
    }
public void addP(String NameofCustomer, String NameofBook, float Price) {
        P.add(new Purchase(NameofCustomer, NameofBook, Price));

    }
public void updateP(int Index,String NameofCustomer, String NameofBook, float Price) {
        Purchase x = new Purchase(NameofCustomer, NameofBook, Price);
        P.set(Index, x);

    }
 public void delete(int index) {

        P.remove(index);

    }
    DefaultTableModel tb = new DefaultTableModel();

    public DefaultTableModel getData() {
        tb.addColumn("Name of Customer");
        tb.addColumn("Name of Book ");
        tb.addColumn("Pirce");
        
        return tb;

    }
    

}
