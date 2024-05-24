    import java.util.*;  
    class CourseHasSet4
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

      if(list1.contains("Erode"))
          {
            System.out.println("\nErode Already Exists");
          }

      if(list1.contains("Chennai"))
          {
            System.out.println("\nChennai Already Exits");
          }
         else
          {
            list1.add("Chennai");
            System.out.println("\nChennai added in Place List");
          }

         if(list1.isEmpty())
            {
             System.out.println("\nThere are No items in Place List");
            }
          else
            {
             System.out.println("\nTotal Places Found in Place List : " + list1.size());              
            }

      Iterator<String> itr=list1.iterator();  

       while(itr.hasNext())
       {  
         System.out.println(itr.next());  
      }  
     }  
    }  