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
public class Order {
    private String nameofc;
    private String bookname;
    private String address;
    
    
    

    public String getNameofc() {
        return nameofc;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAddress() {
        return address;
    }

    public void setNameofc(String nameofc) {
        this.nameofc = nameofc;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Order(String nameofc,String bookname, String address){
        this.nameofc = nameofc;
        this.bookname = bookname;
        this.address= address;
}
    public Order (){
    }
    @Override 
    public String toString() {
		// TODO Auto-generated method stub

		return "Name of customer: "+nameofc+ " Book name: "+ bookname+ " Address of customer: "+ address;
	}
    List<Order> ArrayO = new Vector<>();

 public void addorder(String nameofc, String bookname, String address) {
        ArrayO.add(new Order(nameofc, bookname, address));
        
    }
 public void print()
        {
        
         for (Order x : ArrayO) {
            System.out.println(x);
        }
        }
 
 
 DefaultTableModel Tb = new DefaultTableModel();

    public DefaultTableModel getData() {
        
        Tb.addColumn("Nameofc");
        Tb.addColumn("Bookname");
        Tb.addColumn("Address");
        

    
        return Tb;

    }

    
        
        public void delete (int index){
     
        ArrayO.remove(index);
          
    }
        
       public void update (int Index,String nameofc, String bookname, String address){
        Order x = new Order( nameofc,  bookname,  address);
       
       ArrayO.set(Index, x);
        
    } 
        
 
 
 
 
 
 
 
}

