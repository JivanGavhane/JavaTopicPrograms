package Arrays;

public class LogicProgramMultipArray {

	//search a minimum number in multi array and search maximum number in same row
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] abc = {{3,7,5},{5,8,9},{4,0,1}};
		
		
		// 1. for find minimum number in matrix
		int min = abc[0][0];
		int col = 0;
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<3; j++)
			{
				if(abc[i][j] < min)
				{
					min = abc[i][j];
					col = j;         // column number which contains min number
				}
			}
		}
		
		System.out.println(min);
		System.out.println(col);
		
		//find the maximum number in that perticular column
		
		int max = abc[0][col];
		int k = 0;
		while(k < 3)
		{
			if(abc[k][col] > max)
			{
				max = abc[k][col];
			}
			k++;
		}
		
		System.out.println("Maximum number in perticular column is"+ max);
	}

}
