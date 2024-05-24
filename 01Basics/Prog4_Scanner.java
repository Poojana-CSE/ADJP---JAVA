import java.io.*;
import java.util.*;
class Prog4_Scanner
{
 public static void main(String abc[])
  {
    int n1,n2,ans; 
    Scanner sci=new Scanner(System.in);
	System.out.print("\nEnter the value for n1:");
	n1=sci.nextInt();
	System.out.print("\nEnter the value for n2:");    	
	n2=sci.nextInt();

    ans=n1+n2;
    System.out.print("\nThe Addition Result is : " + ans);

    ans=n1-n2;
    System.out.print("\nThe Subtraction Result is : " + ans);

    ans=n1*n2;
    System.out.print("\nThe Multiplication Result is : " + ans);

    ans=n1/n2;
    System.out.print("\nThe Division Result is : " + ans);

    ans=n1%n2;
    System.out.print("\nThe Mod-Division Result is : " + ans);
  }
}