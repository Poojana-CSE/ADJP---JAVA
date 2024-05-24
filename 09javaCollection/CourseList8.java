    import java.util.*;  
    class CourseList8
   {  
     public static void main(String args[])
     {  
      //add()
      //addAll()
      //remove()
      //removeAll()
      // clear()
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

       System.out.println(list1.get(4));  
      list1.set(4,"Tally ");
      Iterator itr=list1.iterator();  

      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }  
     }  
    }  