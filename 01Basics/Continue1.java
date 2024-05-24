import java.io.*;
import java.util.*;
class Continue1
{
 public static void main(String abc[])
  {
        for(int i=1;i<=100;i++)
        {
        	if(i==25)
            {
            	continue;
            }
            System.out.print (" " + i);
        }
    System.out.print("\n forLoop Completed");
  }
}