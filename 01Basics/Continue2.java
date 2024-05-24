import java.io.*;
class Continue2
{
 public static void main(String abc[]) throws Exception
  {
        for(int i=1;i<=100;i++)
        {
        	if((i>=25) && (i<30))
            {
            	continue;
            }
            System.out.print (" " + i);
        }
    System.out.print("\nWhile Loop Completed");
  }
}