import java.io.*;
class pg21
{
 public static void main(String abc[]) // Command line argument
  {
    int n1,n2,ans; 
    n1=Integer.parseInt(abc[0]);
    n2=Integer.parseInt(abc[1]);
    System.out.print("\nThe value of n1 is : " + n1);
    System.out.print("\nThe value of n2 is : " + n2);
     ans=n1+n2;
    System.out.print("\nThe Answer is : " + ans);
  }
}