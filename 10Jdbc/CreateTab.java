import java.sql.*;
import java.sql.Driver;
import java.io.*;
class CreateTab
{
 public static void main(String args[]) throws Exception
  {
    Connection con;
    Statement st;//For execute the Query

    String q="create table Student1(SNo int,SName varchar(20),Gender varchar(6),Dep varchar(20),M1 int,M2 int, M3 int,M4 int,M5 int,Total int, Avrg float, Result varchar(5))";
    //String q="create table EMP(EmpNo int,EmpName varchar(20),Gender varchar(1),Salary int)";
          
      try
       {
	      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // Registering Driver

     	  con=DriverManager.getConnection("jdbc:odbc:ConnectDB"); //here CSC is Data Source Name
        //con=DriverManager.getConnection("jdbc:odbc:Sample","sa","sigaram"); // DBConnect1 is Data Source Name
	      st=con.createStatement();
	
      	st.execute(q);
      	System.out.println("\nThe Table has Created successfully");

      	st.close();
      	con.close();
       }
     catch(SQLException se)
       {
	       System.out.println("Exception"+se.getMessage());
       }
    }
}