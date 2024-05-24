import java.io.*;
public class FilStream1
{
  public static void main(String args[])
   {
    try
      {
        OutputStream os = new FileOutputStream("C:/test.txt");
        for(int x=0; x < bwrite.length ; x++)
          {
            os.write(bwrite[x] );
          }
        os.close();
     
        InputStream is = new FileInputStream("C:/test.txt");
        int size = is.available();

       for(int i=0; i< size; i++)
         {
           System.out.print((char)is.read() + "  ");
         }
       is.close();
      }
       catch(IOException e)
      {
         System.out.print("Exception");
      }	
   }
}