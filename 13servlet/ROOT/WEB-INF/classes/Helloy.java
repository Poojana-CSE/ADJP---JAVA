import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Helloy extends HttpServlet
{
        public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
        {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Hello, Tell me your name!</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Hello, Tell me your name!</h1> <br>");
                out.print("<form action='NamedHello' method=POST>");
                out.println("<input type=text length=20 name=yourname><br>");
                out.println("<input type=submit></form>");
                out.println("</body>");
                out.println("</html>");
        }
}
