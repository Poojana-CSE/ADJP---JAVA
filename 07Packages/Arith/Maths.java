package Arith;
import java.io.*;
public class Maths
{
    public static int Max(int n1,int n2)
      {
         return (n1>n2) ? n1:n2;            
      }
    public static int Min(int n1,int n2)
      {
         return (n1<n2) ? n1:n2;
      }
    public static int Avrg(int n1,int n2)
      {
         return  ((n1+n2)/2);
      }
    public static boolean isOdd(int n1)
      {
         if ((n1%2)==1)
          {
              return (true);
          }
        else
         {
              return (false);
         }
      }
    public static boolean isEven(int n1)
      {
         if ((n1%2)==0)
           return (true);
          else
            return (false);
      }
 };
