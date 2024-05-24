import java.io.*;
class CustomException extends Exception
{
  private String msg;
  public CustomException(String ex)
   {
     msg="Serious Problem raised Please Contact your Administrator : " + ex;
   }
  public String toString()
   {
     return msg;
   }
};
class Calc
{
   public void Power(int n,int p)
     {
       try
        {
           if (p<0)
             {
                 throw new CustomException("Negative Power");
             }
             int power=1;
            for(int i=1;i<=p;i++)
             {
               power=power*n;
             }
          System.out.println("\nAnswer is : " + power);
        }   
     catch (Exception e)
        {
           System.out.print("\nUnknown Error : " + e.toString());
        }
     }
};
class throwExample
{
    public static void main(String abc[])
      {
           Calc c=new Calc();
            c.Power(10,5);
            c.Power(10,-5);
      }
}