import java.io.*;
class Break2
{
 public static void main(String abc[])throws Exception
  {
    
        for(int i=2;i<=100;i+=2)
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