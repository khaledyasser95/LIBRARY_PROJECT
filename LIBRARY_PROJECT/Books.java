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
public class Books {

    private String Name;
    private String Author;
    private String Borrow;
    private String department;
    private float price;
    private int Nobooks;

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setBorrow(String Borrow) {
        this.Borrow = Borrow;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBorrow() {
        return Borrow;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return Name;
    }

    public Books(String Name, String Author, String department, String Borrow,float Price , int noofbooks) {
        this.Name = Name;
        this.Author = Author;
        this.Borrow = Borrow;
        this.department = department;
        this.price = Price;
        this.Nobooks=noofbooks;
        

    }

    public Books() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return "Name " + Name + " Author: " + Author + " Borrow: " + Borrow + " Department: " + department;
    }
    List<Books> ArrayB = new Vector<>();

    public void addbook(String Name, String Author, String Department, String borrow,float price , int noofbooks) {
        ArrayB.add(new Books(Name, Author, Department, borrow,price,noofbooks));

    }

    public void update(int Index, String Name, String Author, String Department, String borrow,float price , int noofbooks) {
        Books x = new Books(Name, Author, Department,borrow, price,noofbooks);

        ArrayB.set(Index, x);

    }
public void update2(int Index,int noofbooks) {
        Books x = new Books(noofbooks); 

        ArrayB.set(Index, x);

    }

    public Books(int Nobooks) {
        this.Nobooks = Nobooks;
    }
    public float getPrice() {
        return price;
    }

    public int getNobooks() {
        return Nobooks;
    }

    public void print() {

        for (Books s : ArrayB) {
            System.out.println(s);

        }

    }

    public void delete(int index) {

        ArrayB.remove(index);

    }

    DefaultTableModel tb = new DefaultTableModel();

    public DefaultTableModel getData() {

        tb.addColumn("Name");
        tb.addColumn("Author");
        tb.addColumn("Department");
        tb.addColumn("Borrowed");
        tb.addColumn("Price");
        tb.addColumn("Number of Books");

        return tb;

    }
    public DefaultTableModel getData2() {

        tb.addColumn("Name");
        tb.addColumn("Price");
        tb.addColumn("Number of Books");

        return tb;

    }
}
