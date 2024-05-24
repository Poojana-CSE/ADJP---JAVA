import java.io.*;
import java.io.File;
public class FileInfo
{
  public static void main(String as[]) throws IOException
   {
     DataInputStream inp=new DataInputStream(System.in);
     String FName;

     System.out.println("\nEnter the File Name:");
     FName=inp.readLine();     
     File f=new File(FName);
     if(f.exists())
     {
         System.out.println("\nFile Name :"+f.getName());
         System.out.println("\nFile Path :"+f.getPath());
         System.out.println("\nAbs Path  :"+f.getAbsolutePath());
         System.out.println("\nFile Parent :"+f.getParent());
         System.out.println("\nExits Status :"+ f.exists());
         System.out.println(f.canWrite()?" is Writeable ":"is not Writeable");
         System.out.println(f.canRead()?" is Readable ":" is not Readable");
         System.out.println(f.isDirectory()?" is Directory ":" is Not Directory");        
     }
     else
     {
      System.out.println("\n The File Doesn't Exits");          
     }
   }
}