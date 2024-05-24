import java.io.*;

class Student  implements Serializable
{
        int RollNo;
        String Name, Degree;
        float Perc;

       public Student(int RollNo, String Name, String Degree, float Perc)
        {
                this.RollNo = RollNo;
                this.Name = Name;
                this.Degree = Degree;
                this.Perc = Perc;
         }

        public void Show()
        {
                System.out.println("RollNo : "  + RollNo);
                System.out.println("Name   : "  + Name);
                System.out.println("Degree : "  + Degree);
                System.out.println("Perc   : "  + Perc);
        }
   }

class FileObjWrite
{
        public static void main(String argv[]) throws Exception
        {
                FileOutputStream fout = new FileOutputStream("Stu.txt");

                ObjectOutputStream obout = new ObjectOutputStream(fout);

                Student s1 = new Student(100,"Sakthi","MCA",80.45f);
                Student s2 = new Student(101,"Vishnu","ME",90.45f);
                Student s3 = new Student(102,"Srinath","BE",86.45f);
                Student s4 = new Student(103,"kavitha","MBA",92.45f);
                

                obout.writeObject(s1);
                obout.writeObject(s2);
                obout.writeObject(s3);
                obout.writeObject(s4);
                }
        }