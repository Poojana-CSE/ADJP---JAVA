import java.io.*;
class Exp1
{
  public static void main(String ar[])
   {
     int a,b,c;
         a=Integer.parseInt(ar[0]);
         b=Integer.parseInt(ar[1]);
     try
       {
         c=a/b;
         System.out.print("\na/b value is : " + c);
       }
     catch(ArithmeticException ae)
       {
         System.out.print("You are try to divide a number by Zero, Please try with valid Numbers");	
       }
     System.out.print("\n Arithmetic operation Completed Successfully");

   }

}