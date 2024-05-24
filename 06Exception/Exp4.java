import java.io.*;
class Exp4
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
     catch(ArrayIndexOutOfBoundsException abe)
       {
         System.out.print("Please Pass Two Integer Values as Command Line Arquement");	
         System.out.print("\nSystem Generated Error : " + abe.getMessage());	        
       }
     catch(ArithmeticException ae)
       {
        System.out.print("You are trying to Dived a number by Zero");	

        System.out.print("\nSystem Generated Error : " + ae.getMessage());
        System.out.print("\n -----------------------------------\n");	
	      ae.printStackTrace();

       }
     catch(NumberFormatException fe)
       {
        System.out.print("The Command line arquement values should be Integer");	
        System.out.print("\nSystem Generated Error : " + fe.getMessage());	        
       }
     finally
       {
        System.out.print("This program has used Exception Handling");	
       }

     System.out.print("\n Arithmetic operation Completed Successfully");

   }

}