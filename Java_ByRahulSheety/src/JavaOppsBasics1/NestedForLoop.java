package JavaOppsBasics1;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		int k = 1;
		for(int i=0; i<=4; i++)
		{	
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(" "+k);
				k++;
			}
			System.out.println("");
		}
		
		
		*/
		
		/*
		int k = 1;
		for(int i=1; i<=4; i++)
		{	
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+k);
				k++;
			}
			System.out.println("");
		}
		
		*/
		
		for(int i=1; i<=4; i++)
		{	
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("");
		}
		
		
	}

}