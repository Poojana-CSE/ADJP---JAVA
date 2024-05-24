import java.io.*;
class student
{
 int sno,tot;
 float avg;
 String name,result,gender;
 
 public student() // Default Constructor
 {
  sno=0;
  name="X";
  gender="Na";
  tot=0;
  avg=0.0f;
  result="Na"; 
 }
 
 public void show()
 {
  System.out.print("\n"+sno+"\t"+name+"\t\t"+gender+"\t"+tot+"\t"+avg+"\t"+result);
 }
};

class constructor
{
public static void main(String abc[])throws Exception
 {
  student s1=new student();
 
 
  System.out.print("\nSno\tName\t\tGender\tTotal\tAverage\tResult");
  System.out.print("\n==============================================================");

  s1.show();
 
 }
}