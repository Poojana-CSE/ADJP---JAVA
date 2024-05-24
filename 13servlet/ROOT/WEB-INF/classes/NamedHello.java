import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NamedHello extends HttpServlet
{
        public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
        {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                String name = request.getParameter("yourname");
                out.println("<html>");
                out.println("<body>");
                out.println("<head>");
                out.println("<title>Hello, Tell me your name again!</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Hello, " + name + "</h2> <br>"); 
                out.print("<form action='NamedHello' method=POST>");
                out.println("<input type=text length=20 name=yourname><br>");
                out.println("<input type=submit></form>");
                out.println("</body>");
                out.println("</html>");
        }
}
