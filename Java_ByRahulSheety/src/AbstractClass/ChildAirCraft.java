package AbstractClass;

public class ChildAirCraft extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildAirCraft c = new ChildAirCraft();
		c.SaftyRules();
		c.engine();
		c.colour();
		
		//ParentAirCraft p = new ParentAirCraft();  // you are not able to create object with abstract class
	}

	//child class forced to implement abstract method of parent class
	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("I want my Aircraft chakachak whith new colour");
	}

}
