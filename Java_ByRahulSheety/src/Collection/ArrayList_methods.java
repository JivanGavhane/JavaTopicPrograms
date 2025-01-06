package Collection;

import java.util.ArrayList;

public class ArrayList_methods {

	// can accept duplicate values 
	//ArraList,LinkedList,vector- Implementing List interface 
	//array have fixed size where as arraylist can grow dynamically 
	//you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.add
		ArrayList<String> a = new ArrayList<String>();
		a.add("Jivan");
		a.add("Selenium");   // Add element
		a.add(0, "Java");    // Add element at specific location
		
		System.out.println(a);
		
		//2.remove
		//a.remove(0);  // remove frpm specific index
		//a.remove("Selenium"); // remove using text name or values
		//a.removeAll(a); // remove all values form list
		
		//System.out.println(a);
		
		//3.contains
		System.out.println(a.contains("Jivan")); // return true or false 
		
		//4.indexOf
		System.out.println(a.indexOf("Jivan"));
		
		//5.isEmpty
		System.out.println(a.isEmpty());
		
		//6.size
		System.out.println(a.size());
	}

}
