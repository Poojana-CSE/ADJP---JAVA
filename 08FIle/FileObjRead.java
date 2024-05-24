import java.io.*;
import java.io.File.*;
class FileObjRead
{
 public static void main(String argv[]) throws IOException
   {
     FileInputStream fin = new FileInputStream("Stu.txt");

  try
  { ObjectInputStream in = new ObjectInputStream(fin);

     Student s1 = (Student) in.readObject();
     s1.Show();

     Student s2 = (Student) in.readObject();
     s2.Show();

     Student s3 = (Student) in.readObject();
     s3.Show();

     Student s4 = (Student) in.readObject();
     s4.Show();
}
catch(Exception e)
{}
    
   }

}

          
                      
