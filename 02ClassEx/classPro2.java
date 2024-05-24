import java.io.*;
class Student
{
   private int sno,m1,m2,m3,m4,m5,tot;
   private float avrg;
   private String name,result;
  
   private void calculate()
     { 
           tot=m1+m2+m3+m4+m5;
           avrg=(float)tot/5.0f;
           if((m1>=35)&&(m2>=35)&&(m3>=35)&&(m4>=35)&&(m5>=35))
               result="Pass";
           else
              result="Fail";
    }
  public void getStuinfo() throws Exception
    {
       DataInputStream din=new DataInputStream(System.in);
       System.out.print("\nEnter the Sno");
       sno=Integer.parseInt(din.readLine());
       System.out.print("\nEnter the Name");
       name=din.readLine();
       System.out.print("\nEnter the m1");
       m1=Integer.parseInt(din.readLine());
       System.out.print("\nEnter the m2");
       m2=Integer.parseInt(din.readLine());
       System.out.print("\nEnter the m3");
       m3=Integer.parseInt(din.readLine());
       System.out.print("\nEnter the m4");
       m4=Integer.parseInt(din.readLine());
       System.out.print("\nEnter the m5");
       m5=Integer.parseInt(din.readLine());
       
       calculate();
    }
 public void Show()
   {
         System.out.print("\nSNo\t\t"+sno);
         System.out.print("\nName\t\t"+name);
         System.out.print("\nTotal\t\t"+tot);
         System.out.print("\nAvrg\t\t"+avrg);
         System.out.print("\nResult\t\t"+result);

  }
};
class classPro2
{
   public static void main(String abc[]) throws Exception
     {
       Student s1=new Student();
         s1.getStuinfo();       
         s1.Show();
     }
}