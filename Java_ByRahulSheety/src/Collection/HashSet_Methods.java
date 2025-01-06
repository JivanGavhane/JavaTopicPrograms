package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Methods {

	//HashSet, TreeSet,LinkedHashset implements theset interface
	//does not accept duplicate values
	//There is no guarentee element stored in sequential order ..Random order will get selected
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		//1.Add
		hs.add("Jivan");
		hs.add("Manohar");
		hs.add("Gavhane");
		hs.add("Jivan");   // duplicate values did not consider
		hs.add("he");
		hs.add("She");
		
		System.out.println(hs);
		
		//2.remove
		hs.remove("Manohar"); // remove the filed
		System.out.println(hs);
		
		//3.IsEmpty
		System.out.println(hs.isEmpty());
		
		//4.Size
		System.out.println(hs.size());
		
		//5.contains
		System.out.println(hs.contains("Jivan"));
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
