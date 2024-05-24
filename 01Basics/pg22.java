import java.io.*;
import java.util.*;
class pg22
{
	public static void main(String abc[])
	{
		int n1;
		Scanner sci=new Scanner(System.in);
		System.out.print("\nEnter the value for n1:");
		n1=sci.nextInt();
	if(n1<0)
	{
		System.out.print("\nThe value is negative");
	}
	else if(n1==0)
	{
		System.out.print("\nThe value is zero");
	}
	else if((n1>0)&&(n1<9))
	{
		System.out.print("\nThe value is single digit");
	}
	else
	{
		System.out.print("\nthe value is more than one digits");
	}
}
}