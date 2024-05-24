import java.io.*;                                                                   
class Abc
{
   private int n1=100,n2=500;

   public void display()
    {
       System.out.print("\n n1 value is : " +n1);
       System.out.print("\n n2 value is : " +n2);
    }

   public void display(int n1,int n2)
    {
       System.out.print("\n n1 value is : " +n1);
       System.out.print("\n n2 value is : " +n2);
       System.out.print("\n Class variable n1  value is : " +this.n1);
       System.out.print("\n Class variable n2  value is : " +this.n2);              
    }

}
class thisdemo
{
  public static void main(String abc[])
    {
         Abc t=new Abc();
         t.display();
         t.display(250,350);
    }
}