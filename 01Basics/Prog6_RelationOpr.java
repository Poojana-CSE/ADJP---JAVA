import java.io.*;
import java.util.*;
class Prog6_RelationOpr
{
 public static void main(String abc[])
  {
    int m1,m2,m3,m4,m5,tot,sno;
    float avrg;
    String name,result;
    Scanner sci=new Scanner(System.in);
	System.out.print("\nEnter the S.No:");
	sno=sci.nextInt();
	System.out.print("\nEnter the Student Name:");
	name=sci.next();
	System.out.print("\nEnter the Mark1:");
	m1=sci.nextInt();
	System.out.print("\nEnter the Mark2:");
	m2=sci.nextInt();
	System.out.print("\nEnter the Mark3:");
	m3=sci.nextInt();
	System.out.print("\nEnter the Mark4:");
	m4=sci.nextInt();
	System.out.print("\nEnter the Mark5:");
	m5=sci.nextInt();
	tot=m1+m2+m3+m4+m5;
	avrg=(float)tot/5.0f;
	if((m1>=35) && (m2>=35) && (m3>=35) && (m4>=35) && (m5>=35))
		result="pass";
	else
		result="fail";
	

	System.out.print("\nStudent Sno \t\t:"+  sno);
	System.out.print("\nStudent Name \t\t: "+ name);
	System.out.print("\nTotal Mark\t\t: "+ tot);
	System.out.print("\nAverage Mark\t\t: "+ avrg);
	System.out.print("\nResult Is\t\t: "+ result);
  }
}