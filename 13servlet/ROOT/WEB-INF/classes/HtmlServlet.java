import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HtmlServlet extends HttpServlet
{
        public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
                PrintWriter o=res.getWriter();

                String pass=req.getParameter("pass");

                res.setContentType("text/html");
                o.println("<html><head><title>Servlet");
                o.println("</title></head><body>");
                if(pass.equalsIgnoreCase("kpk"))
                {
                        o.println("Pass Word is Correct");
                }
                else
                {
                        o.println("Not a Valid Pass Word");
                }
                o.println("</body></html>");
                o.close();
        }
}


