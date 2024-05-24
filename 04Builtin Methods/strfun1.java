import java.io.*;
class strfun1
{
  public static void main(String a[])
    {
	String s1="Welcome to CSC computer Education";
    String s2="Perundurai";
	System.out.println(s1.charAt(6));
	System.out.println(s1.indexOf('e'));
	System.out.println(s1.indexOf('e',3));
	System.out.println(s1.indexOf("com"));
	System.out.println(s1.indexOf("com",10));

	System.out.println(s1.lastIndexOf('t'));
	System.out.println(s1.lastIndexOf('t',24));
	System.out.println(s1.lastIndexOf("com"));
	System.out.println(s1.lastIndexOf("com",14));

	System.out.println(s1.length());
	System.out.println(s2.compareTo("perundurai"));	
	System.out.println(s2.compareToIgnoreCase("perundurai"));
	s2=s2.concat(".638052");	
	System.out.println(s2);
	System.out.println(s1.endsWith("Education"));
	System.out.println(s1.startsWith("Welcome"));
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,8));
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.trim());

    }

}