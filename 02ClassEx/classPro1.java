import java.io.*;
class Sample
{
   public void DisplayAddress()
    {
       System.out.println("CSC Computer Education\nPerundurai");
    }
};
class Welcome
{
 public static void WelcomeMsg()
 {
 	System.out.print("\n Hearty Welcome to CSC Perundurai");
 }
};
class classPro1
{
   public static void main(String abc[])
     {
       Sample s1=new Sample();
       s1.DisplayAddress();       
       Welcome.WelcomeMsg();
     }
}