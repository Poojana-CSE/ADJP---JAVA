import java.sql.*;
public class InsertTab
{
 public static void main(String args[]) throws Exception
  {
    Connection con;
    Statement st;//For execute the Query

    String q="insert into Student1 values(1,'kavi','Female','BSc',89,91,90,95,85,460,92,'Pass')";
    //String q="insert into EMP values(1,'Yuva','M',50000)";      
      try
       {
        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             
        	con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
          //con=DriverManager.getConnection("jdbc:odbc:Sample","sa","sigaram");
        	st=con.createStatement();
        	
        	st.executeUpdate(q);
        	System.out.println("\nThe data has been inserted successfully");

        	st.close();
        	con.close();
       }
     catch(SQLException se)
       {
	System.out.println("Exception"+se.getMessage());
       }
    }
}