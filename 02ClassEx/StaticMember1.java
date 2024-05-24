import java.io.*;
class Emp
{
  public static int Eno=1000;  
  private int empno,salary;
  private String name,gender,desig;
  public Emp() throws Exception
   {
      DataInputStream di =new DataInputStream(System.in);
      System.out.print("\nEnter the EmpName:");
      name=di.readLine();
      System.out.print("\nEnter the EmpGender:");
      gender=di.readLine();
      System.out.print("\nEnter the EmpDesignation:");
      desig=di.readLine();
      System.out.print("\nEnter the EmpSalary:");
      salary=Integer.parseInt(di.readLine());
      empno=Eno++;
   }
  public static void show(Emp e)
    {
      System.out.println(e.empno + "\t" + e.name + "\t\t"+e.gender+"\t"+e.desig+"\t"+e.salary) ;
    }
};
class StaticMember1
{
   public static void main(String abc[]) throws Exception
    {
      Emp e1=new Emp();
      Emp e2=new Emp();
      Emp e3=new Emp();
      Emp e4=new Emp();
      System.out.println("\nEno\tEName\t\tGender\tDesig\tSalary");
      System.out.println("========================================");
     Emp.show(e1);
     Emp.show(e2);
     Emp.show(e3);
     Emp.show(e4);
   System.out.print("\nThe Next Employee Number is : " + Emp.Eno);
   }
}