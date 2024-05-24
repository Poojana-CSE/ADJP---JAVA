import java.util.*;  
    class ArrayList01
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
      list1.add("Orange");
      list1.add("Apple");  
      list1.add("Mango");  
      list1.add("Grapes");  
      list1.add("Straw berry");  
      list1.add("Guava");
      list1.add("Pappaya");
      list1.add("Blueberry");

      ArrayList<String> list2=new ArrayList<String>();
      list2.add("Banana");
      list2.add("Kiwi");  
      list2.add("Apple");  
      list2.add("Pomegranate");  
      list2.add("Dates");  
      list2.add("Avacado");
      list2.add("cucumber");  

      list1.addAll(list2);
     System.out.print("\n=============List All ==================\n");
      Iterator itr=list1.iterator();  
      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }

      list1.remove("Apple");
    System.out.print("\n=============After Remove Apple==================\n");      
       itr=list1.iterator();  
      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }

      ArrayList<String> list3=new ArrayList<String>();
      list3.add("Dates");
      list3.add("Avacado");  
      list3.add("Cucumber");  
      list1.removeAll(list3);
      System.out.print("\n========After Remove All=======================\n");     
      itr=list1.iterator();  

      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }
      System.out.print("\n=============After retainAll==================\n");
      list1.retainAll(list2);

     itr=list1.iterator();  

      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      } 
      
    System.out.println("list1 : "+ list1.get(1));
    list1.set(4,"Green Apple");

System.out.print("\n===========After Inserting Green Apple ====================\n");
    itr=list1.iterator();  

      while(itr.hasNext())
      {  
       System.out.println(itr.next());  
      }     
    } 
    } 