package JavaOppsBasics1;

public class Do_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use of do while loop is loop execute at least once

		int j = 10;
		
		do {
			System.out.println(j);
		}while(j>20);  // condition false but it will get execute once because of do 
		
		
		System.out.println("===============================");
		
		int i = 11;
		do {
				
		System.out.println(i);
		i++;
		}while(i<=20);  // condition true it will get execute till condition get's false
	}

}
