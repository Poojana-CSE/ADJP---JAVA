import java.util.*;
class sams
{
	public static void main(String abc[])
	{
		HashSet set = new HashSet();
		set.add("KEC");
		set.add("NEC");
		set.add("KPC");
		set.add("MPM");
		set.add("SEC");
		set.add("EXC");
		set.add("KMC");
		set.add("RNC");
		Iterator<String> itr =set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}