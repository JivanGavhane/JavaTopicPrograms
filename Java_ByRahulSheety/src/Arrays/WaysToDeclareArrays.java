package Arrays;

public class WaysToDeclareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,10,15,20,25,30};
		
		/*
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		*/
		
		int[][] b = new int [2][3];
		b[0][0] = 5;
		b[0][1]  = 10;
		b[0][2] =  15 ;
		b[1][0] = 20 ;
		b[1][1] = 25 ;
		b[1][2]  = 30  ;
		
		
	   int [][] c = {{5,10,15},{20,25,30}};
	   
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   System.out.println(c[i][j]);
		   }
	   }
	}

}
