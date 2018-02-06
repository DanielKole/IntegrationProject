package model;
import  java.sql.*;
import java.util.*;

import javax.management.Query;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

//import net.ucanaccess.jdbc.*;

public class Database {
    private Statement stmt= null;
    private Connection dbconn= null;
    private String result   = "OK";
    private String dburl= "jdbc:odbc:WACKO";
    private String dbdriver = "C:/Program Files (x86)/Apache Software Foundation/Tomcat 7.0/webapps/BalzerE/WACKO.accdb";

    private String connect(){

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();
            dbconn= DriverManager.getConnection("jdbc:ucanaccess://"+dbdriver,"","");
            stmt = dbconn.createStatement();

            result = "Database Connected";
            //You do this
            // Load driver 
            // getConnection(URL) 
            // create Statement 
        }catch (ClassNotFoundException e){   result  = " Error creating database drive class!";
        result += " <br/>" +  e.toString();
        }catch (SQLException e){   result  = " Error processing connect!";
        result += " <br/>" +  e.toString();
        }catch (Exception e){
        result += "Didnt work!!";
        
        }  return result;
    }

    

    public String confirm(String fname, String lname, String email, String address, String pnum){

        String 2ndQuery = String.format("SELECT customerID from Customer WHERE lastname and ")
        String theQuery = String.format("INSERT into Customer (lastName, firstName, address, email, phone) VALUES ('%s','%s','%s','%s','%s');",lname,fname,email,address,pnum);
        result = connect();//You must create the query
        try{int rs = stmt.executeUpdate(theQuery);
            
            result = "works"+Integer.toString(rs);
        }catch (SQLException e){   result+= " Save Customer: Error processing the SQL!";
        result += " <br/>" +  e.toString();
        }finally{close();
            
        }     
        
        return(result);
        
    }

    private String close(){
        try{  if (dbconn!= null){
            stmt.close();
            dbconn.close();
            result+= "DB Closed";
         }}catch(Exception e){//catch exceptions
         result+= "Error in Closing";
        }
        return result;
    }
         

        


    

    public void save(){}

    public void setID(){}
}