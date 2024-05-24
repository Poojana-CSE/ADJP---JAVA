 import java.sql.*;
import java.io.*;

public class DB_Procedure2
{
 public static void main(String args[]) throws Exception
  {
    Connection con;
      String sname,gen,dep,result;
    char chk;
    int sno,m1,m2,m3,m4,m5;
  
    DataInputStream ins= new DataInputStream(System.in);

          
      try
       {
          	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
          	CallableStatement st= con.prepareCall("{call InsData(?,?,?,?,?,?,?,?,?)}");
                  do
                   {
                       System.out.println("\nEnter the Sno:");
                       sno=Integer.parseInt(ins.readLine());

                       System.out.println("\nEnter the Name:");
                  	   sname=ins.readLine();

                       System.out.println("\nEnter Gender:");
                  	   gen=ins.readLine();

                       System.out.println("\nEnter Department:");
                  	   dep=ins.readLine();

                       System.out.println("\nEnter m1:");
                  	   m1=Integer.parseInt(ins.readLine());

                       System.out.println("\nEnter m2:");
                  	   m2=Integer.parseInt(ins.readLine());

                       System.out.println("\nEnter m3:");
                  	   m3=Integer.parseInt(ins.readLine());


                       System.out.println("\nEnter m4:");
                  	   m4=Integer.parseInt(ins.readLine());

                       System.out.println("\nEnter m5:");
                  	   m5=Integer.parseInt(ins.readLine());
                  	  
			          st.setInt(1,sno);
			          st.setString(2,sname);
			          st.setString(3,gen);
			          st.setString(4,dep);
			          st.setInt(5,m1);
			          st.setInt(6,m2);
			          st.setInt(7,m3);
			          st.setInt(8,m4);
			          st.setInt(9,m5);
			          st.execute();
          	   System.out.println("\nThe data has been inserted successfully");

          	   System.out.println("\nDo you want Add one more Record[Y/N]");
               chk=ins.readLine().charAt(0);
         }while((chk=='Y')||(chk=='y'));

	st.close();
	con.close();
     }
     catch(SQLException se)
       {
	System.out.println("Exception"+se.getMessage());
       }
    }
}