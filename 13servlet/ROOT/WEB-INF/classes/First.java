import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class First extends GenericServlet
{
        public void init() throws ServletException
        {
                System.out.println("Initialization");
        }
        public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
        {
                res.setContentType("text/html");
                PrintWriter o=res.getWriter();
                o.println("<html><head><title>LifeCycle</title></head>");
                o.println("<body>My First Page</body></html>");
                o.close();
                System.out.println("Service Of Servlet");
        }
        public void destroy() 
        {
                System.out.println("Destruction");
        }

}//First.java
