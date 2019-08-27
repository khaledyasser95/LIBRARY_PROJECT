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
public class Events {
    private String author;
    private String date;
    private String bevent;

 
public void setauthor(String author)
{ this.author=author;
}

public String getauthor()
{ return author;
}

public void setdate(String date)
{ this.date=date;
}

public String getdate()
{ return date;

}


public void setbevent(String bevent)
{ this.bevent=bevent;
}

public String getbevent()
{ return bevent;
}


public Events(String author,String date, String bevent){
        this.author = author;
        this.date = date;
        this.bevent= bevent;
}
  public Events(){
      
  }       
@Override
public String toString() {
		// TODO Auto-generated method stub

		return "Author: "+author+ " Date: "+ date+ " Book discussed: "+ bevent;
	}
List<Events> ArrayE = new Vector<>();

 public void addEvent(String Author, String Date, String bevent) {
        ArrayE.add(new Events(Author, Date, bevent));
        
    }

 public void print()
        {
        
         for (Events s : ArrayE) {
            System.out.println(s);
        }
        }
 
 DefaultTableModel Tb = new DefaultTableModel();

    public DefaultTableModel getData() {
        
        Tb.addColumn("Author");
        Tb.addColumn("Date");
        Tb.addColumn("bevent");
        
        
        return Tb;

    }

    
        
        public void delete (int index){
     
        ArrayE.remove(index);
          
    }
 
 
 public void update (int Index,String Author, String Date, String bevent){
        Events x = new Events( Author,  Date,  bevent);
       
        ArrayE.set(Index, x);
        
    }
}