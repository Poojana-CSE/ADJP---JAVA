              /*PROGRAM TO FIND SYSTEM NAME AND IP ADDRESS*/             
import java.net.*;
class Ipaddress
{
        public static void main(String a[]) throws Exception
        {
        try
        {
                URL ul=new URL("HTTPS://www.facebook.com");

                InetAddress ip=InetAddress.getByName("Sigaramserver1");
	
                System.out.println("\n\t\tSYSTEM NAME AND IP ADDRESS");
                System.out.println("\t\t**************************");

                System.out.println("\nNAME="+ip.getHostName());
                System.out.println("\nADDRESS="+ip.getHostAddress());

                System.out.println("\n Protocol="+ul.getProtocol());
                System.out.println("\n Port number="+ul.getPort());
                System.out.println("\n Host Name="+ul.getHost());
        }
        catch(UnknownHostException e)
        {
                System.out.println(e.getMessage());
        }
        }
}
