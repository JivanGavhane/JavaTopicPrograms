package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		hm.put(1, "Jivan");
		hm.put(2, "Gavhane");
		hm.put(42, "Akanksha");
		hm.put(43, "evening");
		
		System.out.println(hm.get(42));
		
		hm.remove(43);
		
		
		//Convert hashMap to Set
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			//have to do it becuase we have to capture Key Value pair values
			Map.Entry MP = (Map.Entry)it.next();
			System.out.println(MP.getKey());
			System.out.println(MP.getValue());
		}
		
		
	}

}
