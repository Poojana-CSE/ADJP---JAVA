import java.util.HashMap;
class HasMap01
 {
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap();
		map.put("Erode", 1000);
		map.put("Salem", 1000);
		map.put("Namakkal", 1002);
		map.put("Karur", 1003);
		map.put("Tirupur", 1004);
		map.put("Coimbaore", 1005);
		System.out.println("Size of map is:- "+ map.size());
		System.out.println(map);
		if (map.containsKey("Erode"))
		 {
			Integer a = map.get("Erode");
			System.out.println("value for key"+ "\"Erode\"is:- " + a);
		}
	}
}