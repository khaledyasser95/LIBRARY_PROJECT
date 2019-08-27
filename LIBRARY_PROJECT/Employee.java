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
public class Employee {

    private String Name;
    private String ID;
    private String Salary;
    private String department;

    public Employee(String ID, String Name, String Salary, String department) {
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
        this.department = department;

    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getSalary() {
        return Salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return "Name: " + Name + " ID: " + ID + " Salary: " + Salary + " Department: " + department;
    }
List<Employee>  ArrayEmp=new Vector<>();
    

    public Employee() {
    }
        public void print()
        {
            
        for (Employee s : ArrayEmp) 
            System.out.println(s);
        }
        
          DefaultTableModel Tb = new DefaultTableModel();

    public DefaultTableModel getData() {
        
        Tb.addColumn("Name");
        Tb.addColumn("ID");
        Tb.addColumn("Salary ");
        Tb.addColumn("Department");

    
        return Tb;

    }
        
        public void add(String Name,String ID,String Salary , String Department) {
        
        
            ArrayEmp.add(new Employee(Name, ID, Salary, Department));
            

        
    } 
        
        
         public void delete (int index){
     
        ArrayEmp.remove(index);
          
    }
        
       public void update (int Index,String Name, String ID, String Salary, String Department){
       Employee x = new Employee( Name,  ID,  Salary,  Department );
       
        ArrayEmp.set(Index, x);
        
    } 
        
        
        
        
        
        }





