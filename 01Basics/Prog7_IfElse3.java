import java.io.*;
import java.util.*;
class Prog7_IfElse3
{
 public static void main(String abc[])
  {
    int n1;
    Scanner sci=new Scanner(System.in);
	System.out.print("\nEnter the value for n1:");
	n1=sci.nextInt();
	
	if(n1<0)
	{
		System.out.print("\nNegative value");
	
	}
	else if(n1==0)
	{
		System.out.print("\nZero");
	}
	else if((n1>=1)&&(n1<10))
	{
		System.out.print("\nSingle Digit");
	}
	else if((n1>=10)&&(n1<100))
	{
		System.out.print("\nDouble Digit");
	}
	else if((n1>=100)&&(n1<1000))
	{
		System.out.print("\nThree Digit");
	}
	else if((n1>=1000)&&(n1<=9999))
	{
		System.out.print("\nFour Digit");
	}
	else
	{
		System.out.print("\nThe value may more than 4 Digit");	
	}
  }
}