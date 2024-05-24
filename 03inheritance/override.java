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
    public void displaymsg()
     { 
        System.out.print("\nSub class method welcomes you"); 
       super.displaymsg();
     }
};

class override
{
    public static void main(String abc[])
      {
        ClassB b1=new ClassB();        
        b1.displaymsg();
      }
}