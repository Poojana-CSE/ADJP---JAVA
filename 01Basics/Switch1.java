import java.io.*;
import java.util.*;
class Switch1
{
 public static void main(String abc[])
  {
    int n1;
    Scanner inp= new Scanner(System.in);
    System.out.print("\nEnter any Value: ");
    n1=inp.nextInt();
    switch(n1)
    {
        case 1: 
        {
            System.out.print("\nOne");
            break;
        }
        case 2: 
        {
            System.out.print("\nTwo");
            break;   
        }     
        case 3: 
        {
            System.out.print("\nThree");
            break;
        }
        case 4: 
        {
            System.out.print("\nFour");
            break;
        }
        case 5: 
        {
            System.out.print("\nFive");
            break;
        }                          
        default:
        {
            System.out.print("\nPlease Enter the Values betweem 1 and 5");
        } 
    }
  }
}   