import java.util.*;  
class TreeSet1
{  
 public static void main(String args[])
 {  
  TreeSet<String> Courses=new TreeSet<String>();  
  Courses.add("HDCA");
  Courses.add("HDCP");  
  Courses.add("DCA");  
  Courses.add("DCP");
  Courses.add("DJP");  
    Courses.headSet("HDCA");
    //Courses.subSet("HDCA","Windows");  
    Courses.add("MSOffice");  
    Courses.add("C");  
    Courses.add("C++");  
    Courses.add("VisualBasic");  
    Courses.add("SQLServer");  

    Courses.headSet("HDCP");
    //Courses.subSet("HDCP","C");  
    Courses.add("C++");  
    Courses.add(".Net");  
    Courses.add("PHP");  
    Courses.add("My SQL");  
    Courses.add("APACHE");  
  
    /*Courses.headSet("DCA");
    Courses.subSet("DCA","C");  
    Courses.subSet("DCA","C++");  
    Courses.subSet("DCA","Windows");  
    Courses.subSet("DCA","Ms Office");  
    Courses.subSet("DCA","Internet");
  
    Courses.headSet("DCP");
    Courses.subSet("DCP","C");  
    Courses.subSet("DCP","C++");  
  
    Courses.headSet("DJP");
    Courses.subSet("DJP","C");  
    Courses.subSet("DJP","C++");  
    Courses.subSet("DJP","Java");  
    Courses.subSet("DJP","Servlets");  
    Courses.subSet("DJP","HTML-JavaScript "); */

  //Traversing elements  
  Iterator<String> itr=Courses.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  

  System.out.println("Lowest Value: "+Courses.pollFirst());    
  System.out.println("Highest Value: "+Courses.pollLast());  

  System.out.println("All Courses: "+Courses);
 
 }  
}  