/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRARY_PROJECT;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BUYABOOK {
    List<BUYABOOK> B = new Vector<>();
    private String bookname;
    private String price;
    

    

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BUYABOOK(String bookname, String price) {
        this.bookname = bookname;
        this.price = price;
    }

    public BUYABOOK() {
    }
    
     DefaultTableModel BUY = new DefaultTableModel();
     public DefaultTableModel getData() {

        BUY.addColumn("BOOKNAME");
        BUY.addColumn("PRICE");
      
        return BUY;

    }
     public void delete(int index) {

        B.remove(index);

    }
     public void add(String bookname, String price) {

        B.add(new BUYABOOK(bookname,price));

     }
     public void update(int Index, String Y, String Z) {
        BUYABOOK x = new BUYABOOK(Y,Z);

        B.set(Index, x);

    }
     
}
