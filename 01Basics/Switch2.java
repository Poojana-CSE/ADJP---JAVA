import java.io.*;
import java.util.*;
class Switch2
{
 public static void main(String abc[])
  {
    Character n1;
    Scanner inp= new Scanner(System.in);
    System.out.print("\nEnter any  Character: ");
    n1 =inp.next().toUpperCase().charAt(0);
    switch(n1)
    {
        case 'M': 
        {
            System.out.print("\nGood Morning");
            break;
        }
        case 'N': 
        {
            System.out.print("\nGood After Noon");
            break;   
        }     
        case 'E': 
        {
            System.out.print("\nGood Evening");
            break;
        }
        case 'X': 
        {
            System.out.print("\nGood Night");
            break;
        }
        default:
        {
            System.out.print("\nGood Bye");
        } 
    }
  }
}   