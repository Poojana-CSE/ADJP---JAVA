package Convert;
import java.io.*;
public class Conv
{
  public static String Convert(String ch,float n)
   {
     float res=0.0F;
     ch=ch.trim();
     ch=ch.toUpperCase();
     
     if(ch.equals("CF"))
     {
      res=n/30.0F;
      return(n+ "Cm ="+ res + "Feet");
     }
     else if(ch.equals("FI"))
     {
      res=n*12.0F;
      return(n +"Feet = " + res + " Inches");
     }
     else
     {
      return("*****");
     }
   }
};