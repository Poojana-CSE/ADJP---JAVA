import java.sql.*;
import java.io.*;

public class InsertTab1 
{
 public static void main(String args[]) throws Exception
  {
    Connection con;
    Statement st;//For execute the Query

    String sno,sname,gen,dep,result;
    char chk;
    int m1,m2,m3,m4,m5,tot;
    float avrg;
    DataInputStream ins= new DataInputStream(System.in);

          
      try
       {
          	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

               
          	//con=DriverManager.getConnection("jdbc:odbc:DB1");
            con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
          	st=con.createStatement();
                  do
                   {
                       System.out.println("\nEnter the Sno:");
                       sno=ins.readLine();

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
                  	   tot=m1+m2+m3+m4+m5;

                     avrg=(float)tot/5.0f;
                     if((m1>=35) && (m2>=35) && (m3>=35) && (m4>=35) && (m5>=35))
                       result="Pass";
                     else
                       result="Fail";
                     
                     //String q="insert into Student values(4,'kavi','Female','BSc',89,91,90,95,85,460,92,'Pass')";
                     String q="insert into student1 values(" + sno+",'" + sname + "','" + gen + "','" + dep + "'," +
                      m1 + "," + m2 + "," + m3 + "," + m4 + "," + m5+ "," + tot + "," +avrg + ",'" + result + "')";
                     System.out.println(q);
               st.executeUpdate(q);
          	   System.out.println("\nThe data has been inserted successfully");

          	   System.out.println("\nDo you want Add one more Record[Y/N]");
                     //chk=(char)ins.readByte();
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