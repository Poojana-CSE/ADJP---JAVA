import java.io.*;
class Maths
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

final class Calc  extends Maths //--> Error : cannot Inherit from Final Maths
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
class Final1
{
  public static void main(String abc[])
    {
      Maths mat=new Maths();
      Calc c=new Calc();
      System.out.println("\nThe Biggest value among 9 and 10 is :"+mat.Max(10,9));
      System.out.println("\nThe Smallest value among 9 and 10 is :"+mat.Min(10,9));
      System.out.println("\nThe Average value among 9 and 10 is :"+mat.Avg(10,9));
      System.out.println("\nThe 5 Power 4 is :"+c.Power(5,4));
    }
}