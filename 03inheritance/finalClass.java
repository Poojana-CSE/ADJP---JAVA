import java.io.*;
final class sample
{
    public void ShowMessage()
     {
       System.out.print("\nThis is an final class method");
     }
}
class test //extends sample Note: we can't inherit a  final class
{
    public void WelcomeMessage()
     {
       System.out.print("\nWelcome to final C lass");
     }
}
class finalClass
{
   public static void main(String abc[])
      {
         sample s1=new sample();
         test t1=new test();

          s1.ShowMessage();
          t1.WelcomeMessage();
      }
}
