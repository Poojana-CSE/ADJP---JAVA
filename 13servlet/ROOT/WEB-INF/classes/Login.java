import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Login extends HttpServlet
{
        Connection conn;
        String qr1;
        public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
                PrintWriter o;
                qr1="";
                String user=req.getParameter("user");
                String pass=req.getParameter("pass");
                res.setContentType("text/html");
                o=res.getWriter();
                o.println("<html><head><title>CSC Perundurai");
                o.println("</title></head><body>");
                try
                {
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        conn=DriverManager.getConnection("jdbc:odbc:WWW");
                        Statement st=conn.createStatement();
                        ResultSet rs=st.executeQuery("select user,pass from valid where user='"+user+"' and pass='"+pass+"'");
                        if(rs.next())
                        {
                                o.println("Username and Passwoed is Correct");
                        }
                        else
                        {
                                o.println("Not a Valid User or Password");
                        }
                        rs.close();
                        o.println("</body></html>");
                        conn.close();
                        o.close();
                }
                catch(Exception e)
                {
                        o.println(e.getMessage());
                }
        }
}


