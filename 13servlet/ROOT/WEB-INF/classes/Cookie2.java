import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Cookie2 extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{    
		response.setContentType("text/html");
                Cookie[] cookies = request.getCookies();
     		Cookie cookie;
		PrintWriter out = response.getWriter();
                out.println("<BODY><h1>Active Cookies</h1>");
 		out.println ("<TABLE BORDER=1 ALIGN=CENTER>");
                out.println("<TR><TH>Cookie Name</TH><TH>Cookie Value</TH></TR>");
      		for(int i=0;i<cookies.length; i++)
          	{
          		cookie = cookies[i];
          		out.println("<TR><TD>" + cookie.getName() + "<TD></TD>" + cookie.getValue()+"</TD></TR>");
         	}
       		out.println("</TABLE></BODY></HTML>");
  	}
}
