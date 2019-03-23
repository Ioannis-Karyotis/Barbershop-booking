/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koureio;

import java.sql.*;

public class Insertion {
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
            Dstatement.executeUpdate("insert INTO USERS (username,password,name,surname,phone,address,type) VALUES ('tejohny','margoleta16','John','Kariotis','6944167533','Distomou 9','Administrator')");
           
            Dstatement.executeUpdate("insert INTO HAIRDRESSER (hid,name,surname) VALUES ('1','Δημήτρης','Πατραμάνης')");
            Dstatement.executeUpdate("insert INTO HAIRDRESSER (hid,name,surname) VALUES ('2','Μηνάς','Χατζησάββας')");
                 
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','19:00','Monday','yes')");
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:00','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:30','Monday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','19:00','Monday','yes')");
            
            
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','19:00','Tuesday','yes')");
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:00','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:30','Tuesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','19:00','Tuesday','yes')");
            
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','19:00','Wednesday','yes')");
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:00','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:30','Wednesday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','19:00','Wednesday','yes')");
            
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','19:00','Thursday','yes')");
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:00','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:30','Thursday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','19:00','Thursday','yes')");
            
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','11:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','12:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','13:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','14:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','15:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','16:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','17:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','18:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('1','19:00','Friday','yes')");
            
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','11:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','12:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','13:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','14:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','15:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','16:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','17:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:00','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','18:30','Friday','yes')");
            Dstatement.executeUpdate("insert INTO AVAILABILITY (hid,time,day,avail) VALUES ('2','19:00','Friday','yes')");
            
        }catch(SQLException ex) {
	  System.out.println("\n -- SQL Exception --- \n");
	  while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("ErrorCode: " + ex.getErrorCode());
		ex = ex.getNextException();
		System.out.println("");
	  }
        }
        Dstatement.close();
        DdbConnection.close();
    }
}