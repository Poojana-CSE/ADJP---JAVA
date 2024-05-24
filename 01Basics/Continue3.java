import java.io.*;
import java.util.*;
class Continue3
{
 public static void main(String abc[]) throws Exception
  {
        for(int i=65;i<=122;i++)
        {
       	if((i>90) && (i<97))
            {
            	continue;
            }

            System.out.println(i+ " -> " + (char)i);
        }
    System.out.print("\nWhile Loop Completed");
  }
}