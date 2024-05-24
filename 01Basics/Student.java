import java.io.*;
class Student
{
   int sno,total;
   String name,result;
   public Student() throws Exception
     {
       DataInputStream di =new DataInputStream(System.in);
        System.out.print("\nEnter the Sno:");
        sno=Integer.parseInt(di.readLine());

        System.out.print("\nEnter the Name:");
        name=di.readLine();

        System.out.print("\nEnter the Total:");
        total=Integer.parseInt(di.readLine());

        System.out.print("\nEnter the Result:");
        result=di.readLine();
     }
 public void  Show()
   {
        System.out.println("\n"+sno+"\t"+name+"\t\t\t"+total+"\t"+result);
  }
}