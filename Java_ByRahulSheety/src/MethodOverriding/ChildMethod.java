package MethodOverriding;

public class ChildMethod extends Parentmethod{

	public void features()
	{
		System.out.println("Hyndia have best features");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildMethod c = new ChildMethod();
		c.body();
		c.engine();
		c.features();
	}

}
