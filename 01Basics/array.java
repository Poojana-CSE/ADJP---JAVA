import java.io.*;
import java.util.*;
class array
{
	public static void main(String ary[])throws Exception
	{
		int a[]=new int[10];
		Scanner in=new Scanner(System.in);
        
		for(int i=0;i<=9;i++)
		{
			System.out.print("\nenter the value for a[" + i + "]");
			a[i]=in.nextInt();
		}
			System.out.print("\n enter the values are\n");
			for(int i=0;i<=9;i++)
		{
			System.out.print("\n"+a[i]);
		}
	}
}