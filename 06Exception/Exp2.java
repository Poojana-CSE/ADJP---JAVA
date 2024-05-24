import java.io.*;
class Exp2
{
  public static void main(String ar[])
   {
     int a,b,c;
     
     try
       {
         a=Integer.parseInt(ar[0]);
         b=Integer.parseInt(ar[1]);
         c=a/b;
         System.out.print("\na/b value is : " + c);
       }
     catch(ArithmeticException ae)
       {
        System.out.print("You are trying to Dived a number by Zero");	
       }
     catch(NumberFormatException ae)
       {
        System.out.print("Please Give Integer Numbers only"); 
       }
      catch(ArrayIndexOutOfBoundsException ae)
       {
        System.out.print("Please Pass two integer values as command line argument");  
       }
     catch(Exception e)
       {
        System.out.print("Unknown Error Please Reenter proper Data"); 
       }
     System.out.print("\n Arithmetic operation Completed Successfully");
   }
}