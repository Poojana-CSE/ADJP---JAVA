    import java.util.*;  
    class CourseHasSet5
    {  
     public static void main(String args[])
     {
      //add()
      //addAll()
      //remove()
      //clear()
      //contains()
      //isEmpty()
      //size()

      HashSet list1=new HashSet();
      list1.add("HDCA");  
      list1.add("HDCP");  
      list1.add("DCA");  
      list1.add("DTP");  
      list1.add("ADCP");  
      list1.add("ADJP");
      list1.add(".NET");      

      Iterator<String> itr=list1.iterator();  

       while(itr.hasNext())
       {  
         System.out.println(itr.next());  
      }  
     }  
    }  