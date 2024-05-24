    import java.util.*;  
    class CourseList1
    {  
     public static void main(String args[])

     {  
      ArrayList<String> list=new ArrayList<String>();
      list.add("HDCA");
      list.add("HDCP");  
      list.add("DCA");  
      list.add("DCP");  
      list.add("Tally");  
      list.add(".Net");
      list.add("J2EE");
      list.add("Hardware & Networking");
      ListIterator itr=list.listIterator();  
     while(itr.hasNext())  
       System.out.println(itr.next());  

      while(itr.hasPrevious())  
       System.out.println(itr.previous());  
      }  
     }  
      