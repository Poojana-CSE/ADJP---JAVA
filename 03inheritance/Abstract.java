import java.io.*;
abstract class Maths
{
  float Av; 
  int t;

  public int Max(int n1,int n2)
   {
     return (n1>n2)?n1:n2;
   }	

  public int Min(int n1,int n2)
   {
     return (n1<n2)?n1:n2;
   }	
   
  public float Avg(int n1,int n2)
   {
     t=n1+n2;
	 Av=((float)t/2.0F);
     return Av;
   }   
};

class Calc extends Maths
{

 public int Power(int n,int p)
  {
   int i;
   int ans=1;
   for(i=1;i<=p;i++)	 
    {
     ans=ans*n;
    }
    return ans;	  
  }
};
class Abstract
{
  public static void main(String abc[])
    {
      Maths mat=new Maths();// we can't create an object for Abstract class
      Calc m=new Calc();
      System.out.println("\nThe Biggest value among 9 and 10 is :"+m.Max(10,9));
      System.out.println("\nThe Smallest value among 9 and 10 is :"+m.Min(10,9));
      System.out.println("\nThe Average value among 9 and 10 is :"+m.Avg(10,9));
      System.out.println("\nThe 5 Power 4 is :"+m.Power(5,4));
    }
}

