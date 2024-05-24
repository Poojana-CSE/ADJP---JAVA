import java.io.*;
class FileRead
{
  public static void main(String as[]) throws Exception
   {
   
       DataInputStream inp=new DataInputStream(System.in);
       String FName;

       System.out.println("\nEnter the File Name:");
       FName=inp.readLine();     

       FileInputStream f=new FileInputStream(FName);
       int s;
         while((s=f.read())!=-1)
           {
             System.out.print((char)s);
           }
          f.close();
                        
  }
}