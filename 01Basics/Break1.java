import java.io.*;
class Break1
{
 public static void main(String abc[]) throws Exception
  {
        for(int i=1;i<=100;i++)
        {
            System.out.print (" " + i);
            if(i==25)
            {
                break;
            }
        }
    System.out.print("\nWhile Loop Completed");
  }
}