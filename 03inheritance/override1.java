import java.io.*;
class ClassA
{
    public void displaymsg()
     { 
        System.out.print("\nSuper class method welcomes you"); 
     }
};

class ClassB extends ClassA
{
    public void displaymsg(String s)
     { 
        System.out.print("\nSub class method welcomes you" + s); 
     }
};

class override1
{
    public static void main(String abc[])
      {
        ClassB  b1=new ClassB();

            b1.displaymsg();
            b1.displaymsg(" by CSC");

      }
}