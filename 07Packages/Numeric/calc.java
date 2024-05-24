package Numeric;
import java.io.*;
public class calc
{
  public static int Sum(int n)
   {
     int Sum=0;
        for(int i=1;i<=n;i++) 
          {
            Sum+=i;
         }
      return(Sum);
   }
public static int Power(int n,int p)
{
	int ans=1;
	for(int i=1;i<=p;i++)
	 {
	   ans=ans*n;
	  }
	return(ans);
}
};