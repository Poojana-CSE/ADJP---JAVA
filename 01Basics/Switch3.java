import java.io.*;
import java.util.*;
class Switch3
{
 public static void main(String abc[])
  {
    Character n1;
    Scanner inp= new Scanner(System.in);
    System.out.print("\nEnter any  Character: ");
    n1 =inp.next().toUpperCase().charAt(0);
    switch(n1)
    {
        case 'A': 
        case 'E': 
        case 'I': 
        case 'O': 
        case 'U':
        {
            System.out.print("\nGiven Character is a vowel");
            break;
        } 
        default:
        {
            System.out.print("\nGiven Character is NOT a vowel");
        } 
    }
  }
}   