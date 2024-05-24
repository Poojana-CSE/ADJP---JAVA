import java.sql.*;
import java.io.*;
import java.util.*;
public class UpdateTab
{
 public static void main(String args[]) throws Exception
  {
    Connection con;
    Statement st;//For execute the Query

    String sno,sname,gen,medium,result;
    char chk;
    int m1,m2,m3,m4,m5,tot;
    float avrg;
    Scanner ins= new Scanner(System.in);

          
      try
       {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          //con=DriverManager.getConnection("jdbc:odbc:DB1");
          con=DriverManager.getConnection("jdbc:odbc:ConnectDB","sa","Sigaram");
          st=con.createStatement();
              do
               {
                 System.out.println("\nEnter the Sno:");
                 sno=ins.next();

                 System.out.println("\nEnter the Name:");
                 sname=ins.next();

                 System.out.println("\nEnter Gender[F/M/T]:");
                 gen=ins.next();

                 System.out.println("\nEnter Department:");
                 medium=ins.next();

                 System.out.println("\nEnter m1:");
                 m1=ins.nextInt();

                 System.out.println("\nEnter m2:");
                 m2=ins.nextInt();

                 System.out.println("\nEnter m3:");
                 m3=ins.nextInt();

                 System.out.println("\nEnter m4:");
                 m4=ins.nextInt();

                 System.out.println("\nEnter m5:");
                 m5=ins.nextInt();

                 tot=m1+m2+m3+m4+m5;
                 avrg=(float)tot/5.0f;

                 if((m1>=35) && (m2>=35) && (m3>=35) && (m4>=35) && (m5>=35))
                   result="Pass";
                 else
                   result="Fail";ff 
                 
                 String q="update student1 set SName='" + sname + "',Gender='" + gen + "',Dep='" + medium +
                  "',m1=" + m1 + ",m2=" + m2 + ",m3=" + m3 + ",m4=" + m4 + ",m5=" + m5+ ",Total=" + tot +
                   ",Avrg=" +avrg + ",result='" + result + "' where sNo=" + sno;

                 st.executeUpdate(q);
                 System.out.println("\nThe Data has been Updated successfully");

                 System.out.println("\nDo you want Update more Record[Y/N]");
                       chk=ins.next().charAt(0);
               }while((chk=='y')||(chk=='Y'));

            st.close();
            con.close();
       }
     catch(SQLException se)
       {
           System.out.println("Exception"+se.getMessage());
       }
    }
}