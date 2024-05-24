import java.sql.*;
public class DB_Procedure3
{
  public static void main(String args[])
   {
     Connection con;
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
	CallableStatement st= con.prepareCall("{call GetData(?)}");
	st.setInt(1,1000);

	boolean r=st.execute();
	while(r)
		{

			ResultSet rs=st.getResultSet();
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
	r=st.getMoreResults();
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