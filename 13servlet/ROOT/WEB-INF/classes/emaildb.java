import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.net.*;
public class emaildb extends HttpServlet
{
        Connection theConnection;
        public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
        {
//                HttpSession session = req.getSession(true);
                res.setContentType("text/html");
                PrintWriter out = res.getWriter();
                out.println("<HTML><HEAD><TITLE>Emai List.</TITLE>");
                out.println("</HEAD>");
                out.println("<BODY bgColor=blanchedalmond text=#008000 topMargin=0>");
                out.println("<P align=center><FONT face=Helvetica><FONT color=fuchsia style=\"BACKGROUND-COLOR: white\"><BIG><BIG>List of E-mail addresses.</BIG></BIG></FONT></P>");
                out.println("<P align=center>");
                out.println("<TABLE align=center border=1 cellPadding=1 cellSpacing=1 width=\"75%\">");
                out.println("<TR>");
                out.println("<TD>Name</TD>");
                out.println("<TD>E-mail</TD>");
                out.println("<TD>Website</TD></TR>");
                try
                {
                        //Loading Sun's JDBC ODBC Driver 
                        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        //Connect to emaildb Data source
                        theConnection = DriverManager.getConnection("jdbc:odbc:www");
                        Statement theStatement=theConnection.createStatement();
                        ResultSet theResult=theStatement.executeQuery("select * from emaillists"); //Select all records from emaillists table.
                        while(theResult.next())
                        {
                                out.println();
                                out.println("<TR>");
                                out.println("<TD>" + theResult.getString(1) + "</TD>");
                                out.println("<TD>" + theResult.getString(2) + "</TD>");
                                String s=theResult.getString(3);
                                out.println("<TD><a href=" + s + ">" + s + "</a></TD>");
                                out.println("</TR>");
                        }
                        theResult.close();//Close the result set
                        theStatement.close();//Close statement
                        theConnection.close(); //Close database Connection
                }
                catch(Exception e)
                {
                        out.println(e.getMessage());//Print trapped error.
                }
                out.println("</TABLE></P>");
                out.println("</FONT></BODY></HTML>");
        }
        public void destroy()
        {
        }
}
