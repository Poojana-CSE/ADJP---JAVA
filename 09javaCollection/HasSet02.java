import java.util.HashSet;
import java.util.*;
class HasSet02
{
  public static void main(String[] args) throws Exception
   {
    
    HashSet<String> StateList = new HashSet<String>();
    Scanner sc=new Scanner(System.in);
    String St;

    StateList.add("Tamilnadu");
    StateList.add("Puducheri");    
    StateList.add("Kerala");
    StateList.add("Karnataka");
    StateList.add("AndraPradesh");
    StateList.add("Telungana");

    System.out.println("\nEnter the State Name:");
    St=sc.next();
      if(StateList.contains(St))
        System.out.println("\n The State Name already Exits.");
      else
        StateList.add(St);
   
    System.out.println(StateList);

    ArrayList<String> list=new ArrayList<String>();
   
    String lst;
    System.out.println("Please Enter States List (Type 'End' to Save the List");
     while(!(lst=sc.next()).equals("end"))
        list.add(lst);
    
    StateList.addAll(list);  

    System.out.println(StateList);
    StateList.remove("Goa");
    System.out.println("\nTotal States Found in the List : " + StateList.size());
    StateList.clear();
    System.out.println("\nTotal States Found in the List : " + StateList.size());
    }
}