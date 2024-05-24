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
 public student(int sn,String nam,String gen,int total,String res)// Parameterized Constructor
 {
  sno=sn;
  name=nam;
  gender=gen;
  tot=total;
  avg=(float)tot/5.0f;
  result=res;
 }
 public student(student ss)  //Copy Constructor
 {
  sno=ss.sno-2;
  name=ss.name+"kumar";
  gender=ss.gender;
  tot=ss.tot+5;
  avg=(float)tot/5.0f;
  result=ss.result;
 }
 public void show()
 {
  System.out.print("\n"+sno+"\t"+name+"\t\t"+gender+"\t"+tot+"\t"+avg+"\t"+result);
 }
};

class constructor1
{
public static void main(String abc[])throws Exception
 {
  student s1=new student();
  student s2=new student(52,"Ravi","Male",405,"pass");
  student s3=new student();
  student s4=new student(s2); 
 
  System.out.print("\nSno\tName\t\tGender\tTotal\tAverage\tResult");
  System.out.print("\n==============================================================");

  s1.show();
  s2.show();
  s3.show();
  s4.show();
   }
}