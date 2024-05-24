import java.net.*;
import java.rmi.*;
public class MathServer
{
public static void main(String ar[])
	{
		try
		{
			MathServerImpl mathServer = new MathServerImpl();
			Naming.rebind("CSCPri",mathServer);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}
}
	