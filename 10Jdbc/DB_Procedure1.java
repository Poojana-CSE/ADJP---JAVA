import java.sql.*;
public class DB_Procedure1
{
 public static void main(String args[]) throws Exception
  {
    
   Connection con;
      try
       {
        	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             
        	con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
          CallableStatement st= con.prepareCall("{call InsData(?,?,?,?,?,?,?,?,?)}");
          st.setInt(1,1000);
          st.setString(2,"Mahi");
          st.setString(3,"Female");
          st.setString(4,"MSc");
          st.setInt(5,99);
          st.setInt(6,98);
          st.setInt(7,97);
          st.setInt(8,96);
          st.setInt(9,99);
        	st.execute();
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