import java.io.*;
class Employee
{
    public int Eno,Salary;
    public String Name,Designation;
    
    public Employee(int En,String Nam,String Des,int Sal)
       {
           Eno=En;
           Name=Nam;
           Designation=Des;
           Salary=Sal;
       }

    public void EmpInfo()
     { 
        System.out.print("\nEmployee No\t: "+Eno); 
        System.out.print("\nEmployee Name\t: "+Name); 
        System.out.print("\nEmployee Desig\t: "+Designation); 
        System.out.print("\nEmployee Salary\t: "+Salary);  
     }
};

class EmpSalary extends Employee
{
    float Salary, pf,Esi;
     public EmpSalary(int En,String Nam,String Des,int Sal)
      {
       super(En,Nam,Des,Sal);  //to Access or call baseclass(super class) constructor
      }
     public void EmpInfo()
     { 
        super.EmpInfo();
        pf=super.Salary * 0.15f;
        Esi=super.Salary*0.10f;
        Salary=(super.Salary+pf)-Esi;
        System.out.print("\nEmployee PF\t:"+pf);
        System.out.print("\nEmployee ESI\t:"+Esi);
        System.out.print("\nEmployee Net Salary\t:"+Salary);
     }
};

class SuperDemo
{
    public static void main(String abc[])
      {
         
         EmpSalary emp1=new EmpSalary(100,"Arun","GM",10000);
         emp1.EmpInfo();
      }
};
