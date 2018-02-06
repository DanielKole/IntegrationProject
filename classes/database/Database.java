package database;
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

            dbconn= DriverManager.getConnection("jdbc:ucanaccess://"+dbdriver);
            stmt = dbconn.createStatement();
            //You do this
            // Load driver 
            // getConnection(URL) 
            // create Statement 
        }catch (ClassNotFoundException e){   result  = " Error creating database drive class!";
        result += " <br/>" +  e.toString();
        }catch (SQLException e){   result  = " Error processing connect!";
        result += " <br/>" +  e.toString();
        }  return result;


    }

    public String confirm(String fname, String lname, String email, String address, String pnum){


        String theQuery = "INSERT into Customer lastName, firstName, address, email, phone VALUES ("+lname+","+fname+","+address+","+email+","+pnum+");";
        result = connect();//You must create the query
        try{ResultSet rs = stmt.executeQuery(theQuery);
            result = "works";
            rs.close();
        }catch (SQLException e){   result= " Save Customer: Error processing the SQL!";
        result += " <br/>" +  e.toString();
        }finally{close();
        }     
        
        return(result);
        
    }

    private String close(){
        try{  if (dbconn!= null){
            stmt.close();
            dbconn.close();
         }}catch(Exception e){//catch exceptions
         
        }
        return result;
    }
         

        


    

    public void save(){}

    public void setID(){}
}