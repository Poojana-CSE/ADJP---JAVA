import java.io.*;
class Welcome
{
  static class Msg
  {
    public static void WelcomeMsg()
    {
      System.out.print("Hearty Welcome to CSC Computer Education.");
    }
  }
   public void DisplayAddress()
    {
       System.out.println("CSC Computer Education\nPerundurai");
    }

   public static void MyAddress(String addr)
    {
       System.out.println(addr);
    }
};
class classPro12
{
   public static void main(String abc[])
     {
       Welcome s1=new Welcome();
       s1.DisplayAddress();   

       Welcome.MyAddress("First Floor, Amman Complex, Opp New Bus Stand, Perundurai");    
       Welcome.Msg.WelcomeMsg();
     }
}