package Interface;

public class IndianTrafic implements CentralTrafic,ContinetalTrafic{


	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go Baby Go");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop Baby Stop");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Wait Baby Wait");
	}
	
	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("When you see tain sysmbol you should stop");
	}
	
	public void OwnRule() {
		System.out.println("Hum kese bhi chaliye humari marzi");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTrafic c = new IndianTrafic();
		c.GreenGo();
		c.redStop();
		c.FlashYellow();
		
		ContinetalTrafic con = new IndianTrafic();
		con.TrainSymbol();
		
		IndianTrafic i = new IndianTrafic();
		i.OwnRule();
	}

	

}
