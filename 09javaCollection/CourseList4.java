    import java.util.*;  
    class CourseList4
   {  
     public static void main(String args[])
     {  
      //add()
      //addAll()
      //remove()
      //removeAll()
      //retainAll()
      //get()
      //set()

      ArrayList<String> list1=new ArrayList<String>();
      list1.add("HDCA");
      list1.add("HDCP");  
      list1.add("DCA");  
      list1.add("DCP");  
      list1.add("Tally");  
      list1.add(".Net");
      list1.add("J2EE");
      list1.add("Hardware & Networking");

      ArrayList<String> list2=new ArrayList<String>();
      list2.add("ADJP");
      list2.add("ADCP");  
      list2.add("DOA");  
      list2.add("Tally");  
      list2.add("DTP");  
      list2.add("HDCA");
      list2.add("HDCP");  

      list1.retainAll(list2);  //  Intersection
      
      Iterator itr=list1.iterator();  

      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }  
     }  
    }  