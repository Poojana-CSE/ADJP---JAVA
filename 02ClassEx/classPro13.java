import java.io.*;
class Sample
{
   public void DisplayAddress()
    {
       System.out.println("CSC Computer Education \n Perundurai");
    }

   public void DisplayAddress( String addr)
    {
       System.out.println("\n"+addr);
    }
   public void DisplayAddress( String addr,int n)
    {
       for(int i=1;i<=n;i++)
        System.out.println("\n"+addr);
    }

};
class classPro13
{
   public static void main(String abc[])
     {
       Sample s1=new Sample();
       s1.DisplayAddress();   
       s1.DisplayAddress("First Floor, Amman Complex, Opp New Bus Stand, Perundurai,erode,tamilnadu,India,Asia,Earth,solar system,milkyway galaxy");
           
       s1.DisplayAddress("Welcome Back",5);    
     }
     
}