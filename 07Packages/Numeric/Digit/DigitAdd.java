package Numeric.Digit;
import java.io.*;
public class DigitAdd
{
   public static int AddDigit(int n)
     {
       int sum=0;
        while(n>0) 
          {
             sum=sum + n%10;
             n=n/10;
          }
       return sum;
     }

};
