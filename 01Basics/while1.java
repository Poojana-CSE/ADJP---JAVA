import java.io.*;
import java.util.*;
class while1
{
 public static void main(String abc[])
  {
    int n1;
    Scanner inp= new Scanner(System.in);
    System.out.print("\nEnter any  Number: ");
    n1 =inp.nextInt();
    int i=1;
    while(i<=n1)
      {
        System.out.print("\nThe value of i is : "+ i);
        i++;
      }

    System.out.print("\nwhile loop executed");
  }
}