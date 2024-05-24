import java.io.*;
class Inte1 implements Format1,Format2
{
  public String StrFormat(String s1)
   {
     s1=s1.trim();
     s1=s1.toUpperCase();
     return s1;
   }
  public String StrFormat(String s1,String s2)
   {
     String s3;
     s1=s1.trim();
     s2=s2.trim();
     s3=s1 + " " +s2;
    return s3;
   } 
public void NumFormat(int n1)
   { }  
}
class Interface1
{
  public static void main(String abc[])
   {
    Inte1 i=new Inte1();
    String str1,str2;
    str1=i.StrFormat("   csc   ");
    str2=i.StrFormat("   Computer  ","  Education");

    System.out.print("\nThe String 1 is :"+str1);
    System.out.print("\nThe String 2 is :"+str2);
   }
}