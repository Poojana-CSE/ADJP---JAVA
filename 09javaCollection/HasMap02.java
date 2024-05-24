import java.util.HashMap;
import java.util.Map;
public class HasMap02
 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("Erode", 1000);
		map.put("Salem", 1000);
		map.put("Namakkal", 1002);
		map.put("Karur", 1003);
		map.put("Tirupur", 1004);
		map.put("Coimbaore", 1005);
		System.out.println("Size of map is:-"+ map.size());
		System.out.println(map);
		
		map.put("Salem",1006); //update
		map.remove("Namakkal");
		for (Map.Entry <String, Integer> e : map.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		
		System.out.println("Mappings of HashMap map are : "+ map);

		if(map.containsKey("Erode"))
			System.out.println("Erode is Found in the List"); 
		else
			System.out.println("Erode is Not Found in the List"); 

		if(map.containsValue(1002))
			System.out.println("Namakkal is Found in the List"); 
		else
			System.out.println("Namakkal is Not Found in the List"); 

		if(map.isEmpty())
			System.out.println("There is no list found in the HasMap");
		else
				System.out.println("List available in the HashMap are : "+ map);

	}
}