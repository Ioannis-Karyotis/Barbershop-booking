/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koureio;

/**
 *
 * @author john
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Table_Creation {
    static String     DdriverClassName = "org.apache.derby.jdbc.ClientDriver" ;
    static String     Durl = "jdbc:derby://localhost:1527/Koureio" ;
    static Connection DdbConnection = null;
    static String     Dusername = "tejohny";
    static String     Dpasswd = "margoleta16";
    static Statement  Dstatement       = null;

    public static void main (String[] argv) throws Exception
    {
        Class.forName (DdriverClassName); 
        System.out.println(Dusername + " "+ Dpasswd+" "+ Durl);
        DdbConnection = DriverManager.getConnection (Durl, Dusername, Dpasswd);
        Dstatement    = DdbConnection.createStatement();
        try{
       
        Dstatement.executeUpdate("drop TABLE REQUEST");     
        Dstatement.executeUpdate("drop TABLE APPOINTMENT");
        Dstatement.executeUpdate("drop TABLE AVAILABILITY");
        Dstatement.executeUpdate("drop TABLE HAIRDRESSER");
        Dstatement.executeUpdate("drop TABLE USERS");
       
        Dstatement.executeUpdate("CREATE TABLE USERS ( " +
                                " username varchar(30) not null primary key, "
                              + " password varchar(30), "
                              + " name varchar(30),"
                              + " surname varchar(30),"
                              + " phone varchar(30),"
                              + " address varchar(30),"
                              + " type varchar(30))" );
       
        System.out.println("Table USERS created successfully");
        
        Dstatement.executeUpdate("CREATE TABLE HAIRDRESSER ( " +
                                " hid varchar(20) not null primary key, "
                              + " name varchar(30), "
                              + " surname varchar(30)) ");
        
        System.out.println("Table HAIRDRESSER created successfully");
       
        Dstatement.executeUpdate("CREATE TABLE AVAILABILITY ( " +
                                " hid varchar(20) not null, "
                              + " time varchar(30) not null , "
                              + " day varchar(30) not null , "
                              + " avail varchar(10) not null, "
                              + " foreign key(hid) references HAIRDRESSER(hid)," 
                              + " primary key(hid,time,day))");
        
        System.out.println("Table AVAILABILITY created successfully");
        
        Dstatement.executeUpdate("CREATE TABLE APPOINTMENT ( " +
                                " username varchar(30) not null, "
                              + " hid varchar(20) not null, "
                              + " time varchar(30) not null, "
                              + " day varchar(30) not null, "
                              + " foreign key(username) references USERS(username) on delete restrict,"
                              + " foreign key(hid,time,day) references AVAILABILITY(hid,time,day),"
                              + " primary key(username,hid,time,day))");
        
        System.out.println("Table APPOINTMENT created successfully");
        
        Dstatement.executeUpdate("CREATE TABLE REQUEST ( " +
                                " username varchar(30) not null, "
                              + " hid varchar(20) not null, "
                              + " time varchar(30) not null, "
                              + " day varchar(30) not null, "
                              + " foreign key(username) references USERS(username) on delete restrict,"
                              + " foreign key(hid,time,day) references AVAILABILITY(hid,time,day),"
                              + " primary key(username,hid,time,day))");
        
        System.out.println("Table REQUEST created successfully");
        }catch(SQLException ex){
            
        } 
         Dstatement.close();
         DdbConnection.close();
    }
   
}