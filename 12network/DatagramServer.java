import java.net.*;
import java.io.*;

public class DatagramServer
{
        public static DatagramSocket ds;
        public static int clientport=789,serverport=790;

        public static void main(String args[]) throws Exception
        {
                byte buffer[]=new byte[1024];
                ds=new DatagramSocket(serverport);

                //BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
                DataInputStream di=new DataInputStream(System.in);
                System.out.println("Please Type the Message to Send");

                InetAddress ia = InetAddress.getByName("Lab2L2");

                while(true)
                {
                        String str=di.readLine();

                        if((str==null)||str.equals("end"))
                                break;
                        buffer=str.getBytes();

                        ds.send(new DatagramPacket(buffer,str.length(),ia,clientport));

                }
        }
}
