    import java.util.*;  
    class CourseHasSet
    {  
     public static void main(String args[])
     {  
      HashSet set=new HashSet();
      set.add("Erode");  
      set.add("Coimbatore");  
      set.add("Salem");  
      set.add("Tirupur");  
      set.add("Karur");  
      set.add("Namakkal");
      set.add("Ooty");
      set.add("Erode");      
    
      Iterator<String> itr=set.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
     }  
    }  