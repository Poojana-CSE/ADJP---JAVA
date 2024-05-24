import java.io.*;
import java.util.*;
class mathew
{
public static void main(String a[])throws Exception
{
	DataInputStream m=new DataInputStream(System.in);
	int n1,n2,tot;
	n1=Integer.parseInt(m.readLine());
	System.out.println("n1 is:"+n1);
	n2=Integer.parseInt(m.readLine());
	System.out.println("n2 is:"+n2);
	tot=n1+n2;
    System.out.println("tot is:"+tot);
    Scanner s=new Scanner(System.in);
	int n3;
	String name;
	n3=s.nextInt();
	System.out.println("n3 is"+n3);
	name=s.next();
	System.out.println("name is:"+name);
	
}
}

