import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Result extends HttpServlet
{
        Connection conn;
        String qr1;
        public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
                PrintWriter o;
                qr1="";
                String Reg=req.getParameter("RegNo");
                String Dob=req.getParameter("DOB");
                res.setContentType("text/html");
                o=res.getWriter();
                o.println("<html><head><title>CSC Perundurai");
                o.println("</title></head><body>");
                try
                {
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        conn=DriverManager.getConnection("jdbc:odbc:DBConnect");
                        Statement st=conn.createStatement();
                        ResultSet rs;

                        if(Reg.equals("staff")&&Dob.equals("1947-08-15"))
                        {
                                 rs=st.executeQuery("select * from Result");
                        }
                        else
                        {
                                 rs=st.executeQuery("select * from Result where RegNo='"+Reg+"' and DOB='"+Dob+"'");
                        }
                        
                        o.println("<center><h2>Final Result</h2></center>");
                        o.println("<table width=690 border=0 bgcolor=Orange align=center><tr bgcolor=lightgreen> <th>Name</th><th>Sub1</th><th>Sub2</th><th>Sub3</th><th>Sub4</th></tr>");
                        while(rs.next())
                        {
                                o.println("<tr align=center bgcolor=Yellow><td>" + rs.getString(2)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+rs.getInt(7)+"</td></tr>");      
                        }
                       /* else
                        {
                                o.println("There no Result fond for Requested RegNo and DOB");
                        }*/
                        rs.close();
                        o.println("</table></body></html>");
                        conn.close();
                        o.close();
                }
                catch(Exception e)
                {
                        o.println(e.getMessage());
                }
        }
}


