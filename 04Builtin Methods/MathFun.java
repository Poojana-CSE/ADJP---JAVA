import java.io.*;

class Mathfun
{
  public static void main(String a[])
   {
       	System.out.println("\nThe Absolute Value of -99 is : " + Math.abs(-99));
	System.out.println("\nThe Ceil Value of 9.7 is : " + Math.ceil(9.7));
	System.out.println("\nThe Ceil Value of 9.1 is : " + Math.ceil(9.1));
	
	System.out.println("\nThe Floor Value of 9.7 is : " + Math.floor(9.7));
	System.out.println("\nThe Floor Value of 9.1 is : " + Math.floor(9.1));

	System.out.println("\nThe Maximum value of 15,99 is : " + Math.max(15,99));
	System.out.println("\nThe Minimum value of 15,99 is : " + Math.min(15,99));
  System.out.println("\nThe Rounded value of 100.56541 is : " + Math.round(100.56541));
  System.out.println("\nThe Rounded value of 100.56541 is : " + Math.round(100.568));

        System.out.println("\nRandom Number : " +Math.random());
        
	System.out.println("\nSqr Root of 25 is : " + Math.sqrt(25));
        System.out.println("\nThe PI Value is : " + Math.PI);
        System.out.println("\nCos Value of 30 : "+Math.cos(0));
        System.out.println("\nSin Value of 30 : "+Math.sin(90));
        System.out.println("\ntan Value of 30 : "+Math.tan(45));
        System.out.println("\nLog value of 10 is : "+Math.log10(10));
        System.out.println("\nThe 9 power 4 is : " + Math.pow(9,4));
   }
 }