import java.io.*;
import java.util.*;
class Prog7_IfElse1
{
 public static void main(String abc[])
  {
    int n1,n2;
    Scanner sci=new Scanner(System.in);
	System.out.print("\nEnter the value for n1:");
	n1=sci.nextInt();
	
	System.out.print("\nEnter the value for n2:");
	n2=sci.nextInt();

	if(n1>n2)
		System.out.print("\nn1 is Biggest value");
	else
		System.out.print("\nn2 is Biggest value");	
  }
}