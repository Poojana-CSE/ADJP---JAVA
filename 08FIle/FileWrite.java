import java.io.*;
public class FileWrite
{
  public static void main(String as[]) throws IOException
   {
     DataInputStream inp=new DataInputStream(System.in);
     String FName;

     System.out.println("\nEnter the File Name:");
     FName=inp.readLine();     
     FileOutputStream f=new FileOutputStream(FName);
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     char s;
     System.out.println("\n\tEnter Message and Press * to Terminate :");
       while((s=(char)br.read())!='*')
         {
           f.write((int)s);
         }
       f.close();
    }
}