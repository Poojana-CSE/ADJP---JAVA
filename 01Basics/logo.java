import java.io.*;
public class logo
{
	public static void main(String a[])
	{
		int n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n1: ");
		n1=sc.nextInt();

		if(n1<0)
			System.out.println("n1 is negative value");
		else if(n1==0)
			System.out.println("n1 is zero");
		else if((n1>=1)&&(n1<10))
			System.out.println("n1 is single digit");
		else if((n1>=10)&&(n1<100))
			System.out.println("n1 is two digit");
		else if((n>=100)&&(n1<1000))
			System.out.println("n1 is three digit");
		else
			System.out.println("n1 is more than four digit");
	}
}