import java.sql.*;
public class DeleteTab
{
  public static void main(String args[])
   { 
   	 Connection con;
     Statement st;

    String query="Delete from student1 where sno=3";
      try
        {
	  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	  //con=DriverManager.getConnection("jdbc:odbc:DB1");
	  con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
	  st=con.createStatement();
	  st.executeUpdate(query);
	  System.out.println("Successfully deleted");
	  st.close();
	  con.close();
	}
	catch(Exception e)
	{
	  System.out.println(e.getMessage());
	}
}
}