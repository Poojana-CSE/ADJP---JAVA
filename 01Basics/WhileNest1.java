import java.io.*;
import java.util.*;
class WhileNest1
{
	public static void main(String ary[])
	{
		int i,j;
		Scanner in=new Scanner(System.in);
		i=1;
        while(i<=10)
        {
			j=1;        	
        	while(j<=5)
        	{
        		System.out.print(" " + j);	
        		j++;
        	}
        	System.out.print("");
        	i++;
        }
	}
}