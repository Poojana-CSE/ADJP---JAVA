    import java.util.*;  
    class CourseHasSet3
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
      //get()
      //set()
      HashSet list1=new HashSet();
      list1.add("Erode");  
      list1.add("Coimbatore");  
      list1.add("Salem");  
      list1.add("Tirupur");  
      list1.add("Karur");  
      list1.add("Namakkal");
      list1.add("Ooty");     

      HashSet list2=new HashSet();
      list2.add("Trichy");  
      list2.add("Madurai");  
      list2.add("Chennai");  
      list2.add("Kovilpatti");  
      list2.add("Krishnagiri");
      list2.add("Karur");       
 
      list1.clear();
      list1.addAll(list2);     
      Iterator<String> itr=list1.iterator();  

       while(itr.hasNext())
       {  
         System.out.println(itr.next());  
      }  
     }  
    }  