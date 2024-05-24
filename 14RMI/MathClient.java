import java.rmi.*;
import java.util.*;
public class MathClient{
	public static void main(String args[]) throws Exception
	{
	try
	{
		String strUrl = "rmi://localhost/CSCPri";
		int n1,n2;
		MathServerInf mathServerInf = (MathServerInf)Naming.lookup(strUrl);
		Scanner i=new Scanner(System.in); 
		
		System.out.print("\nEnter the First Number :");
		n1=i.nextInt();
		System.out.print("\nEnter the Second Number :");
		n2=i.nextInt();

		System.out.print("\nAddition Result Is\t:"+mathServerInf.add(n1,n2));
		System.out.print("\nSubtract Result Is\t:"+mathServerInf.sub(n1,n2));
		System.out.print("\nProduct Result Is\t:"+mathServerInf.product(n1,n2));
		System.out.print("\nDivision Result Is\t:"+mathServerInf.div(n1,n2));
	}	
catch(Exception e)
	{
		e.printStackTrace();
	}
 }
}
