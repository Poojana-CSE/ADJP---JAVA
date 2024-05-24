import java.io.*;
class Prog4_DataInput
{
 public static void main(String abc[]) throws Exception
  {
    int n1,n2,ans; 
    //classname objName=new classname();
    DataInputStream di=new DataInputStream(System.in);
    System.out.print("\nEnter the value for n1:");
	  n1=Integer.parseInt(di.readLine());
	  System.out.print("\nEnter the value for n2:");    	
	  n2=Integer.parseInt(di.readLine());
      System.out.print("\n n1 : " +n1 + "\n n2 : "+n2);
    ans=n1+n2;
    System.out.print("\nThe Addition Result is : " + ans);
    
    ans=n1-n2;
    System.out.print("\nThe Subtraction Result is : " + ans);

    ans=n1*n2;
    System.out.print("\nThe Multiplication Result is : " + ans);

    ans=n1/n2;
    System.out.print("\nThe Division Result is : " + ans);

    ans=n1%n2;
    System.out.print("\nThe Mod-Division Result is : " + ans);
  }
}