package MethodOverloading;

public class MethodOverload {

	//Method Overloading - Same multiple method names but different argument
	//either argument count should be different
	//argument data type should be different 
	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload m = new MethodOverload();
		m.getData(5);
		m.getData("Jivan");
		m.getData(5, 5);
	}

}
