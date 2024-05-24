import java.io.*;
import java.util.*;
class WhileNest3
{
  public static void main(String ary[])
  {
    String h="CSC Perundurai";
    int i=0,j;
     while(i<h.length())
      {
        j=0;        	
        while(j<=i)
         {
           System.out.print(h.charAt(j));	
           j++;
         }
         System.out.println();
         i++;
      }
  }
}