package AbstractClass;

public abstract class ParentAirCraft {

	//Abstraction is a process hiding the implementation details from the user and only the functionality will be provided by the user
	//In other words The User will have the information on what the object does instead of how it does it.
	
	public void engine()
	{
		System.out.println("Engine is very powerfull");
	}
	
	public void SaftyRules()
	{
		System.out.println("Safty rules should get followed");
	}
	
	public abstract void colour();

	
	//1.Interface contains only abstract method //1.Abstract class contains abstract class as well as concreat methods
	//2.Access Specifier for interface is public //2. Access specifier for abstract class is public and protected
	//3.variable must be public,static, final //3.Except private variable can ahve any access specifier
	//4.To implement interface we use impliments keyword //4.To implement abstract class we use extends keyword.
	
}
