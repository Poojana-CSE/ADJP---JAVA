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
class Series extends Calc
{
 public int Sum(int n)
 {
   int i=1,sum=0;
   for(i=1;i<=n;i++)
    {
      sum=sum+i;	   
    }
  return sum; 
 }
 public int Fact(int n)
 {
   int i=1,sum=1;
   for(i=1;i<=n;i++)
    {
      sum=sum*i;	   
    }
  return sum; 
 }
};
class Inheri2
{
  public static void main(String abc[])
    {
  
      Series s=new Series();
      System.out.println("\nThe Biggest value among 9 and 10 is :"+s.Max(10,9));
      System.out.println("\nThe Smallest value among 9 and 10 is :"+s.Min(10,9));
      System.out.println("\nThe Average value among 9 and 10 is :"+s.Avg(10,9));
      System.out.println("\nThe 5 Power 4 is :"+s.Power(5,4));
      System.out.println("\nThe sum 10 Number is :"+s.Sum(10));
      System.out.println("\n5 Factorial is :"+s.Fact(5));
    }
}