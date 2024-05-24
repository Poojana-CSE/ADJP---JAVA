import java.io.*;
import java.util.*;
class WhileNest2
{
	public static void main(String ary[])
	{
		int i,j;
		Scanner in=new Scanner(System.in);
		i=1;
        while(i<=5)
        {
			j=1;        	
        	while(j<=i)
        	{
        		System.out.print(" " + j);	
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}
}