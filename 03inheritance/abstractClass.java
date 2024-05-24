import java.io.*;
abstract class sample
{
    public void ShowMessage()
     {
       System.out.print("\nThis is an abstract class method");
     }
}
class test extends sample
{
    public void WelcomeMessage()
     {
       System.out.print("\nWelcome to Abstract Class");
     }
}
class abstractClass
{
   public static void main(String abc[])
      {
       //  sample s1=new sample();
         test t1=new test();

          t1.ShowMessage();
          t1.WelcomeMessage();
      }
}