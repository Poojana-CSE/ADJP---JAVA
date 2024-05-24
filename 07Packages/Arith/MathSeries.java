package Arith;
import java.io.*;
public class MathSeries
{
    public void Odd(int n)
      {
         int i;
        System.out.println();

        for(i=1;i<=n;i+=2)
         {
           System.out.print(" " + i);
         }
      }

    public void Even(int n)
      {
         int i;
        System.out.println();

        for(i=2;i<=n;i+=2)
         {
           System.out.print(" " + i);
         }
      }
    public void Fifo(int n)
      {
       int n1=0,n2=1,n3=0,i;
       System.out.print("\n0 1");
       
       for(i=1;i<=n;i++)
        {
          n3=n1+n2;         
          System.out.print(" "+n3);
          n1=n2;
          n2=n3;
        }
      }
 };