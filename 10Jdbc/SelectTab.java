import java.sql.*;
public class SelectTab
{
  public static void main(String args[])
   {
     Connection con;
     Statement st;

     String query="select * from student1";
    // String query="select Sno,Sname,gender,dep,TOtal,Avrg,Result from student";
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	//con=DriverManager.getConnection("jdbc:odbc:DB1");	
	con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
	st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	System.out.println("\nSno\tSName\t\t\tGender\tDep\tTotal\tAverage\tResult");
	System.out.println("\n========================================================================");

	while(rs.next())
	{
		int sno=rs.getInt(1);
		String sname=rs.getString(2);
		String gen=rs.getString(3);
		String dep=rs.getString(4);
		int tot=rs.getInt(10);
		int avg=rs.getInt(11);
		String res=rs.getString(12);
	
	System.out.println("\n"+sno+"\t"+sname+"\t\t"+"\t"+gen+"\t"+dep+"\t"+tot+"\t"+avg+"\t"+res);
	}
	st.close();
	con.close();
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
}
}     