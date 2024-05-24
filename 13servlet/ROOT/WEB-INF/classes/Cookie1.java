import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Cookie1 extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
                for(int i=1; i<=3; i++) 
		{
                        Cookie cookie = new Cookie("kvk"+i,"Cookie-Value"+i);
			response.addCookie(cookie);
			cookie.setMaxAge(3600);
			response.addCookie(cookie);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Setting Cookies";
                out.println ("<BODY>");
                out.println ("<H1 ALIGN=CENTER>" + title + "</H1>");
		out.println ("There are three cookies associated with this page.");
		out.println("</BODY></HTML>");
	}
}
