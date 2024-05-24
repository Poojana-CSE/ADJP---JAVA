import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NamedSessionHello extends HttpServlet
{
        public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException 
        {
                response.setContentType("text/html"); 
                PrintWriter out = response.getWriter();

                HttpSession hs = request.getSession(true);
                String sn = (String) hs.getAttribute("yourname");
                out.println("<html>"); 
                out.println("<head>");
                out.println("<title>Hello, Tell me your name again!</title>");
                out.println("</head>");
                out.println("<body>");
                if(sn != null && !sn.equals ("")) 
                {
                        out.println("<h1><blink>Oh, NamedSessionHello already know your name:  " + sn + "</blink></h1>");
                } 
                else 
                {
                        String sn2 = request.getParameter("yourname");
                        if (sn2==null || sn2.equals("")) 
                        {
                                out.println("<h2>Hello, No Name "  + "</h2> <br>"); 
                        } 
                        else 
                        {
                                 out.println("<h2>Hello, "+sn2+"</h2><br>"); 
                                 hs.setAttribute("yourname", sn2);
                        }
                }
                out.print("<form action='NamedSessionHello' method=GET>");
                out.println("User Name :<input type=text length=20 name=yourname><br>");
                out.println("<input type=submit value='Send'></form>");
                out.println("</body>");
                out.println("</html>");
        }
}
