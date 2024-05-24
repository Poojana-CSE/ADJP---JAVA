import java.io.*;
import java.util.*;
class Prog5_ArithOpr
{
 public static void main(String abc[])
  {
    int n1,n2,ans; 
    Scanner sci=new Scanner(System.in);
	System.out.print("\nEnter the value for n1:");
	n1=sci.nextInt();
	System.out.print("\nEnter the value for n2:");    	
	n2=sci.nextInt();
    
     System.out.print("\nThe Addition Result is : " + (n1+n2));
    System.out.print("\nThe Subtraction Result is : " + (n1-n2));
    System.out.print("\nThe Multiplication Result is : " + (n1*n2));
    System.out.print("\nThe Division Result is : " + (n1/n2));
    System.out.print("\nThe Mod-Division Result is : " + (n1%n2));
  }
}