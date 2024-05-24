class StringDemo
{
  public static void main(String abc[])
   {
     String s1="CSC Computer Education Perundurai";
     String s2="Welcomes you";
      System.out.println("\nLength of s1 is :"+ s1.length());
      System.out.println("\nIndex of 'u' in s1 is :"+ s1.indexOf('u'));
      System.out.println("\nIndex of 'u' in s1(after 10th index) is :"+ s1.indexOf('u',10));
      System.out.println("\nIndex of 'CSC' in s1 is :"+ s1.indexOf("CSC"));
      System.out.println("\nIndex of 'u' in s1 from last is :"+ s1.lastIndexOf('u'));
      System.out.println("\nThe char at 10th index :"+ s1.charAt(10));
      System.out.println("\nSubstring from 10 index in s1 is :"+ s1.substring(10));
      System.out.println("\nSubstring from 4th to 12th index in s1 is :"+ s1.substring(4,12));
      System.out.println("\nConcatenate Branch with s1 : "+ s1.concat(" Branch") );
      System.out.println("\nIs s2 equals welcomes you is : " + s2.equals("welcomes you"));
      System.out.println("\nIs s2 equals(ignore case) welcomes you is : " + s2.equalsIgnoreCase("welcomes you"));
      System.out.println("\ns1 in small letter :" + s1.toLowerCase());
      System.out.println("\ns1 in Capital letter :" + s1.toUpperCase());
      s2=s2.replace("Welcomes","hearty Welcomes");
      System.out.println("\ns2 After Replace:" + s2);
      String s3="       hey    ";
      System.out.println("\n The Length of s3(before trim) is :"+ s3.length());
      s3=s3.trim();  
      System.out.println("\n The Length of s3(after trim) is :"+ s3.length());
      
}
}