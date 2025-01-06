package Inheritance;

public class ChildClass extends ParentClass{

	public void engine()
	{
		System.out.println("Engine code is implemented");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		System.out.println(c.name);
		
		c.engine();
		c.gear();
		c.breaks();
		c.audioSystem();
	}

}
